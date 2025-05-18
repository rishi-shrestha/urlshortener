package com.example.ShortnerKing.service;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class UrlService {

	private HashMap<String,String> shortToLongMap = new HashMap<>();
	// key -> shortUrl, value -> longUrl
	private HashMap<String,String> longToShortMap = new HashMap<>();
	// key -> longUrl, value -> shortUrl
	
	public String shorten(String longUrl) {
		if(longToShortMap.containsKey(longUrl)) return "http://localhost:8080/"+longToShortMap.get(longUrl);
		int i = 1;
		while(true) {
			String shortUrl = Integer.toString(i);
			if(shortToLongMap.containsKey(shortUrl) == false) {
				shortToLongMap.put(shortUrl, longUrl);
				longToShortMap.put(longUrl, shortUrl);
				return "http://localhost:8080/"+shortUrl;
			}
			i++;
		}
	}
	
	public String expand(String shortUrl) {
		return shortToLongMap.get(shortUrl);
	}
}
