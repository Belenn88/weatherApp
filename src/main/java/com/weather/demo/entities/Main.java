package com.weather.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
	
	public Main() {
		
	}

	private Double temp;
	private Double pressure;
	private Double humidity;
	private Double temp_min;
	private Double temp_max;
	
	/**
	 * @return the temp
	 */
	public Double getTemp() {
		return temp;
	}
	
	/**
	 * @param temp the temp to set
	 */
	public void setTemp(Double temp) {
		this.temp = temp;
	}
	
	/**
	 * @return the pressure
	 */
	public Double getPressure() {
		return pressure;
	}
	
	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}
	
	/**
	 * @return the humidty
	 */
	public Double getHumidity() {
		return humidity;
	}
	
	/**
	 * @param humidty the humidty to set
	 */
	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}
	
	/**
	 * @return the temp_min
	 */
	public Double getTemp_min() {
		return temp_min;
	}
	
	/**
	 * @param temp_min the temp_min to set
	 */
	public void setTemp_min(Double temp_min) {
		this.temp_min = temp_min;
	}
	
	/**
	 * @return the temp_max
	 */
	public Double getTemp_max() {
		return temp_max;
	}
	
	/**
	 * @param temp_max the temp_max to set
	 */
	public void setTemp_max(Double temp_max) {
		this.temp_max = temp_max;
	}

}
//"main": {
//    "temp": 288.16,
//    "pressure": 1023,
//    "humidity": 51,
//    "temp_min": 287.15,
//    "temp_max": 289.15
//}
