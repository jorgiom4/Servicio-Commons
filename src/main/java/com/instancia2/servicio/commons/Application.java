package com.instancia2.servicio.commons;

// import org.springframework.boot.SpringApplication; --> Quitamos el import al no usar SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Application {

	/*
	Quitamos el método main al tratarse de un proyecto de librerio y no de un aplicacón que se ejecute
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
	*/
}
