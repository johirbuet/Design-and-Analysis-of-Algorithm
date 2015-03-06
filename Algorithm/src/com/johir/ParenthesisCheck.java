package com.johir;

public class ParenthesisCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("{{{{{{"));
	}
	
	static int check(String S)
	{
		int ret=1;
		int index=0;
		int N=S.length();
		char [] ch=new char[N];
		
		for(int i=0;i<N;i++)
		{
			if(S.charAt(i)=='(')
				ch[index++]=S.charAt(i);
			else if(S.charAt(i)=='{')
				ch[index++]=S.charAt(i);
			else if(S.charAt(i)=='[')
				ch[index++]=S.charAt(i);
			else if(S.charAt(i)==')')
			{
				if(index==0)
					return 0;
				if(ch[--index]!='(')
					return 0;
			}
			else if(S.charAt(i)=='}')
			{
				if(index==0)
					return 0;
				if(ch[--index]!='{')
					return 0;
			}
			else if(S.charAt(i)==']'&& index>0)
			{
				if(index==0)
					return 0;
				if(ch[--index]!='[')
					return 0;
			}
			
				
		}
		if(index==0)
			return 1;
		else
			return 0;
	}

}
