package com.github.jonki324.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "articles")
public class Article extends BaseEntity {

  @Column(name = "title")
  public String title;

  @Column(name = "body")
  public String body;

  @Column(name = "author_id")
  public Long authorId;

  @OneToMany(mappedBy = "article")
  public Set<Comment> comments;

  @OneToMany(mappedBy = "article")
  public Set<ArticleTag> articleTags;

  @OneToMany(mappedBy = "article")
  public Set<Favorite> favorites;

}
