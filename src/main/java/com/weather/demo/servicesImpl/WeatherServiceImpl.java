package com.weather.demo.servicesImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.weather.demo.entities.Board;
import com.weather.demo.entities.Location;
import com.weather.demo.entities.Weather;
import com.weather.demo.services.WeatherService;

@Service("WeatherService")
public class WeatherServiceImpl implements WeatherService {

	MongoClientURI uri = new MongoClientURI("mongodb://belen:belencinha04@ds227035.mlab.com:27035/weatherdb");
	MongoClient client = new MongoClient(uri);
	MongoDatabase db = client.getDatabase(uri.getDatabase());

	@Override
	public Weather getWeather(String city) {

		RestTemplate restTemplate = new RestTemplate();
		Weather weather = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=50d0ca435d634011eb4650d0c70c2bd6", Weather.class);

		weather.setName(city);
		return weather;
	}

	@Override
	public Board getBoard(String username) {

		Board board = new Board(username);
		board.registerWeather(this.getWeather("laplata"));
		board.registerWeather(this.getWeather("buenosaires"));

		return board;
	}

	@Override
	public void newLocation(String username, Location location) {

		Weather newWeather = this.getWeather(location.getName());

		List<Document> seedData = new ArrayList<Document>();

		seedData.add(new Document("username", username).append(
				"cities",
				Arrays.asList(new Document("name", newWeather.getName()).append(
						"main",
						new Document("temp", newWeather.getMain().getTemp()).append("pressure", newWeather.getMain().getPressure())
								.append("humdity", newWeather.getMain().getHumidity()).append("temp_min", newWeather.getMain().getTemp_min())
								.append("temp_max", newWeather.getMain().getTemp_max())))));

		MongoCollection<Document> boards = db.getCollection("boards");

		boards.insertMany(seedData);

		// boards.drop();

		// client.close();
	}

}
// seedData.add(new Document("username", username).append(
// "cities",
// Arrays.asList(
// new Document("name", "laplata").append("main", new Document("temp",
// "282.2").append("pressure", "1021").append("humdity", "1021")
// .append("temp_min", "1021").append("temp_max", "1021")),
// new Document("name", "buenosaires").append("main", new Document("temp",
// "232.2").append("pressure", "1021").append("humdity", "1021")
// .append("temp_min", "221").append("temp_max", "121")))));
