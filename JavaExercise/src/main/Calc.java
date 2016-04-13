package main;

import java.math.BigDecimal;
import java.util.List;

public class Calc {
	
	private Fruit apple;
	private Fruit orange;
	private List<String> fruitList;
	
	private int appleOffer;
	private int orangeOffer;
	private boolean offerAvailable;
	
	public static final int APPLE_OFFER = 1;
	public static final int ORANGE_OFFER = 2;
	
	private BigDecimal total;
	
	public Calc(List<String> fruitList)
	{
		this.fruitList = fruitList;
		
		apple = new Fruit("Apple", new BigDecimal(0.60));
		orange = new Fruit("Orange", new BigDecimal(0.25));
		
		total = new BigDecimal(0.00);
		
		appleOffer = 0;
		orangeOffer = 0;
	}
	
	public BigDecimal calculateTotal()
	{
		for(String fruit: fruitList){
			if(fruit.equalsIgnoreCase("apple"))
			{
				if(offerAvailable){
					if(appleOffer < APPLE_OFFER){
						total = total.add(apple.getCost());
						appleOffer++;
					}
					else
					{
						appleOffer = 0;
					}
					
				}
				else{
					total = total.add(apple.getCost());
				}
					
			}
			else if (fruit.equalsIgnoreCase("orange"))
			{
				if(offerAvailable){
					if(orangeOffer < ORANGE_OFFER)
					{
						total = total.add(orange.getCost());	
						orangeOffer++;
					}
					else
						orangeOffer = 0;
				}
				else
				{
					total = total.add(orange.getCost());
				}
			}	
		}
		
		return total;
	}
	
	
	public void setOfferAvailable(boolean offerAvailable)
	{
		this.offerAvailable = offerAvailable;
	}
	
	public boolean getOfferAvailable()
	{
		return this.offerAvailable;
	}
}
	
