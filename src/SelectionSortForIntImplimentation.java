import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SelectionSortForIntImplimentation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of integers");
		int n = scan.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			al.add(scan.nextInt());
		}
		//selectionSort(al);
		OselectionSort(al);//easy, calculate min for remaining array 
		//,store that index, swap with that index starting from 0,O(n2)
	}
	private static void selectionSort(ArrayList<Integer> al) {
		int n = al.size();                                                       // int max_index=0
		while (n > 1) {                                                         // int max = Integer.MIN_VALUE;
			int max_index = 0;                                                   // max = al.get(i);
			for (int i = 0; i < n; i++) {
				if (al.get(i) > al.get(max_index)) {
					max_index = i;
				}
			}
			Collections.swap(al, n - 1, max_index);
			n = n - 1;
		}
		System.out.println(al);
	}
	private static void OselectionSort(ArrayList<Integer> al) {
		int count=0;
		int min_index=0;
		int i=0;
		while(count<al.size()){
			int min=Integer.MAX_VALUE;
			for(i=count;i<al.size();i++){
			if(al.get(i)<min){	
				min=al.get(i);
				min_index=i;	
			}
		}
		Collections.swap(al,count,min_index);;
		count++;
		
		/*
		 * for(int i=0;i<al.size()-1;i++){
		 * 	int min=Integer.MAX_VALUE;
			for(int j=i;j<al.size();j++){
				if(al.get(j)<min){	
					min=al.get(j);
					min_index=j;	
				}
			}
			Collections.swap(al,count,min_index);
			}
			}
		 * 
		 */
	}
		System.out.println(al);
}
}
