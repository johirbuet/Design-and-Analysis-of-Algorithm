package com.johir;

public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int profit(int [] A)
	{
		int N=A.length;
		if(N< 2)
			return 0;
		int maxprofit=0;
		int price=A[N-1];
		
		for(int i=N-2;i>=0;i--)
		{
			maxprofit=Math.max(maxprofit, price-A[i]);
			price=Math.max(price, A[i]);
		}
		
		return maxprofit;
	}

}
