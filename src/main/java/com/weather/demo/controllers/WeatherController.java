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
import entities.Weather;

@RestController
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;

	/**
	 * Returns a board with the weather for each city, for a user 
	 */
	@RequestMapping(value = "/boards/{username}/weather", method = RequestMethod.GET)
	public Board getBoard(@PathVariable String username) {
		
		return weatherService.getBoard(username);
	}
	
	/**
	 * Returns the weather, for a user 
	 */
	@RequestMapping(value = "/boards/{username}/weather/{location}", method = RequestMethod.GET)
	public Weather getLocation(@PathVariable String username, @PathVariable String location) {
		
		return weatherService.getWeather(location);
	}
	
	/**
	 * Saves a new city in a user's board
	 */
	@RequestMapping(value = "/boards/{username}", method = RequestMethod.POST)
	public ResponseEntity<?> setLocation(@PathVariable String username, @RequestBody Location location) {
		
		weatherService.newLocation(username, location);
		return ResponseEntity.noContent().build();
	}
}