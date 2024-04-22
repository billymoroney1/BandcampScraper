package com.bandcamp.scraper.bandcampscraper;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class BandcampScraperApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BandcampScraperApplication.class, args);
	}

	@Override
	public void run(String... args) throws IOException {
		ScrapingServiceImpl scrape = new ScrapingServiceImpl();
		scrape.getPage("https://bandcamp.com/billymoroney");
	}

}
