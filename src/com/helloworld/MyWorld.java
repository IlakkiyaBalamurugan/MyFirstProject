/**
 * 
 */
package com.helloworld;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
	 * This program demonstrates how to establish database connection to Microsoft
	 * SQL Server.
	 * @author www.codejava.net
	 *
	 */
	public class MyWorld  {
		
	    public static void main(String[] args) throws ArithmeticException {
	    	 method3();
	    	
	    }
	    public static void method1()
	    {
	    	int i, j, row=10;   
	    	//outer loop for rows  
	    	for(i=0; i<row; i++)   
	    	{  
	    		
	    	//inner loop for columns  
	    	for(j=0; j<=i; j++)   
	    	{   
	    		System.out.println("print j"+j);
	    	//prints stars   
	    	System.out.print("* ");   
	    	} 
	    	}
	    }
	    public static void method2() {
int total =0;
	    	
	    	List<String> name=Arrays.asList("sum","san","bala","ilakkiya","san","mmm");
	    	/*for(int i=0;i<=50;i++)
	    	{
	    		total= total+i;
	    		//System.out.println("total of 50"+total);
	    	}*/
	    	System.out.println("total of  final 50  --->"+total);
	    	
	    	// java 8
	    	@SuppressWarnings("deprecation")
			int totalnew=IntStream.rangeClosed(0, 50).map(Integer:: new).sum();
	    	System.out.println("Total new"+totalnew);
	    	
	    	List<String> uniqueList= name.stream().distinct().collect(Collectors.toList());
	    	System.out.println("unique list----->"+uniqueList);
	    	//thread using runnable interface
	    	Runnable t=() -> {System.out.println("thread one ");};
	    	new Thread(t).start();
	    	
	    	
	    	//comparator in java 7
	    	Comparator<Integer> c1=new Comparator<Integer>() {

				@Override
				public int compare(Integer x, Integer y) {
					// TODO Auto-generated method stub
					return x.compareTo(y);
				}
							};
							
				System.out.println("compare two values:"+c1.compare(15, 17));	
				// java 8 comparator
				Comparator<Integer> c2 = (Integer x, Integer y) -> x.compareTo(y);
				System.out.println("compare two values"+c2.compare(35, 25));
				Comparator<Integer> c3 = ( x, y) -> x.compareTo(y);
				System.out.println("compare two values"+c3.compare(15, 15));
				int i=0;
				for( i=0;i<=10;i++)
		    
		    		total+= i;
				System.out.println("total of 50"+i);
			    
		    		System.out.println("total of 50"+total);
		    
				
	    }
	    public static void method3()
	    {
	    	int i, j, rows=10;  
	    	//Scanner sc = new Scanner(System.in);    
	    	System.out.print("Enter the number of rows you want to print: ");      
	    	// rows = sc.nextInt();           
	    	for (i = 2; i <= rows; i++)   
	    	{  
	    		//System.out.println();
	    	for (j = 2; j <= i; j++)  
	    	{  
	    	System.out.print(i+" ");  
	    	}  
	    	//System.out.println();  
	    	}   
	    }
	}


