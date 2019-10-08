/*This program deals with Bubble Sort Algorithm. In this the array gets sorted from the right side.
Time Complexity -:
Best Case:		O(n)
Average Case:	o(n^2)
Worst Case:		O(n^2) */
/*Hint: If swapping not done throughout the checking of a pass(outer do-loop) then swapping and checking is not required further*/
import java.util.Scanner;
class Optimized-bubble-sort{
	public static void sort(int[] a){
		int i=0,swap=1,j,temp,max;
		while(swap==1){
			swap=-1;
			max=a[i];
			for(j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1])
				{
					swap=1;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			++i;
		}
		System.out.println("-----------------------------------");
		System.out.println("Sorted Array:");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
	}
	public static void main(String args[])throws Exception{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=d.nextInt();
		int[] a =new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++){
			a[i]=d.nextInt();
		}
		sort(a);
	}
}