package com.johir;

import java.util.Arrays;

public class MinMaxDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minmax(3, 5, new int [] {2,1,5,1,2,2,2}));
	}
	
	static boolean isValidSize(int [] A,int count,int K)
	{
	/*	Arrays.sort(A);
		int N=A.length;
		int low=A[N-1];
		int up=
		return true;*/
		int N=A.length;
		int blocsum=0;
		int blockcnt=1;
		for(int i=1;i<N;i++)
		{
			if(blocsum+i>K)
			{
				blocsum=i;
				blockcnt++;
			}
			else
				blocsum+=i;
			
		}
		if(blockcnt>=K)
			return false;
		return true;
	}
	
	static int minmax(int K,int M,int [] A)
	{
		Arrays.sort(A);
		int N=A.length;
		int low=A[N-1];
		int up=0;
		int mid=0;
		int result=0;
		for(int i=0;i<N;i++)
			up+=A[i];
		if(K==1)
			return up;
		if(K>=N)
			return low;
		while(low<=up)
		{
			mid=(low+up)/2;
			if(isValidSize(A, K, mid))
			{
				up=mid-1;
				result=mid;
				
			}
			else
				low=mid+1;
		}
		
		return low;
	}

}
