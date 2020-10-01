#include<bits/stdc++.h> 
using namespace std; 
    
// A function to do counting sort of arr[] according to 
// the digit represented by exp. 
void CountSort(int arr[], int n, int exp) 
{ 
    int output[n]; // output array 
    int i, count[10] = {0}; 
  
    // Store count of occurrences in count[] 
    for (i = 0; i < n; i++) 
        count[ (arr[i]/exp)%10 ]++; 
  
    // Change count[i] so that count[i] now contains actual 
    //  position of this digit in output[] 
    for (i = 1; i < 10; i++) 
        count[i] += count[i - 1]; 
  
    // Build the output array 
    for (i = n - 1; i >= 0; i--) 
    { 
        output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
        count[ (arr[i]/exp)%10 ]--; 
    } 
  
    // Copy the output array to arr[], so that arr[] now 
    // contains sorted numbers according to current digit 
    for (i = 0; i < n; i++) 
        arr[i] = output[i]; 
} 
  
// The main function to that sorts arr[] of size n using  
// Radix Sort 
void RadixSort(int arr[], int n) 
{ 
    // Find the maximum number to know number of digits 
    int m = arr[0]; 
    
    for(int i = 1; i < n; i++){
        m = max(m,arr[i]); // gives max of 2 elements
    }
    // Do counting sort for every digit. Note that instead 
    // of passing digit number, exp is passed. exp is 10^i 
    // where i is current digit number 
    for (int exp = 1; m/exp > 0; exp *= 10) 
        CountSort(arr, n, exp); 
} 
  
  
// Driver program to test above functions 
int main() 
{ 
    int arr[] = {17, 45, 75, 90, 802, 24, 2, 66}; 
    int n = sizeof(arr)/sizeof(arr[0]); 
    RadixSort(arr, n); 

    // print the result
    for(int i = 0;i < n; i++)
    cout << arr[i] << " ";
    return 0; 
} 