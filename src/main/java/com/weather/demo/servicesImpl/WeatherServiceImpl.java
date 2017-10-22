package com.weather.demo.servicesImpl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.demo.services.WeatherService;

import entities.Board;
import entities.Weather;

@Service("WeatherService")
public class WeatherServiceImpl implements WeatherService {

	@Override
	public Weather getWeather(String city) {

		RestTemplate restTemplate = new RestTemplate();
		Weather weather = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+ city +"&APPID=50d0ca435d634011eb4650d0c70c2bd6", Weather.class);
		
		weather.setName(city);
		//System.out.println(weather.toString());

		return weather;
	}

	@Override
	public Board getBoard(String username) {
		
		Board board = new Board(username);
		//getCitiesForAUsername
		
		//List<weather> cities;
		
		return null;
	}

}
