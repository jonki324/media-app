package com.github.jonki324.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

@MappedSuperclass
public class BaseEntity extends PanacheEntityBase {

  @Id
  @GeneratedValue
  @Column(name = "id")
  public Long id;

  @Version
  @Column(name = "version")
  public Integer version;

  @Column(name = "created_at")
  public LocalDateTime createdAt;

  @Column(name = "updated_at")
  public LocalDateTime updatedAt;

  public BaseEntity() {
  }

  @PrePersist
  public void prePersist() {
    var dt = LocalDateTime.now();
    createdAt = dt;
    updatedAt = dt;
  }

  @PreUpdate
  public void preUpdate() {
    updatedAt = LocalDateTime.now();
  }

  @Override
  public String toString() {
    String className = this.getClass().getSimpleName();
    return className + "<" + this.id + ">";
  }

}
