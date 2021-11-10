package com.github.jonki324.service;

import com.github.jonki324.entity.Tag;
import java.util.List;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class TagService {

  public List<Tag> getAll() {
    return Tag.listAll();
  }

}
