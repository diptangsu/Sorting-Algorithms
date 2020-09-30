#include <bits/stdc++.h>
#include "sorting_algorithms.h"
 
using namespace std; 

// A function to implement bubble sort 
void bubbleSort(int arr[], int n) 
{ 
	int i, j, is_swap = 0; 
	for (i = 0; i < n-1; i++)	 
	{
		is_swap=0;
		// Last i elements are already in place 
		for (j = 0; j < n-i-1; j++) 
			if (arr[j] > arr[j+1]) 
			{	
				swap(arr[j], arr[j+1]); 
				is_swap=1;
			}
		if(is_swap==0)
			break;
	}
} 


