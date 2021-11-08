package com.github.jonki324.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment extends BaseEntity {

  @Column(name = "body")
  public String body;

  @Column(name = "author_id")
  public Long authorId;

  @ManyToOne
  @JoinColumn(name = "article_id", nullable = false)
  public Article article;

}
