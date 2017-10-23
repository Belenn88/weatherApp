package com.weather.demo.services;

import entities.Board;
import entities.Location;
import entities.Weather;


public interface WeatherService {
	
	public Weather getWeather(String city);
	
	public Board getBoard(String username);

	public void newLocation(String username, Location location);

}
