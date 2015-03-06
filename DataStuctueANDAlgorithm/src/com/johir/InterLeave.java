package com.johir;

import java.util.Arrays;

public class InterLeave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isInterleave("aabcc","dbbca","aadbbbaccc"));
	}
	    public static boolean isInterleave(String s1, String s2, String s3) {
	        
	    	boolean is=false;
	    	s1=s1+s2;
	    	char [] c=s1.toCharArray();
	    	Arrays.sort(c);
	    	s1=String.valueOf(c);
//	    	c=s2.toCharArray();
//	    	Arrays.sort(c);
//	    	s2=String.valueOf(c);
	    	c=s3.toCharArray();
	    	Arrays.sort(c);
	    	s3=String.valueOf(c);
	    	
	    	return s1.equals(s3);
	    }


}
