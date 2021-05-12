#include<bits/stdc++.h> 
using namespace std; 

int Comb_Sort(int arr[], int n) 
{ 
  int gap = n; 

  while (gap != 1) 
  { 
    gap = int(gap/1.3); 
    if (gap < 1) 
       gap= 1;

    for (int i=0; i<n-gap; i++) 
    { 
      if (arr[i] > arr[i+gap]) 
        swap(arr[i], arr[i+gap]); 
    } 
  } 
} 

int main() 
{ 
  int arr[] = {121, 28, 332, -656, -841, 172, 236, 110, -28, 11, 574}; 

  int n = sizeof(arr)/sizeof(arr[0]);          

  Comb_Sort(arr, n); 

    std::cout << "Input Array" << std::endl;
    std::cout << "{121, 28, 332, -656, -841, 172, 236, 110, -28, 11, 574}"<< std::endl;
    std::cout << "Sorted Array" << std::endl;
    
  for (int i=0; i<n; i++) 
    std::cout << arr[i] <<" "; 

  return 0; 
} 
