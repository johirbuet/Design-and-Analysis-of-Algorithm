package com.johir;

import java.util.Arrays;

public class MaxIntersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(new int [] {1,5,2,1,4,0}));
	}
	
	public static int max(int [] A)
	{
		int count=0;
		
		int N=A.length;
		//Arrays.sort(A);
		for(int i=0;i<N-1;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				if(j-i<=A[j]+A[i])
					count++;
			}
		}
		if(count>10000000)
			count=-1;
		return count;
	}
}
