package org.capgem.demo;

import java.text.NumberFormat;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		NumberToWordsConverter num=new NumberToWordsConverter();
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter a number to convert into word format");
		n =s.nextInt();
		System.out.println(NumberFormat.getInstance().format(n) + "='" + num.convert(n) + "'");
		s.close();
	}

}
