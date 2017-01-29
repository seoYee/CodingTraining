package calculator;

import java.util.Scanner;

import vo.TipcalculatorVo;

//TipCalculator pseudo code
//TipCalculator
//	Initialize billAmount to 0
//	Initialize tip to 0
//	Initialize tipRate to 0
//	Initialize total to 0
//	
//	Prompt for billAmount with "What is the bill amount?"
//	Prompt for tipRate with "What is the tip rate?"
//	
//	convert billAmount to a number
//	convert tipRate to a number
//	
//	tip = billAount * (tipRate /100)
//	round tip up to nearest cent
//	total = billAmount + tip
//	
//	Display "Tip: $" + tip
//	Display "Total: $" + total
//End

public class Run {
	public static void main(String[] args) {
		System.out.println("What is the bill amount?");
		Scanner scan = new Scanner(System.in);
		double billAmount = scan.nextDouble();
		
		System.out.println("What is the tip rate?");
		int tipRate = scan.nextInt();

		Calculator calculator = new Calculator();
		double tipForCustomer = calculator.getTipForCustomer(billAmount, tipRate);
		double total = calculator.getTotalAmount(billAmount, tipRate);
		
		System.out.println("Tip: $"+tipForCustomer);
		System.out.println("Total: $"+total);
		
	}
	
}
