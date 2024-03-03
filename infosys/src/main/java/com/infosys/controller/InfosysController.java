package com.infosys.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InfosysController{
	String capitalizedKey;
	 @PostMapping("/send-data")
	    public Map<String, String> receiveDataFromNode(@RequestBody Map<String, String> data) {
		 System.out.println("Received");
	        System.out.println(data);
	        
	 
	 Map<String, String> capitalizedData = new HashMap<>();
     for (Map.Entry<String, String> entry : data.entrySet()) {
         capitalizedKey = entry.getKey().toUpperCase();
         capitalizedData.put(capitalizedKey, entry.getValue());
     }
     System.out.println(capitalizedData);
     // Return the map with capitalized keys
     return capitalizedData;
	 }
}


