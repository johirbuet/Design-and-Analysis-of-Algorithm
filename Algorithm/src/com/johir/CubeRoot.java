package com.johir;

public class CubeRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateCubeSum(1739));
	}
	public static int  calculateCubeSum(int n){
		int count=0;
		int root=(int) Math.cbrt(n);
		int [] array=new int[root];
		for(int i=0;i<root;i++)
		{
			array[i]=(i+1)*(i+1)*(i+1);
		}
		
		for(int i=0;i<root-1;i++)
		{
			for(int j=i+1;j<root;j++)
			{

			}
		}
		return count;
	}
}
