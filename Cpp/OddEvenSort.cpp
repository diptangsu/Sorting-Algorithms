#include <bits/stdc++.h> 
using namespace std; 

// Perform bubbleSort on every alternating element starting from 'start'
// Returns true if the alternating elements are sorted already, otherwise false.
bool bubbleSort(int arr[], int n, int start)
{
    bool isSorted = true;

    for (int i = start; i <= n - 2; i = i + 2) { 
        if (arr[i] > arr[i + 1]) { 
            swap(arr[i], arr[i + 1]); 
            isSorted = false; 
        } 
    } 

    return isSorted;
}

void oddEvenSort(int arr[], int n) 
{ 
    bool isSorted = false; 

    while (!isSorted) { 
        isSorted = true; 

        // Perform Bubble sort on odd indexed element, 
        // which is same as performing bubble sort on every 
        // alternating element starting from 1st element.
        isSorted = bubbleSort(arr, n, 1);       

        // Perform Bubble sort on even indexed element, 
        // which is same as performing bubble sort on every 
        // alternating element starting from 0th element.       
        isSorted = bubbleSort(arr, n, 0); 
    } 

} 

void printArray(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
        cout << arr[i] << " "; 
    cout << "\n"; 
} 

// Driver program.
int main() 
{ 
    int n = 6, maxElement = 100;
    int arr[n]; 
    
    for(int i = 0; i < n; i++) {
        arr[i] = rand() % maxElement;
    }

    cout << "Before sorting: " << endl;
    printArray(arr, n); 

    oddEvenSort(arr, n); 
    
    cout << "After sorting: " << endl;
    printArray(arr, n); 

    return 0; 
} 
