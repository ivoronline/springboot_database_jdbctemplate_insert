package com.ivoronline.springboot_database_jdbctemplate_insert.controllers;

import com.ivoronline.springboot_database_jdbctemplate_insert.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private MyService myService;

  //=========================================================================================================
  // INSERT
  //=========================================================================================================
  // Request             => http://localhost:8080/insert
  // Returns JSON Object => 1
  @ResponseBody
  @GetMapping("/insert")
  public int insert() {
    int    insertedRecords = myService.insert("Jill", 40);
    return insertedRecords;
  }

}
