package FourDigitNumbersInWords;

import java.util.Scanner;
//@Author<Khishore_Kumar>
public class ToWords {

	public static void main(String args[]) {
		ToWords toWords = new ToWords();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a four digit number:");
		int num = s.nextInt();
		System.out.println(toWords.convertToWord(num));
		s.close();
	}
	
	//@Author<Khishore_Kumar>
	public String convertToWord(int num) {
		String words="";
		int fourth=num%10;
		int third=(num%100)-fourth;
		third=third/10;
		int second=(num%1000)-third-fourth;
		second=second/100;
		int first=num-second-third-fourth;
		first=first/1000;
		int eleven=(third*10)+fourth;
		String first1=SingleDigitWord(first)+" thousand ";
		if(first>0) {
		words=first1;
		}
		String second2=SingleDigitWord(second)+" hundred ";
		if(second>0) {
		words=words+second2;
		}
		if((third>1)||(eleven<10)) {
			String third3=DoubleDigitWord(third)+" ";
			String fourth4=SingleDigitWord(fourth);
			words=words+third3+fourth4;
		}
		else {
			words=words+elevens(eleven);
		}
		 return words;
	}
	
	//@Author<Khishore_Kumar>
		public String SingleDigitWord(int num) {
			switch(num) {
			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
			default: break;
			}
			return "";
		}
		
		//@Author<Khishore_Kumar>
		public String DoubleDigitWord(int num) {
			switch(num) {
			case 2:
				return "twenty";
			case 3:
				return "thirty";
			case 4:
				return "forty";
			case 5:
				return "fifty";
			case 6:
				return "sixty";
			case 7:
				return "seventy";
			case 8:
				return "eighty";
			case 9:
				return "ninety";
			default: break;
			}
			return "";
		}
		
		//@Author<Khishore_Kumar>
				public String elevens(int num) {
					switch(num) {
					case 11:
						return "eleven";
					case 12:
						return "twelve";
					case 13:
						return "thirteen";
					case 14:
						return "forteen";
					case 15:
						return "fifteen";
					case 16:
						return "sixteen";
					case 17:
						return "seventeen";
					case 18:
						return "eighteen";
					case 19:
						return "nineteen";
					default: break;
					}
					return "";
				}
	
}
