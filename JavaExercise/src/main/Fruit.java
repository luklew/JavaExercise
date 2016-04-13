package main;

import java.math.BigDecimal;

public class Fruit {
	
	private String name;
	private BigDecimal cost;
	
	public Fruit(String name, BigDecimal cost){
		this.name = name;
		this.cost = cost;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setCost(BigDecimal cost){
		this.cost = cost;
	}
	
	public BigDecimal getCost(){
		return cost;
	}

}
