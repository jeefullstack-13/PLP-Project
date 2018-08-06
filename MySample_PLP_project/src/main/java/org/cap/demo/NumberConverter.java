package org.cap.demo;

import java.text.NumberFormat;
import java.util.Scanner;

//@Author:Varun M
public class NumberConverter {
	
	public static final String[] tens= {"","","twenty","thirty","fourty","fifty"
			,"sixty","seventy","eighty","ninety"};
	
	public static final String[] ones= { "","One","two","three","four","five",
			"six","seven","eight","nine","ten","eleven","twelve","thirteen",
			"fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	
	

	public static String convert(int n) {
		if(n<0) {
			return "enter valid amount in";
			
		}
		if(n<20) {
			return ones[n];
		}
		if(n<100) {
			return tens[n/10]+ ones[n%10];
		}
		if(n<1000) {
			return ones[n/100]+" hundred "+ convert(n%100);
		}
		if (n < 100000) {
			return convert(n / 1000) + " thousand " + convert(n % 1000);
		}

		
			return convert(n / 100000) + " Lakh" + convert(n % 100000);
		
		
	}
	public static void main(final String[] args) {

		int n;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the amount");
		n =sc.nextInt();
		System.out.println(NumberFormat.getInstance().format(n) + "=" + convert(n) + " rupees/-");

	}
	}
 
