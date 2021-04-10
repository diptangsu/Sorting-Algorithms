//Implementing Count Sort
#include <iostream>
#include "sorting_algorithms.h"

using namespace std;

void countSort(int arr[], int num)
{

    int max = arr[0];
    int min = arr[0];
    for(int i=1;i<num;i++){//Iterating through the array for maxiumum and minimum items
        if(max<arr[i])
            max=arr[i];
			
        if(min>arr[i])
            min=arr[i];
    }
    int* sums;
    int sumSize = max-min+1;
	
    //Creating an array with an index for each element between minimum and maximum items of given array
    sums = (int*) calloc(sumSize,sizeof(int));//Using calloc so that memory allocation and initialization (to 0) happens in one go
    for(int i=0;i<num;i++)
        sums[arr[i]-min]++; //Storing count of each unique item in sums array at the its index
		
    for(int i=1;i<sumSize;i++)
        sums[i] = sums[i-1]+sums[i]; //Cumulating sums of all items
            
    int sorted[num]; //For sorted items
    for(int i=0;i<num;i++){
        sums[arr[i]-min]--;
        sorted[sums[arr[i]-min]] = arr[i]; //Checking values in sums array and inserting items in sorted array at appropriate indices
    }
    
    copy(sorted, sorted + num, arr);
}
