package com.consumer;

import java.util.function.Consumer;

public class ConsumerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Consumer<String> con= (s) -> {System.out.println(s.toUpperCase());};
         con.accept("Bala");
         Consumer<String> con2= (s) -> {System.out.println(s.equalsIgnoreCase("sanjana"));};
        con2.accept("ilakkiya");
         
         con.andThen(con2).accept("Balamurugan");
	}

}
