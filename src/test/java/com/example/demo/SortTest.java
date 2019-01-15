package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.pojo.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Sort.class)
public class SortTest {
	
	@Autowired Sort sort;
	Student student1 = new Student();
	Student student2 = new Student();
	Student student3 = new Student();
	Student student4 = new Student();
	Student student5 = new Student();
	Student[] expectedResult;
	
	@Before
    public void before() {

		student1.setAge(18);
		student2.setAge(17);
		student3.setAge(22);
		student4.setAge(20);
		student5.setAge(16);

    }
	
	@Test
	public void sortByAgeAscendingEvenLengthTest() {
		
		expectedResult = new Student[]{student2, student1, student4, student3};
		
		Student[] output = sort.sortByAgeAscending(new Student[]{ student1, student2, student3, student4 });
		
		for (int i=0; i< output.length; i++) {
			assertThat(output[i].getAge()).isEqualTo(expectedResult[i].getAge());
		}
		
	}
	
	@Test
	public void sortByAgeAscendingOddLengthTest() {
		
		
		expectedResult = new Student[]{student5, student2, student1, student4, student3};
		
		Student[] output = sort.sortByAgeAscending(new Student[]{ student1, student2, student3, student4, student5 });
		
		for (int i=0; i< output.length; i++) {
			assertThat(output[i].getAge()).isEqualTo(expectedResult[i].getAge());
		}
		
	}
	
}