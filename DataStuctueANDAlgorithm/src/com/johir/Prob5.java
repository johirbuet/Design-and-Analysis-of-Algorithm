package com.johir;

public class Prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long N=20;
		boolean done=false;
		while(!done){
		boolean ok=true;
		for(int i=1;i<=20;i++)
		{
			if(N%i!=0)
			{
				ok=false;
				break;
			}
		}
		if(ok)
		{
			done=true;
			break;
		}
		else
			N+=20;
		}
		System.out.println(N);

	}

}
