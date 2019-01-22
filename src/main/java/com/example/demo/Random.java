package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Random {

	public double getRandomNumber() {
		return Math.random();
	}
}
