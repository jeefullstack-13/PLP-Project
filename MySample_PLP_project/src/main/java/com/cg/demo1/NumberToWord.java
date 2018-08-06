package com.cg.demo1;

import java.text.NumberFormat;
import java.util.Scanner;
//@Author <Gowthami>
public class NumberToWord {
	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

			public static final String[] tens = { 
					"", 		// 0
					"",		    // 1
					"Twenty", 	// 2
					"Thirty", 	// 3
					"Forty", 	// 4
					"Fifty", 	// 5
					"Sixty", 	// 6
					"Seventy",	// 7
					"Eighty", 	// 8
					"Ninety" 	// 9
			};

			public static String convert(final int n) {
				if (n < 0) {
					return "Minus " + convert(-n);
				}

				if (n < 20) {
					return units[n];
				}

				if (n < 100) {
					return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
				}
if(n<1000) {
				
					return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
			}
 return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
			}
			
			
			public static void main(final String[] args) {

				int n;
				Scanner s=new Scanner(System.in);
			    System.out.println("Enter a four digit number to convert into word: ");
				n =s.nextInt();
				if(n>9999) {
					System.out.println("**Enter a number below 9999");
				}else
				System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "' Rs/-");

			}
			
}
