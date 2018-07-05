package hash;

import java.util.Scanner;


public class reverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		reverseEveryword(s1);

	}

	private static void reverseEveryword(String s1) {
		// TODO Auto-generated method stub
		String[] s2=s1.split("\t");//for splitting with tab
		//String[] s2=s1.split("\\s");//for splitting with space if both are there do in place swap for each word
		System.out.println("size is "+s2.length);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length;i++){
			System.out.println("word is ("+s2[i]+")");
			String reverse="";
			int n=s2[i].length();
			String s=s2[i];
			char[] ch=s.toCharArray();
			for(int j=n-1;j>=0;j--){
				reverse=reverse+ch[j];
			}
			sb.append(reverse+'\t');
			}
		System.out.println(sb);
	}

}
