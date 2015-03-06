package com.johir;

public class Dominator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dominator(new int [] {3,4,3,2,3,-1,3,3}));

	}
	
	static int dominator(int [] A)
	{
		int candidate=0;
		int candidatecount=0;
		int candidateindex=0;
		int N=A.length;
		for(int i=0;i<N;i++)
		{
			if(candidatecount==0)
			{
				candidate=A[i];
				candidateindex=i;
				candidatecount++;
			}
			else
			{
				if(A[i]==candidate)
					candidatecount++;
				else
					candidatecount--;
			}
		}
		int count=0;
		for(int i=0;i<N;i++)
		{
			if(A[i]==candidate)
				count++;
		}
		if(count<=N/2)
			return 0;
		else
			return A[candidateindex];
		//return 0;
	}
}
