import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*take the last element(pivot) and look for the right index for that element by comparing 
 * //start and end(end-1) , elements at start should be less than pivot and elements at end 
 * //should be greater than pivot, if not swap start and end elements, whenever start>end, 
 * //start will be the right index to swap the pivot and return that index. 
 * //it is divide and conquer method and it repeats until the array has one element where it return.
 */
public class QuickSortImplimentation
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("enter arraylist size");
		int n = scan.nextInt();
		System.out.println("enter integers of size" + n);
		for (int i = 0; i < n; i++)
		{
			al.add(scan.nextInt());
		}
		quickSort(al, 0, n - 1);
		System.out.println(al);
	}

	private static void quickSort(ArrayList<Integer> al, int start, int end)
	{
		if (start >= end)
		{
			return;
		}
		int pi = partitionFunction(al, start, end);// pi is partition index
		if(k==pi){sysout al.get(pi);
		else if(k<pi){
		quickSort(al, start, pi - 1);
		}
		else if(k>pi){quickSort(al, pi + 1, end);}
	}

	private static int partitionFunction(ArrayList<Integer> al, int start, int end)
	{
		int pivotIndex = end;
		int pivot = al.get(end);
		end = end - 1;
		while (start <= end)
		{
			if (al.get(start) <=pivot)//= to handle repeated elements, making sure when same element 
				//occurs always keep them left side
			{
				start++;
			}
			else if (al.get(end) > pivot)// if u put = always repeated elements in the right
			{
				end--;
			}
			else
			{
				Collections.swap(al, start, end);
				start++;
				end--;
			}

		}
		Collections.swap(al, start, pivotIndex);
		return start;
	}

}
