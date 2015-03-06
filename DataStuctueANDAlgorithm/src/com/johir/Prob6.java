package com.johir;

public class Prob6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum1=0;
		long sum2=0;
		long dif=0;
		for(int i=1;i<=100;i++)
		{
			sum1+=i*i;
		}
		sum2=(50*101)*(50*101);
		dif=Math.abs(sum1-sum2);
		System.out.println(dif);

	}

}
