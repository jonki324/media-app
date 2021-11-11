package com.github.jonki324.service;

import com.github.jonki324.entity.Article;
import com.github.jonki324.entity.ArticleTag;
import com.github.jonki324.entity.Tag;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

@RequestScoped
public class ArticleService {

  public List<Article> getAll() {
    return Article.listAll();
  }

  public Article getById(Long id) {
    Optional<Article> optionalArticle = Article.findByIdOptional(id);
    var article = optionalArticle.orElseThrow(() -> new WebApplicationException(Status.NOT_FOUND));
    article.articleTags.forEach(articleTag -> article.tags.add(articleTag.tag));
    article.favoriteCount = article.favorites.size();
    return article;
  }

  @Transactional
  public Article create(Article article) {
    createTags(article.tags);
    article.persist();
    createArticleTags(article, article.tags);
    return article;
  }

  @Transactional
  public void update(Long id, Article article) {
    Optional<Article> optionalArticle = Article.findByIdOptional(id);
    var target = optionalArticle.orElseThrow(() -> new WebApplicationException(Status.NOT_FOUND));
    target.title = article.title;
    target.body = article.body;
    target.version = article.version;
    target.articleTags.forEach(articleTag -> ArticleTag.deleteById(articleTag.id));
    target.articleTags.clear();
    target.persist();
    createTags(article.tags);
    createArticleTags(target, article.tags);
  }

  @Transactional
  public void delete(Long id, Article article) {
    Optional<Article> optionalArticle = Article.findByIdOptional(id);
    var target = optionalArticle.orElseThrow(() -> new WebApplicationException(Status.NOT_FOUND));
    target.version = article.version;
    target.delete();
  }

  private void createTags(List<Tag> tags) {
    var newTags = tags.stream().filter(tag -> Objects.isNull(tag.id))
        .collect(Collectors.toList());
    if (newTags.size() > 0) {
      Tag.persist(newTags);
    }
  }

  private void createArticleTags(Article article, List<Tag> tags) {
    tags.forEach(tag -> {
      var articleTag = new ArticleTag();
      articleTag.article = article;
      articleTag.tag = tag;
      articleTag.persist();
    });
  }

}
