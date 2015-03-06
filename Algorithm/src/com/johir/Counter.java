package com.johir;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(get("9"));

	}
	public static String get(String S)
	{
		
		int len=S.length();
		if(len<2)
		{
			return "11";
		}
		String s1= S.substring(0, len/2);
		String s2=S.substring(len/2, len);
		long sl1=Long.parseLong(s1);
		long sl2=Long.parseLong(s2);
		if(sl2< sl1)
			return s1+s1;
		sl1=sl1+1;
		s1=""+sl1;
		return s1+s1;
	}
}
