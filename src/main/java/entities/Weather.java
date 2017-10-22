package entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

	public Weather() {

	}

	private String name;
	private Main main;

	
	/**
	 * @return the main
	 */
	public Main getMain() {
		return main;
	}

	
	/**
	 * @param main the main to set
	 */
	public void setMain(Main main) {
		this.main = main;
	}


	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
