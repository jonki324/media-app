package com.github.jonki324.service;

import com.github.jonki324.entity.Article;
import com.github.jonki324.entity.Favorite;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

@RequestScoped
public class FavoriteService {

  @Transactional
  public Favorite create(Favorite favorite) {
    Optional<Article> optionalArticle = Article.findByIdOptional(favorite.articleId);
    favorite.article = optionalArticle.orElseThrow(
        () -> new WebApplicationException(Status.NOT_FOUND));
    favorite.persistAndFlush();
    return favorite;
  }

  @Transactional
  public void delete(Favorite favorite) {
    Optional<Favorite> optionalFavorite = Favorite.find("userId = ?1 and article_id = ?2",
        favorite.userId, favorite.articleId).firstResultOptional();
    var target = optionalFavorite.orElseThrow(() -> new WebApplicationException(Status.NOT_FOUND));
    target.version = favorite.version;
    target.delete();
  }

}
