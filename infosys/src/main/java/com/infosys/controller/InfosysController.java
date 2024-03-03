package com.infosys.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfosysController{
	 @PostMapping("/send-data")
	    public String receiveDataFromNode(@RequestBody Map<String, String> data) {
		 System.out.println("Received");
	        System.out.println(data);
	        
	        // Return a response (optional)
	        return "Data received successfully";
	    }
}
