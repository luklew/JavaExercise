package main;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ApplicationLoader {
	
	public static void main(String[] args) {
		System.out.println("Input list of items : \n");
		
		Scanner in = new Scanner(System.in);
		String inputFruitList = in.nextLine();
		
		List<String> fruitList = Arrays.asList(inputFruitList.split("\\s*,\\s*"));
		
		System.out.println(fruitList);
		
		Calc calc = new Calc(fruitList);
		System.out.println("Total : £" + calc.calculateTotal().setScale(2, RoundingMode.HALF_UP));
		 
		in.close();

	}


}
