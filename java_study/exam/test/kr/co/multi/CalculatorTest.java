package kr.co.multi;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator cal;     //Calculator 임포트 없이 바로 선언가능한 이유
	
	public void testAdd() throws Exception{
		System.out.println("add Test 실행");
	}
	public void testMinus() throws Exception{
		System.out.println("minus Test 실행");
	}
	protected void setUp() throws Exception {
		System.out.println("setUp실행");
	}

	protected void tearDown() throws Exception {
		System.out.println("tearDown실행");
	}

}