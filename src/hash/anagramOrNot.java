package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class anagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string1");
		String s1=scan.nextLine();
		System.out.println("enter string2");
		String s2=scan.nextLine();
		//checkAnagram(s1,s2);
		checkAnagram2(s1,s2);

	}

	private static void checkAnagram2(String s1, String s2) {
		// TODO Auto-generated method stub
		char[] ch=s2.toCharArray();
		Arrays.sort(ch);
		
		char[] ch2=s1.toCharArray();
		Arrays.sort(ch2);
		//sort other array also, two sorted arrays should be same for anagram
		if(new String(ch2).equals(new String(ch))){
			System.out.println("anagram");
		}
		else{
			System.out.println("not an anagram");
		}
	}

	private static void checkAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
		HashMap<Character,Integer> hm2=new HashMap<Character,Integer>();
		for(int i=0;i<ch1.length;i++){
			if(hm1.containsKey(ch1[i])){
				int count=hm1.get(ch1[i]);
				hm1.put(ch1[i], count+1);
			}
			else{
				hm1.put(ch1[i],1);
			}
		}
		for(int j=0;j<ch2.length;j++){
			if(hm2.containsKey(ch2[j])){
				int count=hm2.get(ch2[j]);
				hm2.put(ch2[j], count+1);
			}
			else{
				hm2.put(ch2[j],1);
			}
		}
		if(hm1.equals(hm2)){
			System.out.println("It is an anagram");
		
		}
		else{
			System.out.println("It is not an anagram");
		}
			
		
	}

}
