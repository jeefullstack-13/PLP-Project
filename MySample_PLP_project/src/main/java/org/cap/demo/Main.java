package org.cap.demo;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	//@Author <Sarath Nistala>
public static final String[] units = { "", "One", "Two", "Three", "Four",
"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
"Eighteen", "Nineteen" };

//@Author <Sarath Nistala>

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

//@Author <Sarath Nistala>

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

//@Author <Sarath Nistala>

public static void main(final String[] args) {

	int n;
	Scanner scan=new Scanner(System.in);
    System.out.println("Enter the amount");
	n =scan.nextInt();
	System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'" + "ruppes only");

}
}