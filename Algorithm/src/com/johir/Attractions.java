package com.johir;

import java.util.Arrays;

public class Attractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(attractions(new int [] {4, 1, 1, 2, 4, 2, 4, 1}));
		int [] a=Arrays.copyOfRange(new int [] {4, 1, 1, 2, 4, 2, 4, 1}, 1, 7);
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	static int attractions(int [] A)
	{
		int total=0;
		int low=A[0];
		int N=A.length;
		int high=A[N-1];
		int [] first;
		int [] second;
		for(int i=1;i<N-1;i++)
		{
			//first=Arrays.copyOfRange(A, 0, i);
			first=new int[i+1];
			second=new int[N-i];
			System.arraycopy(A, 0, first, 0, i-1);
			//second=Arrays.copyOfRange(A, i+1, N-1);
			System.arraycopy(A, 0, second, i, N-1);
			if(getdistincts(first)==getdistincts(second) && getdistincts(first)>0)
			    total++;
		}
		return total;
	}
	static int getdistincts(int [] A)
	{
		Arrays.sort(A);
		int N=A.length;
		int dist=0;
		for(int i=0;i<N-1;i++)
		{
			if(A[i]!=A[i+1])
				dist++;
		}
		
		return dist;
	}
}
