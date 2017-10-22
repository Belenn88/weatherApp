package entities;

import java.util.ArrayList;
import java.util.List;


public class Board {
	
	private String username;
	private List<Weather> cities;
	
	public Board(String username) {
		super();
		this.username = username;
		this.cities = new ArrayList<Weather>();
	}
	
	public void registerWeather(Weather weather) {
		this.cities.add(weather);
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * @return the cities
	 */
	public List<Weather> getCities() {
		return cities;
	}
	
	/**
	 * @param cities the cities to set
	 */
	public void setCities(List<Weather> cities) {
		this.cities = cities;
	}

}
