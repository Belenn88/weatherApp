package com.weather.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weather.demo.services.WeatherService;

import entities.Board;
import entities.Location;

@RestController
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;

	@RequestMapping(value = "/boards/{username}/weather", method = RequestMethod.GET)
	public Board getBoard(@PathVariable String username) {
		
		return weatherService.getBoard(username);
	}
	
	@RequestMapping(value = "/boards/{username}", method = RequestMethod.POST)
	public ResponseEntity<?> setLocation(@PathVariable String username, @RequestBody Location location) {
		
		System.out.println("*****location: " + location.getName());
		return ResponseEntity.noContent().build();
	}
}