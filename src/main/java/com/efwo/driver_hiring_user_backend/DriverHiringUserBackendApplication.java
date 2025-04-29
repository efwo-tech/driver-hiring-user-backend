package com.efwo.driver_hiring_user_backend;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DriverHiringUserBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverHiringUserBackendApplication.class, args);
	}

}
