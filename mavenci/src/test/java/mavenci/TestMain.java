package mavenci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMain {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	public Main main;

	
	@Test
	void testmaincostructor() {
		main=new Main();
		assertNotEquals(main,null);
	}

	@Test
	void testadd() {
		main=new Main();
		assertEquals(4,main.add(2,2));
	}
	@Test
	void testsub() {
		main=new Main();
		assertEquals(0,main.sub(-2,2));
	
}
	@Test
	void testmul() {
		main=new Main();
		assertEquals(4,main.mul(2,2));}
	@Test
	void testdiv() {
		main=new Main();
		assertEquals(4,main.div(100,25));}
	
	@Test
	void testSubADD() {
		main=new Main();
		assertEquals(4,main.sub(main.add(100,25),main.sub(125, 4)));}
	
	void testmuADD() {
		main=new Main();
		assertEquals(100,main.mul(main.add(13,12),main.mul(2, 2)));}
	
	void testall4() {
		main=new Main();
		assertEquals(25,main.div(main.mul(main.add(25,25),main.mul(1, 2)),main.sub(main.add(100,25),main.sub(125, 4))));}
	
	}


