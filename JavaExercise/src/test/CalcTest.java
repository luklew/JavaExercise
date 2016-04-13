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
	public void testCalcTotalNoOffer() {
		
		calc.setOfferAvailable(false);
		
		BigDecimal result = calc.calculateTotal();
		BigDecimal expected = new BigDecimal(3.40).setScale(2, RoundingMode.HALF_UP);
		
		assertTrue(result.setScale(2, RoundingMode.HALF_UP).equals(expected));
	}
	
	@Test
	public void testCalcTotalWithOffer() {
		
		calc.setOfferAvailable(true);
		
		BigDecimal result = calc.calculateTotal();
		BigDecimal expected = new BigDecimal(1.95).setScale(2, RoundingMode.HALF_UP);
		
		assertTrue(result.setScale(2, RoundingMode.HALF_UP).equals(expected));
	}
	
}
