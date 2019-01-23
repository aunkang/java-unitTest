package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RandomTest {
	@Spy Sort s;
	@InjectMocks Random r;
	
	@Before
	public void setup() {
		r.setProperties("5", "6");
	}
	
	@Test
	public void randomNumber() {
		r.getRandomNumber();
	}

}
