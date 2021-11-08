package com.github.jonki324.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tags")
public class Tag extends BaseEntity {

  @Column(name = "name", nullable = false)
  public String name;

  @OneToMany(mappedBy = "tag")
  public Set<ArticleTag> articleTags;

}
