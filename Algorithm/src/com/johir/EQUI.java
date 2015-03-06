package com.johir;

public class EQUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(equi(new int [] {4,3,4,4,4,2}));
	}
	static int equi(int [] A)
	{
		long sum=0;
		long leftsum=0;
		long sumright=0;
		int N=A.length;
		for(int i=0;i<N;i++)
		{
			sum+=A[i];
		}
		
		for(int i=0;i<N;i++)
		{
			sumright=sum-leftsum-A[i];
			if(leftsum==sumright)
				return i;
			leftsum+=A[i];
		}
		return -1;
	}

}
