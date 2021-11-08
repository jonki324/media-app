package com.github.jonki324.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "follows")
public class Follow extends BaseEntity {

  @Column(name = "user_id")
  public Long userId;

  @Column(name = "followed_user_id")
  public Long followedUserId;

}
