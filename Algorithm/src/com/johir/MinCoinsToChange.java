package com.johir;

public class MinCoinsToChange {
	//private static int q=Integer.MAX_VALUE;
	static int time=0;
	static int [] r=new int[13];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getmin(new int [] {1,2,3},12));
		System.out.println(time);

	}
	static int getmin(int [] C,int P)
	{
		time++;
		
		int q=Integer.MAX_VALUE;
		if(P<=0)
		{
			q=0;
			return q;
		}
		if(r[P-1]>0)
			return r[P-1];
		for(int i=0;i<C.length;i++)
			q= Math.min(q, 1+getmin(C, P-C[i]));
		r[P-1]=q;
		return q;
	}
}
