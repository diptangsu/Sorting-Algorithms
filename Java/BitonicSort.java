/* Java program for Bitonic Sort.  
This program works only when size of input is a power of 2. */
public class BitonicSort  
{  
static void exchange(int arr[], int i, int j, boolean d)  
{  
    int temp;  
    if (d==(arr[i]>arr[j]))  
    {  
            temp = arr[i];  
        arr[i] = arr[j];  
        arr[j] = temp;  
    }  
}  
/* It recursively sorts a bitonic sequence in ascending order*/
static void merge(int arr[], int l, int c, boolean d)  
{  
    int k,i;  
    if (c>1)  
    {  
        k = c/2;  
        for (i=l; i<l+k; i++)  
            exchange(arr, i, i+k, d);  
        merge(arr, l, k, d);  
        merge(arr, l+k, k, d);  
    }  
}  
 /* produces a bitonic sequence by recursively sorting
 its two halves in opposite sorting  orders */
static void bitonicSort(int arr[],int l, int c, boolean d)  
{  
    int k;  
    if (c>1)  
    {  
        k = c/2;  
        bitonicSort(arr, l, k, true);  
        bitonicSort(arr, l+k, k, false);  
        merge(arr,l, c, d);  
    }  
}  
 /*Caller of bitonicSort for sorting the entire array 
      of length N in ASCENDING order */
static void sort(int arr[], int n, boolean order)  
{  
    bitonicSort(arr,0, n, order);  
}  
public static void main(String[] args)  
{  
    int arr[]= {2, 14, 2, 13, 1, 25, 50, 20};  
    int n = arr.length;  
    int i;  
    boolean order = true;     
    sort(arr, n, order);  
   
    System.out.println("Sorted array: \n");  
    for (i=0; i<n; i++)  
        System.out.println(arr[i]);  
}  
}  