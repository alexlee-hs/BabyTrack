package com.babytrackbackend.timelineview;

import com.babytrackbackend.timelineview.security.JwtConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(JwtConfig.class)
public class TimelineViewApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimelineViewApplication.class, args);
	}
}
