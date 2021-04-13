package com.bibliothequeBatch.bibliothequeBatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class BibliothequeBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliothequeBatchApplication.class, args);
	}

}
