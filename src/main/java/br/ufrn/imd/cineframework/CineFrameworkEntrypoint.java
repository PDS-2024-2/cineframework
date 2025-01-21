package br.ufrn.imd.cineframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CineFrameworkEntrypoint {

	public static void main(String[] args) {
		SpringApplication.run(CineFrameworkEntrypoint.class, args);
	}

}
