package com.gopikrishna.Online_assessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OnlineAssessmentApplication {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	};
	public static void main(String[] args) {
		SpringApplication.run(OnlineAssessmentApplication.class, args);
	}

}
