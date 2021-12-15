package com.bridgelabz.oops.pack;

import java.util.ArrayList;
import java.util.Scanner;

class Stock {
	int stocksNumber;
	int numOfShares;
	double sharePrice;
	ArrayList<String> stockNames;

	// constructor
	public Stock() {
		stockNames = new ArrayList<>();
	}

	/**
	 * Adding stock names to the arraylist
	 */
	public void addStockNames() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter the stock name to add : ");
    	String stockName = sc.nextLine();
    	stockNames.add(stockName);
        	
    		System.out.println("Stocks names are:"+stockNames);

        }
  
}

/*
 * Stock portfolio class extends Stock class
 */
class StockPortfolio extends Stock {
	double totalStockValue;

	/*
	 * This method is used to assign the values of stock price and the number of
	 * shares user has
	 */
	public void stockPriceInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter share price:");
		sharePrice = sc.nextDouble();
		System.out.println("Enter number of Shares:");
		numOfShares = sc.nextInt();
	}

	/*
	 * This method is used to calculate total value
	 */
	public double stockCalculate() {
		this.totalStockValue = sharePrice * numOfShares;
		return totalStockValue;
	}

	/*
	 * calculates the total value of the portfolio
	 */
	public void stockPortFolio() {
		int j = 0;
		double stockValue = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stocks number:");
		stocksNumber = sc.nextInt();
		
		while (j < stocksNumber) {
			System.out.println("Enter the stock name");
			String name = sc.nextLine();
			
			if (stockNames.contains(name)) {
				stockPriceInput();
				stockCalculate();
				System.out.println("Total value is: " + stockCalculate());
				stockValue += totalStockValue;
				j++;
			} 
		}
		System.out.println("Total Stock Portfolio Value is : " + stockValue);
	}
}

//main method
public class StockAccountManagement {
	public static void main(String[] args) {
		StockPortfolio obj = new StockPortfolio();
		obj.addStockNames();
		obj.stockPortFolio();
	}
}