import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BubbleSortForIntImplimentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of integers");
		int n = scan.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			al.add(scan.nextInt());
		}
		//bubbleSort(al);
		ObubbleSort(al);//easy, compare each one with all and swap, O(n2)
	}
	private static void bubbleSort(ArrayList<Integer> al) {
		int flag = 1;
		while (flag == 1) {
			flag = 0;
			for (int i = 0; i < al.size() - 1; i++) {
				int x = al.get(i);
				int y = al.get(i + 1);
				if (x > y) {
					Collections.swap(al,i,i+1);
					flag = 1; //for the entire for loop , it will enter into this condition. if not while loop breaks at that time //int temp = x;
				}                                                             //					x = y;
			}                                                                 //					y = temp;
		}
		System.out.println(al);	//				al.set(i, x);// to modify same array list we are setting the values at index		
	}                           //				al.set(i + 1, y);
	
	private static void ObubbleSort(ArrayList<Integer> al) {
		for(int i=0;i<al.size()-1;i++){
			for(int j=i+1;j<al.size();j++){
				if(al.get(i)>al.get(j)){
					Collections.swap(al,i,j);
					System.out.println(al);
				}
			}
		}
		System.out.println(al);
	}
	}		
                                                                
                                                        
			

		

	