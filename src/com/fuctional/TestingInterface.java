package com.fuctional;

@FunctionalInterface
public interface TestingInterface {
	public void add();
	
	default String sayHello()
	{
		return "hello";
	}
     static boolean isTrue()
     {
		return true;
    	 
     }
}
