package oops.stock;

import java.util.Scanner;

class StockPortfolio extends StockAccount {

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
		// int j = 0;
		double stockValue = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stocks number:");
		stocksNumber = sc.nextInt();

		for (int j = 0; j <= stocksNumber; j++) {
			System.out.println("Enter the stock name");
			String name = sc.next();

			if (stockNames.contains(name)) {
				System.out.println("StockName Found" + stockNames);
				stockPriceInput();
				stockCalculate();
				System.out.println("Total value is: " + stockCalculate());
				stockValue += totalStockValue;
				j++;
			} else {
				System.out.println("");
			}
		}
		System.out.println("Total Stock Portfolio Value is : " + stockValue);
	}

	public static void main(String[] args) {
		StockPortfolio obj = new StockPortfolio();
		obj.addStockNames();
		obj.stockPortFolio();
	}
}
