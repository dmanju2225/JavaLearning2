package hash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class missingElement {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//int[] a = new int[3];
		int n=scan.nextInt();
		//int[] a=new int[n];
		List<Integer> AL= new LinkedList<Integer>();
		
		//List<Integer> AL=new ArrayList<Integer>();
		int i = 0;
		while(i< n){
			 AL.add(scan.nextInt());
			 i++;
		}
		scan.close();
		int missNum=method(AL);
		System.out.println(missNum);
		

	}
    //private static int method(int[] a, int n) {
	private static int method(List<Integer> al) {
		// TODO Auto-generated method stub
		int sum=0;
		//int n = a.length;
		//for(int i=0;i<n;i++){
		
		for(Integer x: al){
			sum=sum+x;
		}
		int n = al.size()+1;
		int missNum = ((n*(n+1))/2)-sum;
		return missNum;
	}

}

