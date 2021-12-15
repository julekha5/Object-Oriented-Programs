package oops.stock;

import java.util.*;

public class StockAccount {
	
	int stocksNumber;
	int numOfShares;
	double sharePrice;
	ArrayList<String> stockNames;

	// constructor
	public StockAccount() {
		stockNames = new ArrayList<>();
	}
	
	
	public void addStockNames() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stock name to add : ");
		String stockName = sc.nextLine();
		stockNames.add(stockName);
		System.out.println("Stocks names are:" + stockNames);
	}

}
