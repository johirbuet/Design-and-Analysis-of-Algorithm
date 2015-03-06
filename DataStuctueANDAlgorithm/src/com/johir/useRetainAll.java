package com.johir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class useRetainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str1={"Dhaka","Khulna","Magura","Chittagong","Barishal","Vola"};
		String [] str2={"Vola","Khulna","Savar"};
		List l1=new ArrayList(Arrays.asList(str1));
		List l2=Arrays.asList(str2);
		System.out.println(l1.retainAll(l2));
		System.out.println(l1);
	}

}
