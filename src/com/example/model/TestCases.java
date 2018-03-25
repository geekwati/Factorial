package com.example.model;
public class TestCases{
	public static void main(String args[]){
		//test(0);
		test1(4);
		test2(6);
		test3(10);
		//test4(-2);
		test5(15);
	}
	public static void test1(int n){   //4!
		FactorialOfNumber f=new FactorialOfNumber();
		//System.out.println(n+"   "+f.calculateFactorial(n));
		if(f.calculateFactorial(n).equals("24"))  
			System.out.println("Success1");
		else
			System.out.println("Failure1");
		
	}
	public static void test2(int n){   //6!
		FactorialOfNumber f=new FactorialOfNumber();
		//System.out.println(n+"   "+f.calculateFactorial(n));
		if(f.calculateFactorial(n).equals("720"))
			System.out.println("Success2");
		else
			System.out.println("Failure2");
		
	}
	public static void test3(int n){   //10!
		FactorialOfNumber f=new FactorialOfNumber();
		//System.out.println(n+"   "+f.calculateFactorial(n));
		if(f.calculateFactorial(n).equals("3628800"))
			System.out.println("Success3");
		else
			System.out.println("Failure3");
		
	}
	public static void test5(int n){    //15!
		FactorialOfNumber f=new FactorialOfNumber();
		//System.out.println(n+"   "+f.calculateFactorial(n));
		if(f.calculateFactorial(n).equals("1307674368000"))
			System.out.println("Success5");
		else
			System.out.println("Failure5");
		
	}

}