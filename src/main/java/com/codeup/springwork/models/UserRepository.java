package com.codeup.springwork.models;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<Post, Integer> {
}
