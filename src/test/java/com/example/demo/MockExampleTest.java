package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.pojo.Student;

@RunWith(MockitoJUnitRunner.class)
public class MockExampleTest {
	
	@Mock List<Integer> intList;
	@Spy List<String> spiedList = new ArrayList<String>();
	@Captor ArgumentCaptor argCaptor;
	
	@Mock Random random;
	@InjectMocks Student std = new Student();
	
	@Test
	public void mockIntListSizeShouldBe_0() {
		intList.add(7);
		assertThat(intList.size()).isEqualTo(0);
	}
	
	@Test
	public void spiedListSizeShouldBe_7() {
		spiedList.add("7");
		assertThat(spiedList.size()).isEqualTo(1);
	}
	
	
	
	
	@Test
	public void intListSizeShouldBe_100() {
		intList.add(7);
		when(intList.size()).thenReturn(100);
		assertThat(intList.size()).isEqualTo(100);
	}
	
	@Test
	public void spiedListSizeShouldBe_100() {
		spiedList.add("7");
		when(spiedList.size()).thenReturn(100);
		assertThat(spiedList.size()).isEqualTo(100);
	}
	
	@Test
	public void spiedListArgShouldBe_x() {
		
		spiedList.add("y");
		spiedList.add("x");
		verify((spiedList), times(2)).add((String) argCaptor.capture());
		assertThat(argCaptor.getValue()).isEqualTo("x");
	}
	
	@Test 
	public void spiedListAllArgShouldBe_List(){
		spiedList.add("y");
		spiedList.add("x");
		verify((spiedList), times(2)).add((String) argCaptor.capture());
		List expected = new ArrayList();
		expected.add("y");
		expected.add("x");
		
		assertThat(argCaptor.getAllValues()).isEqualTo(expected);
	}
	
	
	@Test
	public void studentSignatureShouldBe_7() {
		when(random.getRandomNumber()).thenReturn(7.0);
		assertThat(std.getSignature()).isEqualTo(7);
	}

}
