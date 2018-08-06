package org.cap.demo1;

import java.text.NumberFormat;
import java.util.Scanner;

//@Author<Dhanalakshmi.P>
public class MainClass {

		public static final String[] units = { "", "One", "Two", "Three", "Four",
					"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
					"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
					"Eighteen", "Nineteen" }; 
		
		
			public static final String[] tens = { 
						"", "",	"Twenty", "Thirty", "Forty", "Fifty", 
						"Sixty", "Seventy","Eighty", "Ninety" 	
				}; 

			public static void main(String [] args) {
					Scanner s=new Scanner(System.in);
					System.out.println("Enter a four digit number:");
					int num=s.nextInt();
					System.out.println(NumberFormat.getInstance().format(num) + "=" + convert(num) + " Rupees only");
				} 
			
		 
				
			
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
				 

			 

		 

	

}
