package com.weather.demo.services;

import com.weather.demo.entities.Board;
import com.weather.demo.entities.Location;
import com.weather.demo.entities.Weather;


public interface WeatherService {
	
	public Weather getWeather(String city);
	
	public Board getBoard(String username);

	public void newLocation(String username, Location location);

}
