package com.nt.upi;

public class UpiPayment 
{
	public String doPayment(long accNo,double amt) 
	{
		double tax=0;
		
		if(amt>=10000) 
		{
			tax=amt*10/100;
			
		}
		return+amt+" Amount Paid To "+accNo+" And Because Of Your Daily Limit Exceeded Tax Will be Taken $"+tax;
	}

}
