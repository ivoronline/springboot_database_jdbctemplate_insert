package com.ivoronline.springboot_database_jdbctemplate_insert.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // HELLO
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/hello")
  public int hello() {
    int    insertedRecords = insert("Jill", 40);
    return insertedRecords;
  }

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
