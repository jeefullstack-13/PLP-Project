package org.archana;

/*Author : Archana Emmadi*/
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a number");
		try {
			
			number = scanner.nextInt();
			if (number == 0) {
				System.out.print("Number in words: Zero");
			} else {
				System.out.print("Number in words: " + numberCoverter(number));
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
		}
	
		scanner.close();
	}
	/*Method-Name : numberCoverter
    arguments: int
    purpose: converts number to word
    */
    
	private static String numberCoverter(int number) {
              
                String words = "";
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                                "seven", "eight", "nine", "ten", "eleven", "twelve",
                                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                                "eighteen", "nineteen" };
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                                 "sixty", "seventy", "eighty", "ninety" };
 
		if (number == 0) {
			return "zero";
		}
	
		if (number < 0) { 
                        
                        String numberStr = "" + number;
                      
                        numberStr = numberStr.substring(1);
                       
                        return "minus " + numberCoverter(Integer.parseInt(numberStr));
                } 
                
                if ((number / 1000) > 0) {
			words += numberCoverter(number / 1000) + " thousand ";
			number %= 1000;
		}
		
		if ((number / 100) > 0) {
			words += numberCoverter(number / 100) + " hundred ";
			number %= 100;
		}
 
		if (number > 0) {
		
			if (number < 20) {
                                
                                 words += unitsArray[number];
                        } else { 
                               
                                words += tensArray[number / 10]; 
                                if ((number % 10) > 0) {
				   words += "-" + unitsArray[number % 10];
                            }  
			}
		}
 
		return words;
	}
 
}

