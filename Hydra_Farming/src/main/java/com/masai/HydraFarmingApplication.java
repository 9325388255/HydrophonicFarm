package com.masai;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2
public class HydraFarmingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HydraFarmingApplication.class, args);
	}

}
