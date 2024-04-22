package com.bandcamp.scraper.bandcampscraper;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ScrapingService {
  public abstract void getPage(String url) throws IOException;
}
