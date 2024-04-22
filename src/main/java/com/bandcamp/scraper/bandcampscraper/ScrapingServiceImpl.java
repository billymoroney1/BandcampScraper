package com.bandcamp.scraper.bandcampscraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ScrapingServiceImpl implements ScrapingService{

    @Override
    public void getPage(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        System.out.println("title: " + doc.title());
    }
}
