package com.example.model;
public class FactorialOfNumber{
	public static String calculateFactorial(int n){
		String result="1";
		
		for(int i=2;i<=n;i++){
			int carry=0;
			String temp="";
			for(int j=result.length()-1;j>=0;j--){
				int digit=Character.getNumericValue(result.charAt(j));
				int product=digit*i+carry;
				digit=product%10;
				temp=digit+temp;
				carry=product/10;
			}
			if(carry!=0)
				result=carry+temp;
			else
				result=temp;
		}
		return result;

	}
		
}