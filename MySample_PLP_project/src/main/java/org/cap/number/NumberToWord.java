package org.cap.number;

import java.text.NumberFormat;
import java.util.Scanner;

//@Author<YAMINI>
public class NumberToWord {
public static final String[] unitsplace = { "",
											"One", 
											"Two", 
											"Three",
											"Four",
											"Five", 
											"Six",
											"Seven",
											"Eight",
											"Nine", 
											"Ten",
											"Eleven", 
											"Twelve",
											"Thirteen",
											"Fourteen", 
											"Fifteen",
											"Sixteen", 
											"Seventeen",
											"Eighteen",
											"Nineteen" };

public static final String[] tensplace = { 
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
  
    if (n < 20) {
        return unitsplace[n];
    }

    if (n < 100) {
        return tensplace[n / 10] + ((n % 10 != 0) ? " " : "") + unitsplace[n % 10];
    }

    if (n < 1000) {
        return unitsplace[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
    }
return convert(n / 1000) + " Thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
    
    
}
 
public static void main(final String[] args) {

    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to convert into word format");
    n =s.nextInt();
    System.out.println(convert(n));

}
}