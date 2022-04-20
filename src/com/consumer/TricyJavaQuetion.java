package com.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TricyJavaQuetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//\u000d	System.out.println("comment eexcuted");
		String s="abc"+1+2+"bsss"+5+6;
	     String s1="acde";
	     String s2="aCde";
		System.out.println("print "+s1.equalsIgnoreCase(s2));
		Integer i1=126;
		Integer i2=126;
		System.out.println(i1==i2);
		Integer i3=128;
		Integer i4=128;
		System.out.println(i3==i4);
		String name="welcome to canada and canda welcome you to canada";
		
		String nam1[]=name.split(" ");
		String m="to";
		int count = 0;
		for(int i=0;i<=nam1.length-1;i++)
		{
			
			if(m.equals(nam1[i]))
			{
			count++;
			System.out.println("count"+count);
			
			}
		}
	
		List<Integer> list= Arrays.asList(10,20,30,10,50,60,30);
		List<String> sst=new ArrayList<>();
		
		Set<Integer> set= new HashSet<Integer>();
		Set<String> data= new HashSet<String>();
		//list.stream().filter(x->!set.add(x)).collect(Collectors.counting());
		list.stream().filter(x->set.add(x)).forEach(x->System.out.println(x));
		
	

	}

}
