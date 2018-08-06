package cap.string;

import java.util.Scanner;

//@Author: VIGNESH R
public class StringConverter {
	static String[] places= {"","one","two","three","four","five","six","seven","eight","nine","ten"};
	static String[] tensplaces= {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	public static void main(String[] args) {
		
		System.out.println("Enter the number to be converted in 4 digits");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(num);
		int digit=num;
		int digit1 = 0;
		int digit2 = 0;
		int digit3 = 0;
		int digit4 = 0;
			digit1=digit%10;
		int num1=digit1;
			digit=digit/10;
		    digit2=digit%10;
		  int num2=digit2;
		  digit=digit/10;
			digit3=digit%10;
		int num3=digit3;
			digit=digit/10;
			digit4=digit%10;	
		int num4=digit4;
		
		System.out.println(thousands(num4)+ " "+ hundreds(num3)+" " +tens(num2)+" " +ones(num1));
	}

	private static String thousands(int digit4) {
		
		String thous= places[digit4] +"  thousand " ;
		return thous;
	}

	private static String hundreds(int digit3) {
		if(digit3!=0) {
		String hunds=places[digit3] +"hundred and" ;
		return hunds;
		}
		return " ";
	}

	private static String tens(int digit2) {
		String tens=tensplaces[digit2];
		return tens;
	}

	private static String ones(int digit1) {
		String ones=places[digit1];
		return ones;
	}

}
