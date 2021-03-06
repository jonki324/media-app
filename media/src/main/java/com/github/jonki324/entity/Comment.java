package com.github.jonki324.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "comments")
public class Comment extends BaseEntity {

  @Column(name = "body")
  public String body;

  @Column(name = "author_id")
  public Long authorId;

  @Transient
  public Long articleId;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "article_id")
  public Article article;

}
