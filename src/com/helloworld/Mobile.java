package com.helloworld;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Mobile {

	 public static  void main(String[] args) {
		// TODO Auto-generated method stub
		 String test = "Hey Hi Hello";
		 String[] words = test.split(" ");		
		 test = words[words.length-1];
		 System.out.println("test 1"+test +""+test.length());
		 test= words[words.length-2];
		 System.out.println("test 2"+test +""+test.length());
		 test= words[words.length-3];
		 System.out.println("test 3"+test +""+test.length());
		String name="ilakkiya";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse+=name.charAt(i);
		}
		System.out.println("data----->"+reverse);
		 
		 LinkedList<Integer> list=new LinkedList<Integer>();
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 list.add(4);
		 list.add(5);
		 list.add(6);
		// System.out.println("list in order"+list.toString());
		 reverseOrder("BALA"); 
		 reverseOrderbyCharAt("sanjana");
		 primenumber(12);
	}
	 public static String reverseOrder(String name)
	 {
		 String reverse="";
		 StringBuilder ab=new StringBuilder();
		 ab.append(name);
		 System.out.println("reverse order  "+ab.reverse());
		 if(name!=null)
		 {
			 char[] rev=name.toCharArray();
			 for (int i=rev.length-1;i>=0;i--)
			 {
				 reverse+=rev[i];
			 }
			System.out.println("reverse by char array "+reverse); 
		 }
		
	
		 return "revered String"+reverse;
		 
	 }
	 public static String reverseOrderbyCharAt(String name)
	 {
		 String reverse="";
		 for(int i=name.length()-1;i>=0;i--)
		 {
			 reverse+=name.charAt(i);
		 }
	System.out.println("reverse order "+reverse);
		 return "revered String"+reverse;
	 }
	 
	public static int primenumber(int i)
		{
		boolean flag=false;
		for (int j=2; j<=i/2; ++j)
		{
			if(i%2==0)
			{
				flag=true;
				//break;
			}
		}
		if(!flag)
		{
			System.out.println("no i is prime no"+i);

		}
		else {
			System.out.println("no i is not  prime no"+i);
		}
		return i;
		
	}

}
