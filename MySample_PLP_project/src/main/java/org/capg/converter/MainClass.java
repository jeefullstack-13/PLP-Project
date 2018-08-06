package org.capg.converter;

import  java.util.Scanner;

//@author Ashwin

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[] number = input.nextLine().toCharArray();
		int size = number.length;
	    inWords(number, size);
	    
	    input.close();
	}
	
	public static void inWords(char[] num, int size) {
		
		int i, sz=size-1;
		
		for(i=0; i<size; i++) {
		 if(num[i]!='0') {
			 
		 if(i != size-2 && (sz-2)%2!=0){
			System.out.print(switcher(num[i],0));
			System.out.print(value(sz--));
		 }
		 else if(i == size-2){
			    System.out.print(tens(num[i],num[i+1]));
			    break;
		 }
		 else if((sz-2)%2==0){
			 System.out.print(tens(num[i],num[i+1]));
			 System.out.print(value(sz--));
			  sz--; i++;
		 }
		 }
		 else {
			 sz--;
		 }
		}
	}
	
	
	public static String switcher(char n, int flag) {
		String S="";
		
		switch(n) {
			case '1': S= flag==1?"eleven":"one";		return S;			
			case '2': S= flag==1?"twelve":"two"; 		return S;
			case '3': S= flag==1?"thirteen":"three"; 	return S;		
			case '4': S= flag==1?"forteen":"four";		return S;
			case '5': S= flag==1?"fifteen":"five";		return S;		
			case '6': S= flag==1?"sixteen":"six";		return S;
			case '7': S= flag==1?"seventeen":"seven";	return S;	
			case '8': S= flag==1?"eightteen":"eight";	return S;
			case '9': S= flag==1?"ninteen":"nine";		return S;		
		}
		return "";
	}
	
    public static String value(int size) {
    	switch(size) {
    	case 2: return " hundred ";
    	case 3: return " thousand ";  case 4: return " thousand ";
    	case 5: return " lakh ";
    	}
     return "";
    }
    
    public static String tens(char n, char m) {
    	
    	if(n == '1') {
    		 return switcher(m,1);
    	}
    	else {
    		switch(n) {
    			case '2': return "twenty "+ switcher(m,0);			case '3': return "thirty "+ switcher(m,0);
    			case '4': return "forty "+ switcher(m,0);			case '5': return "fifty "+ switcher(m,0);
    			case '6': return "sixty "+ switcher(m,0);			case '7': return "seventy "+ switcher(m,0);
    			case '8': return "eighty "+ switcher(m,0);			case '9': return "ninty "+ switcher(m,0);
    		}
    	}
    	return "";
    }
}
