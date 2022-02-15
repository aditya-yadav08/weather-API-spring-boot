package com.weather.weatherappspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(WeatherAppProperties.class)
public class WeatherAppSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(WeatherAppSpringBootApplication.class, args);
	}

}
