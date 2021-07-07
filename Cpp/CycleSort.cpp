#include<iostream> 
#include<stdio.h>
using namespace std; 
void sort(int arr[], int n) 
{ 
    int writes = 0; 
    for (int cycle_start = 0; cycle_start < n - 1; cycle_start++) {
        int item = arr[cycle_start]; 
        int pos = cycle_start; 
        for (int i = cycle_start + 1; i < n; i++) 
            if (arr[i] < item) 
                pos++;   
        if (pos == cycle_start) 
            continue; 
        while (item == arr[pos]) 
            pos += 1; 
  
        if (pos != cycle_start) { 
            swap(item, arr[pos]); 
            writes++; 
        } 
  
        while (pos != cycle_start) { 
            pos = cycle_start; 
  
            for (int i = cycle_start + 1; i < n; i++) 
                if (arr[i] < item) 
                    pos += 1; 
  
            while (item == arr[pos]) 
                pos += 1; 
   
            if (item != arr[pos]) { 
                swap(item, arr[pos]); 
                writes++; 
            } 
        } 
    } 
} 
  
int main() 
{ 	
	int f;
    cout<<"Enter length of array ";
    cin>>f;
    int arr[f];
    cout<<"Enter array"<<endl;
    for(int i=0;i<f;i++){
    	cin>>arr[i];
	}
    sort(arr, f); 
  
    cout << "Sorted array: " << endl; 
    for (int i = 0; i < f; i++) 
        cout << arr[i] << " "; 
    return 0; 
} 

