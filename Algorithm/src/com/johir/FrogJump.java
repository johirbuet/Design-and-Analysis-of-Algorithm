package com.johir;

import java.util.Arrays;

public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={1, 3, 1, 4, 2, 3, 5, 4};
		System.out.println(solution(5, arr));

	}
	 public static int solution(int X, int[] A) {
	        // write your code in Java SE 8
	       // Arrays.sort(A);//Arrays.asList(A).indexOf(X);
	      //  int index=Arrays.binarySearch(A, X);
		 int index=getIndex(A, X);
	       // System.out.println("index="+index);
	        for(int i=X-1;i>0;i--)
	        {
	            if(index<getIndex(A, i))
	            {
	                return -1;
	                }
	            }
	            return index;
	    }
	 public static int getIndex(int [] A,int X){
		 for(int i=0;i<A.length;i++)
		 {
			 if(A[i]==X)
				 return i;
		 }
		 
		 return -1;
	 }

}
