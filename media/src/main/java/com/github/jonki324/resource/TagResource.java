package com.github.jonki324.resource;

import com.github.jonki324.entity.Tag;
import com.github.jonki324.service.TagService;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tags")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TagResource {

  @Inject
  TagService tagService;

  @GET
  public List<Tag> getAll() {
    return tagService.getAll();
  }

}
