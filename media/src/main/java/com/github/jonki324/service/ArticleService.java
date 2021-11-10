package com.github.jonki324.service;

import com.github.jonki324.entity.Article;
import java.util.List;
import java.util.Optional;
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
    article.persistAndFlush();
    return article;
  }

  @Transactional
  public Article update(Long id, Article article) {
    Optional<Article> optionalArticle = Article.findByIdOptional(id);
    var target = optionalArticle.orElseThrow(() -> new WebApplicationException(Status.NOT_FOUND));
    target.title = article.title;
    target.body = article.body;
    target.version = article.version;
    target.persistAndFlush();
    return target;
  }

  @Transactional
  public void delete(Long id, Article article) {
    Optional<Article> optionalArticle = Article.findByIdOptional(id);
    var target = optionalArticle.orElseThrow(() -> new WebApplicationException(Status.NOT_FOUND));
    target.version = article.version;
    target.delete();
  }

}
