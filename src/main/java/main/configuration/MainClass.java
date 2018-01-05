package main.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import main.service.ServiceClass;

@SpringBootApplication
@ComponentScan("main.*")
@EnableWebMvc
public class MainClass implements CommandLineRunner{

	@Autowired
	ServiceClass serviceClass;
	
	public static void main(String arg[]) {
		SpringApplication.run(MainClass.class, arg);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		serviceClass.getDatabaseRecords();
	}
}