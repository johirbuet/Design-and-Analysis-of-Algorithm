
// This is the Longest Increasing Sequence Using DP and it's complexity is O(n^2). It can be done in O(nlogn). But how? We'll see later.

package com.johir;

import java.util.Arrays;

public class LongestIncSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
		
		System.out.println(LISlen(arr));

	}
	public static int LISlen(int [] arr)
	{
		int [] L=new int[arr.length];
		Arrays.fill(L, 1);
		int currmax=1;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				int l=L[j]+1;
				if(arr[j]<arr[i] && l>currmax)
				{
					currmax=l;
				}
			}
			L[i]=currmax;
		}
		int k=0;
		for (int i : L) {
			System.out.print("L["+k+"]= "+i+" ");
			k++;
		}
		System.out.println();
		Arrays.sort(L);
		return L[L.length-1];
	}

}
