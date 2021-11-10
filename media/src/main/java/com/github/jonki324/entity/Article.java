package com.github.jonki324.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

  @OneToMany(mappedBy = "article", fetch = FetchType.EAGER)
  public Set<Comment> comments = new HashSet<>();

  @JsonIgnore
  @OneToMany(mappedBy = "article", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  public Set<ArticleTag> articleTags = new HashSet<>();

  @OneToMany(mappedBy = "article", fetch = FetchType.EAGER)
  public Set<Favorite> favorites = new HashSet<>();

}
