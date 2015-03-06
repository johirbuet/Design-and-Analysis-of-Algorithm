package com.johir;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Triangle(new int [] {10,50,5,1}));
	}
	
	static int Triangle(int [] A)
	{
		int ret=0;
		Arrays.sort(A);
		for(int i=0;i<A.length-2;i++)
		{
			if(A[i]+A[i+1]>A[i+2])
				return 1;
		}
		return ret;
	}

}
