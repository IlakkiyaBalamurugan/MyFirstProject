package com.helloworld;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> name=new ArrayList<>();
		System.out.println("Size"+name.size());
		name.add(null);
		name.add(null);
		name.add("name");
		name.add("name");
		name.add("name");
		name.add("name");
		name.add("name");
		System.out.println("Size"+name.size());
	}

}
