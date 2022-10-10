package org.greatlearning.indiaPay.driver;

import java.util.Scanner;

import org.greatlearning.indiaPay.currency.CurrencyCheck;
import org.greatlearning.indiaPay.currency.MergeSortImplementation;

public class Main {

	public static void main(String[] args) {
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		CurrencyCheck currencyCheck = new CurrencyCheck();
		System.out.println("enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] currency = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			currency[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(currency, 0, currency.length - 1);
		currencyCheck.currencyCheck(currency, amount);
	}

}
