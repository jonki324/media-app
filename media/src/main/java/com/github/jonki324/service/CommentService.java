package com.github.jonki324.service;

import com.github.jonki324.entity.Article;
import com.github.jonki324.entity.Comment;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

@RequestScoped
public class CommentService {

  @Transactional
  public Comment create(Comment comment) {
    Optional<Article> optionalArticle = Article.findByIdOptional(comment.articleId);
    comment.article = optionalArticle.orElseThrow(
        () -> new WebApplicationException(Status.NOT_FOUND));
    comment.persistAndFlush();
    return comment;
  }

}
