package com.cap;
import java.text.NumberFormat;
import java.util.Scanner;
/* @Author <Shravya Gunnala>
 * @Purpose: for converting given value into words (upto four digits)
 */

public class ConvertNumberToWord {
	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };
	public static final String[] tens = { 
			"", 		// 0
			"",			// 1
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

		else if (n < 20) {
			return units[n];
		}

		else if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		else if (n < 1000) {
			return units[n / 100] + " Hundred and" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}
		else if(n<10000)
			return convert(n / 1000) + " Thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
		return "null";

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter a four digit number");
		n =s.nextInt();
		if(n>9999)
			System.out.println("Enter only 4 digit value");
		else
			System.out.println(NumberFormat.getInstance().format(n) + " : " + convert(n)+" Rupees only");
	}

}








