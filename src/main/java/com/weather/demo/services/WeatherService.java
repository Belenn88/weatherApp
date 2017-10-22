package com.weather.demo.services;

import entities.Board;
import entities.Weather;


public interface WeatherService {
	
	public Weather getWeather(String city);
	
	public Board getBoard(String username);

}
