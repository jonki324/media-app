package com.github.jonki324.resource;

import com.github.jonki324.entity.Comment;
import com.github.jonki324.service.CommentService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/comments")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource {

  @Inject
  CommentService commentService;

  @POST
  public Comment create(Comment comment) {
    return commentService.create(comment);
  }

}
