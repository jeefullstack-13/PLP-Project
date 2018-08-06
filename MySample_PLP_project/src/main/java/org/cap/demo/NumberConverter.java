package org.cap.demo;
/**
 * author: Ashritha
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class NumberConverter {

public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

			public static final String[] tens = { 
					"", 	
					"",	
					"Twenty", 	
					"Thirty", 	
					"Forty", 	
					"Fifty", 	
					"Sixty", 
					"Seventy",	
					"Eighty", 
					"Ninety" 	
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

				if (n < 1000) {
					return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
				}

				
				
			 return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);

			}
			
		

			public static void main( String[] args) {

				int s;
				Scanner s1=new Scanner(System.in);
			    System.out.println("Enter a number to convert into word format");
				s =s1.nextInt();
				System.out.println(NumberFormat.getInstance().format(s) + "='" + convert(s) + "'");

			}
	
	
	
	
	
	
}
