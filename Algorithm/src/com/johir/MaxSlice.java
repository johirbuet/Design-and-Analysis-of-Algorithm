package com.johir;

public class MaxSlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int maxSlice(int [] A)
	{
		int N=A.length;
		int max=A[0];
		int maxterm=0;
		int movingtotal=A[0];
		for(int i=1;i<N;i++)
		{
			movingtotal=Math.max(A[i], movingtotal+A[i]);
			max=Math.max(max,movingtotal);
		}
		
		return max;
	}
}
