package com.fusemachine.inventory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class InventoryManagementApplication {

	private static final Logger log = LoggerFactory.getLogger(InventoryManagementApplication.class);
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(InventoryManagementApplication.class);
    }

	public static void main(String[] args) {
		log.info("Application has started.");
		SpringApplication.run(InventoryManagementApplication.class);
	}


}