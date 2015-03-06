package com.johir;

public class CoinChange {
	static int time=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coinChange(new int [] {1,2}, 2, 3));
		System.out.println(time);
	}
	
	static int coinChange(int [] coin,int M,int N)
	{
		time++;
		int [] mem=new int[coin.length];
		//int M=coin.length;
		if(N ==0)
			return 1;
		if(N<0)
			return 0;
		if(M<= 0 && N>=1)
			return 0;
		
		else
			return coinChange(coin,M-1, N)+coinChange(coin, M, N-coin[M-1]);
	}

}
