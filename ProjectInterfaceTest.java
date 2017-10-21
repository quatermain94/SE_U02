package se1_02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjectInterfaceTest {
	
	Project simple_example;

	@Before
	public void setUp() throws Exception {
		simple_example = new Project(
		        new String[][]{{"A", "C"}, {"C", "D"}, {"B", "C"}}
		    );
	}

	@Test
	public void test_simple_example1() {
		assertFalse(simple_example.isWellSorted(new String[]));
	}

}
