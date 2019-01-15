package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.pojo.Student;

public class Sort {
	
	public Student[] sortByAgeAscendingWithList(Student[] students) {
	
		int length = students.length;
		Student temp;
		for (int i = 0;i< length-1; i++) {
			for (int j = i+1;j< length; j++) {
				if (students[i].getAge() > students[j].getAge()) {
					temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
		return students;
	}

}
