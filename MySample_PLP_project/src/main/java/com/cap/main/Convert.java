package com.cap.main;
/**
 * 
 * @author Syam Kumar Puppala....
 *
 */

public class Convert {
public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { "","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

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

		if (n < 100000) {
			return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
		}

		if (n < 10000000) {
			return convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
		}

		return convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
} 
	
	public static void main(final String[] args) {

		int[] a = {1,222,3333,40,51};
		
		System.out.println(a[0]+ "    = " + convert(a[0]) + " Rupee");

		System.out.println(a[1]+ "  = " + convert(a[1]) + " Rupees");
		System.out.println(a[2]+ " = " + convert(a[2]) + " Rupees");
		System.out.println(a[3]+ "   = " + convert(a[3]) + " Rupees");
		System.out.println(a[4]+ "   = " + convert(a[4]) + " Rupees");
	}

}
