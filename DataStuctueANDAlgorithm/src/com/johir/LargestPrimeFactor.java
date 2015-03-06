package com.johir;

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			long N=sc.nextLong();
			long sqr=(long) Math.sqrt(N);
			long ans=0;
			for(long i=2;i<=sqr;i++){
				if(isPrime(N))
				{
					ans=N;
					break;
				}
				if(isPrime(i) && N%i==0)
				{
					long op=N/i;
					if(isPrime(op)){
					ans=op;
					break;}
					else
						ans=i;
				}
			}
			System.out.println(ans);
		}

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
