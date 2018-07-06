package hash;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class PriorityQueueTopKFreqIntegers
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter frequency");
		int k=scan.nextInt();
		System.out.println("enter array size");
		int n=scan.nextInt();
		System.out.println("enter array elements");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			
			a[i]=scan.nextInt();
		}
		priorityQ(a,n,k);

	}

	private static void priorityQ(int[] a, int n, int k)
	{
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			
			if(hm.containsKey(a[i]))
			{
				int count=hm.get(a[i]);
				hm.put(a[i],count+1);
			}
			else
				hm.put(a[i],1);
		}
		PriorityQueue<int[]> pq=new PriorityQueue<int[]>(new Comparator<int[]>(){//pq is list of array, 
			//each box has 2 elements array, for example 1(element)->2(count), 2->3, 3->4
			//1st box {1,2},2nd box{2,3},3rd box{3,4}, i am comparing 2 boxes with 
			//their second element that is at index 1
			@Override
			public int compare(int[] a, int[] b) {//comparing 2 boxes
				return a[1]-b[1];//comparing with second element in each box nothing but count
			}});
		Set<Integer> hs=hm.keySet();
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			Integer cr=(Integer)it.next();
			pq.add(new int[]{cr,hm.get(cr)});
			if(pq.size()>k)
			{
				pq.poll();
			}
		}
				//System.out.println(pq.peek().ch +  " " +pq.peek().freq );	
		//System.out.println(pq);
		for(int[] d : pq)// tp print iterate over pq that is list of arrays, each array contains element and count
		{
			System.out.println(d[0]+ " "+d[1]);
		}
	
		}
	}
