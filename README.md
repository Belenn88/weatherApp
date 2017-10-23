# weatherApp
BackEnd application to check the weather

Save weather data for a city in a user profile:
POST http://localhost:8080/boards/Jacinto
body {"name": "buenosaires"}

Get weather data for a city in a user profile:
GET http://localhost:8080/boards/Pepi/weather/ushuaia

Get user's board with their cities:
GET http://localhost:8080/boards/Pepi/weather

Just run ./mvnw spring-boot:run
