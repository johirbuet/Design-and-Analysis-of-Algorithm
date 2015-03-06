package com.johir;

public class Cloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameEntry g1=new GameEntry();
		GameEntry g2=new GameEntry();
		GameEntry g3=new GameEntry();
		GameEntry g4=new GameEntry();
		GameEntry g5=new GameEntry();
		GameEntry [] A={g1,g2,g3,g4,g5};
		GameEntry [] B;
		B=A.clone();
		A[4].score=50;
		System.out.println(B[4].score);
	}

}

class GameEntry{
	public int score=0;
}