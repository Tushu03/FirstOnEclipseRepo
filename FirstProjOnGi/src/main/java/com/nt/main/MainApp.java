package com.nt.main;

import com.nt.service.ServiceToConvertStringToUpper;

public class MainApp {

	public static void main(String[] args) 
	{
		ServiceToConvertStringToUpper service=new ServiceToConvertStringToUpper();
		System.out.println("Converted => "+service.convertToUpper("hello guys"));
		
	}

}
