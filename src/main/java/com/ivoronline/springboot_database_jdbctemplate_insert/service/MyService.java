package com.ivoronline.springboot_database_jdbctemplate_insert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // INSERT
  //=========================================================================================================
  public int insert(String name, Integer age) {
    return jdbcTemplate.update(
      " INSERT INTO PERSON (NAME, AGE) VALUES (? , ?)"   //Order of parameters is used => names are ignored
      , new Object[] { name, age }
    );
  }

}
