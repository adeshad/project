package com.app;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//= @SringBoot Configuration _+@EnableAutoConfiguration +@ComponentScan(BasePackages="com.app")
public class Day17BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day17BootApplication.class, args);
	}
	@Bean // equivalent to <bean id ..../>  bean  tag in xml file
	
	public ModelMapper mapper() {
		// matching property strick : source 
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

}
