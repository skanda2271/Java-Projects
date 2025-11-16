package com.skanda_practice.skanda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skanda_practice.skanda.dtoentity.RateLimiterSlidingWindow;

@SpringBootApplication
public class SkandaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkandaApplication.class, args);
		System.out.println("Hello");
		RateLimiterSlidingWindow rateLimiter = new RateLimiterSlidingWindow(3,60);
		System.out.println(rateLimiter.allowRequest("user1", 5));
		System.out.println(rateLimiter.allowRequest("user1", 15));
		System.out.println(rateLimiter.allowRequest("user1", 25));
		System.out.println(rateLimiter.allowRequest("user2", 5));
		System.out.println(rateLimiter.allowRequest("user1", 55));
		System.out.println(rateLimiter.allowRequest("user1", 65));
		
	}

}
