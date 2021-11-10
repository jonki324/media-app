package com.github.jonki324.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "favorites")
public class Favorite extends BaseEntity {

  @Column(name = "user_id")
  public Long userId;

  @Transient
  public Long articleId;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "article_id")
  public Article article;

}
