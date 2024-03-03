package com.infosys.controller;

import java.util.Map;

//SpringBootController.java

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpringBootController {

 @PostMapping("/sendDataToNode")
 public String sendDataToNode(@RequestBody Map<String, String> data) {
     RestTemplate restTemplate = new RestTemplate();
     String nodeUrl = "http://localhost:3000/receiveData"; // Assuming Node.js server is running on localhost:3000
     restTemplate.postForObject(nodeUrl, data, String.class);
     return "Data sent to Node.js server";
 }
}

