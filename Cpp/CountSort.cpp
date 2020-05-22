//Implementing Count Sort
#include <iostream>
using namespace std;
int main()
{
    cout<<"Enter number of items: "; //For size of array
    int num, i;
    cin>>num;
    while(num<=0){
        cout<<"Enter a number more than 0\n";
        cin>>num;
    }
    int arr[num];
    cout<<"Enter the items: ";
	
    for(i=0;i<num;i++)
        cin>>arr[i];

    int max = arr[0];
    int min = arr[0];
    for(i=1;i<num;i++){//Iterating through the array for maxiumum and minimum items
        if(max<arr[i])
            max=arr[i];
			
        if(min>arr[i])
            min=arr[i];
    }
    int* sums;
    int sumSize = max-min+1;
	
    //Creating an array with an index for each element between minimum and maximum items of given array
    sums = (int*) calloc(sumSize,sizeof(int));//Using calloc so that memory allocation and initialization (to 0) happens in one go
    for(i=0;i<num;i++)
        sums[arr[i]-min]++; //Storing count of each unique item in sums array at the its index
		
    for(i=1;i<sumSize;i++)
        sums[i] = sums[i-1]+sums[i]; //Cumulating sums of all items
            
    int sorted[num]; //For sorted items
    for(i=0;i<num;i++){
        sums[arr[i]-min]--;
        sorted[sums[arr[i]-min]] = arr[i]; //Checking values in sums array and inserting items in sorted array at appropriate indices
    }
    for(i=0;i<num;i++)
        cout<<sorted[i]<<" ";
    return 0;
}
