package com.example.demo.pojo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Random;

public class Student {
	
	private String studentId;
	private String firstName;
	private String lastName;
	private String classRoom;
	private Date birthday;
	private int age;
	private Random r;
	
	public double getSignature() {
		return r.getRandomNumber();
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	

}
