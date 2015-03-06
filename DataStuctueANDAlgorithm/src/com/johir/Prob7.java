package com.johir;

public class Prob7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		long N=3;
		while(count!=10001)
		{
			if(isPrime(N))
				count++;
			N+=2;
		}
		System.out.println(N-2);
	}
	
	public static boolean isPrime(long N){
		boolean isPrime=true;
		
		for(long i=2;i<=N/2;i++)
		{
			if(N%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

}
