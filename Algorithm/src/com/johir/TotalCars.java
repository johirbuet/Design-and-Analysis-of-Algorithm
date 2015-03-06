package com.johir;

public class TotalCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={0, 1, 0, 1, 1};
		System.out.print(Cars(arr));
	}
	public static int Cars(int [] A)
	{
		int count=0;
		for(int i=0;i<A.length-1;i++)
        {
			if(A[i]!=0)
        		continue;
            for(int j=i+1;j<A.length;j++)
            {
            	if(A[j]!=1)
            		continue;
                count++;
                }
            }
            
		return count;
	}

}
