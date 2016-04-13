package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import main.Calc;
import main.Fruit;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {

	Calc calc;
	List<String> fruitList;
	
	@Before
	public void setUp() throws Exception {
		fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("Orange");
		fruitList.add("Orange");
		fruitList.add("Apple");
		
		calc = new Calc(fruitList);
	}

	@Test
	public void testCalcTotal() {
		
		BigDecimal result = calc.calculateTotal();
		System.out.println(new BigDecimal(3.40).setScale(2, RoundingMode.HALF_UP));
		BigDecimal expected = new BigDecimal(3.40).setScale(2, RoundingMode.HALF_UP);
		
		assertTrue(result.setScale(2, RoundingMode.HALF_UP).equals(expected));
	}

}