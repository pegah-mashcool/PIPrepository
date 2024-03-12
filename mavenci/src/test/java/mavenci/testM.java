package mavenci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testM {
	public Main main;

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testmaincostructor() {
		main=new Main();
		assertNotEquals(main,null);
	}

	@Test
	void testadd() {
		main=new Main();
		assertEquals(4,main.add(999,2));
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