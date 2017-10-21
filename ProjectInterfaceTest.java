package se1_02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjectInterfaceTest {
	
	Project simple_example, own_simple_example;

	@Before
	public void setUp() throws Exception {
		simple_example = new Project(
		        new String[][]{{"A", "C"}, {"C", "D"}, {"B", "C"}}
		    );
		own_simple_example = new Project(
				new String[][]{{"1", "B"} }
				);
	}

	@Test
	public void test_simple_example1() {
		assertFalse(simple_example.isWellSorted(new String[]{}));
	}
	
	@Test
	public void test_own_simple_example1(){
		assertTrue(own_simple_example.isWellSorted(new String[] {"1", "3", "B"}));
	}
	
	@Test
	public void test_own_simple_example2(){
		assertFalse(own_simple_example.isWellSorted(new String[] {"1", "B", "B"}));
	}

}
