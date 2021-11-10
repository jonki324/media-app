package com.github.jonki324.resource;

import com.github.jonki324.entity.Follow;
import com.github.jonki324.service.FollowService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/follows")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FollowResource {

  @Inject
  FollowService followService;

  @POST
  public Follow follow(Follow follow) {
    return followService.follow(follow);
  }

  @DELETE
  public void unfollow(Follow follow) {
    followService.unfollow(follow);
  }

}
