package org.cap.sha;
import java.util.Scanner;
//**
//@Author <Shafeeq_152992..>
//**
public class ShafeeqNumtoRs {

	public static void main(String[] args) {
		ShafeeqNumtoRs numToRs = new ShafeeqNumtoRs();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if(num==0) {
			System.out.println("Zero Rupees Only");
		}
		else {
			String inWords = numToRs.convert(num);
			System.out.println(inWords+" Rupees Only");
		}

	}

	String[] units = { "", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen" };

	String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	
	private String convert(int n) {
		
		if(n<20) {  
			return units[n];	
		}
		else if(n<100) {
			return tens[n/10] + ((n % 10 != 0) ? " " : "") + units[n%10];
		}
		else if(n<1000) {
			return units[n/100] + " Hundred" + ((n%100!=0)?" ":"") + convert(n%100);
		}
		else if(n<100000) {
			return convert(n /1000) + " Thousand" + ((n%10000!=0)?" ":"") + convert(n%1000);
		}
		else if(n<10000000) {
			return convert(n/100000) + " Lakh" + ((n%100000!=0)?" ":"") + convert(n%100000);
		}
		else return convert(n/10000000) + " Crore" + ((n%10000000!=0)?" ":"") + convert(n%10000000);
	
	}

}
