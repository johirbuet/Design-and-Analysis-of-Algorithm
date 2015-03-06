package com.johir;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("Astronomer","Moon-Stare’r"));
	}
	public static boolean isAnagram(String str1,String str2){
		boolean isAnagram=true;
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		for(int i=0;i<str1.length();i++){
			if(!(str1.charAt(i)>='a' && str1.charAt(i)<='z')){
					continue;
					}
			String sh=str1.substring(i, i+1);
			
			if(!str2.contains(sh))
				isAnagram=false;
			if(str2.contains(sh))
				str2=str2.replaceFirst(sh,"");
		}
		if(!isAnagram)
			return false;
		for(int i=0;i<str2.length();i++){
			if(!(str2.charAt(i)>='a' && str2.charAt(i)<='z')){
				continue;
				}
		String sh=str2.substring(i, i+1);
			
			if(!str1.contains(sh))
				isAnagram=false;
			str1=str1.replaceFirst(sh,"");
		}
		
		return isAnagram;
	}
}
