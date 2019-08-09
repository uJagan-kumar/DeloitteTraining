import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddNumbersTest {
	
	AddNumbers addNumbers;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		addNumbers = new AddNumbers();
		System.out.println("before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		addNumbers = null;
		System.out.println("after each");

	}

	@Test
	void test1() {
		assertEquals(30, addNumbers.sum(10, 10, 10));
	}
	
	@Test
	void test2() {
		assertEquals(10, addNumbers.sum(10, 10, 10));
	}

}
