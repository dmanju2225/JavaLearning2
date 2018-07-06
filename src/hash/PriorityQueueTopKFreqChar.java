package hash;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class PriorityQueueTopKFreqChar
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = scan.nextLine();
		System.out.println("enter an integer");
		Integer k = scan.nextInt();
		topKfreq(s1, k);
		scan.close();

	}

	private static void topKfreq(String s1, Integer k)
	{
		// TODO Auto-generated method stub
		int n=s1.length();
		HashMap<Character,Integer> hm =new HashMap<Character,Integer>();
		for(int i=0;i<n;i++)
		{
			char c=s1.charAt(i);
			if(hm.containsKey(c))
			{
				int count=hm.get(c);
				hm.put(c,count+1);
			}
			else
				hm.put(c,1);
		}
		PriorityQueue<CharFreq> pq=new PriorityQueue<CharFreq>();
		
		Set<Character> hs=hm.keySet();
		Iterator<Character> it=hs.iterator();
		while(it.hasNext())
		{
			Character cr=(Character)it.next();
			pq.add(new CharFreq(cr,hm.get(cr)));
			if(pq.size()>k)
			{
				pq.poll();
			}
		}
		//System.out.println(pq.peek().ch +  " " +pq.peek().freq );	
		System.out.println(pq);
	}
}
class CharFreq implements Comparable<CharFreq>
{
	char ch;
	 int freq;

	 CharFreq(char ch,int freq)
	 {
		 this.ch=ch;
		 this.freq=freq;
	 }
	@Override
	public int compareTo(CharFreq arg0)
	{
		// TODO Auto-generated method stub
		return Integer.compare(this.freq, arg0.freq);//priority queue calling compare method like 
		//cf1.compareTo(cf2) so this refers to cf1 becoz calling with cf1
	}	
	public String toString()
	{
		
		return ch+" "+freq;	
	}
}

