// C++ implementation of Cocktail Sort 
#include <bits/stdc++.h> 
using namespace std; 
  
void CocktailSort(int a[], int n);
void printArray(int a[], int n);
  
int main() { 
    cout<<"Enter number of elements"<<endl;
    int n; cin>>n;

    cout<<"Enter elements seperated by space"<<endl;
    int a[n];
    for(int i=0; i < n; i++) cin>>a[i];
    CocktailSort(a, n); 
    cout<<"Sorted array : "<<endl;
    printArray(a, n); 
    return 0; 
} 

void CocktailSort(int a[], int n) { 
    bool swapped = true; 
    int start = 0; 
    int end = n - 1; 
  
    while (swapped) {  
        swapped = false; 
  
        // loop from left to right same as  the bubble sort 
        for (int i = start; i < end; ++i) { 
            if (a[i] > a[i + 1]) { 
                swap(a[i], a[i + 1]); 
                swapped = true; 
            } 
        } 
  
        if (!swapped) 
            break; 

        swapped = false; 
        --end; 

        for (int i = end - 1; i >= start; --i) { 
            if (a[i] > a[i + 1]) { 
                swap(a[i], a[i + 1]); 
                swapped = true; 
            } 
        } 
        ++start; 
    } 
} 

void printArray(int a[], int n) { 
    for (int i = 0; i < n; i++) 
        printf("%d ", a[i]); 
    printf("\n"); 
} 