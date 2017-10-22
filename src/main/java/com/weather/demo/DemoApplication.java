package com.weather.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		
		MongoClientURI uri  = new MongoClientURI("mongodb://belen:belencinha04@ds227035.mlab.com:27035/weatherdb"); 
        MongoClient client = new MongoClient(uri);
        MongoDatabase db = client.getDatabase(uri.getDatabase());
        
		SpringApplication.run(DemoApplication.class, args);
	}
}
