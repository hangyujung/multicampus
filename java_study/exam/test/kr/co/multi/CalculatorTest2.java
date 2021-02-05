package kr.co.multi;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest2 {
	Calculator cal;
	@Before
	public void setUp() throws Exception {
		System.out.println("setup 실행");
		cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown 실행");
		cal=null;
	}

	@Test
	public void add() throws Exception{
		System.out.println("add test 실행");
		assertEquals(5, cal.add(2, 3));  //static import 안했으면 assert.assertEquals라고 썻어야함
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
