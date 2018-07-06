package com.neha.algo;

import java.util.ArrayList;

public class StockBuySell {
public static void main(String[] args) {
	StockBuySell stock = new StockBuySell();
    
    // stock prices on consecutive days
    int price[] = {2,1,4,2,1,4};//{100, 180, 260, 310, 40, 535, 695};
    int n = price.length;

    // fucntion call
    stock.stockBuySell(price, n);
}

// 2 1 4  2 1 4
//0 1 2 3

public static void stockBuySell(int[] arr, int n){
	int i = 0;
	int interCount=0;
	ArrayList<Interval> interval = new ArrayList<>();
	while(i<n-1){
		while(arr[i]>arr[i+1] && i<n-1)
			i++;
		if(i==n-1)
			break;
	
	Interval in = new Interval();
	in.setBuy(i++);;
	while(i<n-1 && arr[i]<arr[i+1]){
		i++;
	}
	in.setSell(i);
	interval.add(in);
	interCount++;
	}
	for (Interval in: interval){
		System.out.println(in);
	}
}



}

class Interval{
	int buy;
	public int getBuy() {
		return buy;
	}

	public void setBuy(int buy) {
		this.buy = buy;
	}

	int sell;
	
	public int getSell() {
		return sell;
	}

	public void setSell(int sell) {
		this.sell = sell;
	}

	public Interval(){
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Buy at: "+this.getBuy() + "Sell at: "+this.getSell();
	}
}
