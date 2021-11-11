package com.github.jonki324.resource;

import com.github.jonki324.entity.Article;
import com.github.jonki324.service.ArticleService;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/articles")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ArticleResource {

  @Inject
  ArticleService articleService;

  @GET
  public List<Article> getAll() {
    return articleService.getAll();
  }

  @Path("/{id}")
  @GET
  public Article getById(@PathParam("id") Long id) {
    return articleService.getById(id);
  }

  @POST
  public Article create(Article article) {
    return articleService.create(article);
  }

  @Path("/{id}")
  @PUT
  public Article update(@PathParam("id") Long id, Article article) {
    articleService.update(id, article);
    return articleService.getById(id);
  }

  @Path("/{id}")
  @DELETE
  public void delete(@PathParam("id") Long id, Article article) {
    articleService.delete(id, article);
  }

}
