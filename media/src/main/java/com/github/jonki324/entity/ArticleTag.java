package com.github.jonki324.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "article_tags")
public class ArticleTag extends BaseEntity {

  @ManyToOne
  @JoinColumn(name = "article_id")
  public Article article;

  @ManyToOne
  @JoinColumn(name = "tag_id")
  public Tag tag;

}
