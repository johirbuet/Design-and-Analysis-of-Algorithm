package com.johir;

public class Leader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(leader(new int []{4,3,4,4,4,2}));

	}
	static int leader(int [] A)
	{
		int candidate=0;
		int candidatecount=0;
		int N=A.length;
		int leader=0;
		for(int i=0;i<N;i++)
		{
			if(candidatecount==0)
			{
				candidate=A[i];
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
			leader=candidate;
		
		int equileader=0;
		int leadercount=0;
		for(int i=0;i<N;i++){
			if(A[i]==leader)
				leadercount++;
			if(leadercount>(i+1)/2 && (count-leadercount)>(N-i-1)/2)
				equileader++;
		}
		return equileader;
	}
}
