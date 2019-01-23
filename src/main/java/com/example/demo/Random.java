package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.test.util.ReflectionTestUtils;

import com.example.demo.pojo.Student;

@Component
public class Random {

    private String x;
    private String y;
	private Sort sort;
	
	@Autowired
	public Random(Sort sort) {
		this.sort = sort;
		System.out.println("setSort");
	}

	@Autowired
	public void setProperties(@Value("${x}") String x, @Value("${y}") String y ) {
		this.x = x;
		System.out.println(x);
		System.out.println(y);
	}
	public Random() {
		System.out.println("default");
	}

	public double getRandomNumber() {
		Student std = new Student();
		std.setAge(15);
		Student std2 = new Student();
		std2.setAge(25);
		Student[] xy = sort.sortByAgeAscending(new Student[]{std, std2});
		System.out.println(xy[1].getAge());
		System.out.println(x);
		return Math.random();
	}
}
