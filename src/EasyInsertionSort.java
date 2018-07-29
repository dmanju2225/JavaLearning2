import java.util.Scanner;

public class EasyInsertionSort
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int arrayLength=scan.nextInt();
		System.out.println("enter integers of arraylength "+arrayLength);
		int[] arr=new int[arrayLength];
		for(int i=0;i<arrayLength;i++){
			arr[i]=scan.nextInt();
		}
		OinsertionSort(arr);//take element at each position from position 1
		//compare with previous elements until index reaches to 0, O(n2)
		//for almost sorted array insertion sort is good O(n)
	}

	private static void OinsertionSort(int[] arr)
	{
		// TODO Auto-generated method stub	
		for(int position=1;position<arr.length;position++){
			int index=position;
			while(index>0&&arr[index]<arr[index-1]){
				int temp=arr[index];
				arr[index]=arr[index-1];
				arr[index-1]=temp;
				index--;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
	}


