package com.example.demo;

import java.util.Collections;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.stereotype.Component;
import com.example.demo.pojo.Student;

@Component
public class Sort {
	
	public Student[] sortByAgeAscending(Student[] students) {
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
	
	public Student[] sortByAgeDescending(Student[] students) {
		
		int length = students.length;
		Student temp;
		for (int i = 0;i< length-1; i++) {
			for (int j = i+1;j< length; j++) {
				if (students[i].getAge() < students[j].getAge()) {
					temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
		return students;
	}
	
	public Student[] sortByFirstNameDescending(Student[] students) {
		int length = students.length;
		Student temp;
		for (int i = 0;i< length-1; i++) {
			for (int j = i+1;j< length; j++) {
				if (students[i].getFirstName().compareToIgnoreCase(students[j].getFirstName()) < 0) {
					temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
		
		return students;
	}
	
	public Student[] sortByFirstNameAscending(Student[] students) {
		List<?> studentList = Arrays.asList(sortByFirstNameDescending(students));
		Collections.reverse(studentList);
		students = studentList.toArray(students);
		
		return students;
	}

}
