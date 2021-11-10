package com.github.jonki324.resource;

import com.github.jonki324.entity.Favorite;
import com.github.jonki324.service.FavoriteService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/favorites")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FavoriteResource {

  @Inject
  FavoriteService favoriteService;

  @POST
  public Favorite create(Favorite favorite) {
    return favoriteService.create(favorite);
  }

  @DELETE
  public void delete(Favorite favorite) {
    favoriteService.delete(favorite);
  }

}
