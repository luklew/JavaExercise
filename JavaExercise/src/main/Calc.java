package main;

import java.math.BigDecimal;
import java.util.List;

public class Calc {
	
	private Fruit apple;
	private Fruit orange;
	private List<String> fruitList;
	
	private BigDecimal total;
	
	public Calc(List<String> fruitList){
		this.fruitList = fruitList;
		
		apple = new Fruit("Apple", new BigDecimal(0.60));
		orange = new Fruit("Orange", new BigDecimal(0.25));
		
		total = new BigDecimal(0.00);
	}
	
	public BigDecimal calculateTotal(){
		for(String fruit: fruitList){
			if(fruit.equalsIgnoreCase("apple"))
			{
				total = total.add(apple.getCost());
			}else if (fruit.equalsIgnoreCase("orange"))
			{
				total = total.add(orange.getCost());
			}
		}
		
		return total;
	}

}
