package mavenci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testM {
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
		assertEquals(2,main.add(2,2));
	}
	@Test
	void testsub() {
		main=new Main();
		assertEquals(2,main.sub(2,2));
}
}