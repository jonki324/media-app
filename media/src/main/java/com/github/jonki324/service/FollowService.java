package com.github.jonki324.service;

import com.github.jonki324.entity.Follow;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

@RequestScoped
public class FollowService {

  @Transactional
  public Follow follow(Follow follow) {
    follow.persistAndFlush();
    return follow;
  }

  @Transactional
  public void unfollow(Follow follow) {
    Optional<Follow> optionalFollow = Follow.find("userId = ?1 and followedUserId = ?2",
        follow.userId, follow.followedUserId).firstResultOptional();
    var target = optionalFollow.orElseThrow(() -> new WebApplicationException(Status.NOT_FOUND));
    target.version = follow.version;
    target.delete();
  }

}
