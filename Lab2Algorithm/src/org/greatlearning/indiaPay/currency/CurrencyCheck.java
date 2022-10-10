package org.greatlearning.indiaPay.currency;

public class CurrencyCheck {

	public void currencyCheck (int currency [],int amount) {
		int[] currencyCounter=new int [currency.length];
		try {
			for(int i=0;i<currency.length;i++)
			{
				if (amount>=currency[i])
				{
					currencyCounter[i]=amount/currency[i];
					amount=amount-currencyCounter[i]*currency[i];
		
				}
			}
			if (amount>0)
			{
	System.out.println("Exact amount can not be given with the highest denomination" );
			}
			else
			{
			System.out.println("Your payment approach in order to give min no. of currency will be");
			for(int i=0;i<currency.length;i++)
			{
				if (currencyCounter[i]!=0)
				{
					System.out.println(currency[i]+":"+currencyCounter[i]);
				}
			}
			}
		}catch (ArithmeticException e) {
			System.out.println(e+"currency of denomination 0 is invalid");
				}
					
			}
}			
			







