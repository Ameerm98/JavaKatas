package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Objects;


public class URLShortenerTest {

    @Test
    public void testShortenLongUrl(){
        URLShortener shortener = new URLShortener();

        String longUrl = "https://www.example.com/some/really/long/url";
        String shortUrl = shortener.shorten(longUrl);

        assertTrue(shortUrl.length()<longUrl.length());
        assertEquals(shortener.retrieve(shortUrl), longUrl);
    }




}
