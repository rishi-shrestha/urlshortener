package com.example.ShortnerKing.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ShortnerKing.service.UrlService;
import org.springframework.ui.Model;


@Controller
public class UrlController {
	@Autowired
	private UrlService urlService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/index.html")
	public String home() {
		return "index";
	}
	
	@PostMapping("/shorten")
	public String shortenUrl(@RequestParam String longUrl,Model model) {
		String shortUrl = urlService.shorten(longUrl);
		model.addAttribute("shortUrl",shortUrl);
		return "result";
	}
	
	@GetMapping("/{shortUrl}")
	public String redirect(@PathVariable String shortUrl,Model model) {
		String longUrl = urlService.expand(shortUrl);
		if(longUrl != null) {
			return "redirect:" + longUrl;
		}
		model.addAttribute("shortUrl","URL not found");
		return "result";
	}
		
		
	
}
