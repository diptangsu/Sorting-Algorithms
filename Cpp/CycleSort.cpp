#include <iostream> 
using namespace std; 

// Function sort the array using Cycle sort 
void cycleSort(int arr[], int n)
{ 
	// This loop picks up an element in the currItem,
	// and finds the position to place this currItem in posForCurrItem.
	for (int start = 0; start <= n - 2; start++) { 
		int currItem = arr[start]; 
		
		// Since all elements smaller than currItem must occupy a position before currItem,
		// so to find posForCurrItem, we just need to get the number of smaller elements than currItem
		// after start.
		int smallerThanCurrItem = 0; 
		for (int i = start + 1; i < n; i++) 
			if (arr[i] < currItem) 
				smallerThanCurrItem++; 

		int posForCurrItem = start + smallerThanCurrItem;

		// In case the element is already at its correct place, we can move to the next element.	
		if (posForCurrItem == start) 
			continue; 

		// Special care needs to be taken to ignore the duplicate elements
		while (currItem == arr[posForCurrItem]) 
			posForCurrItem += 1; 

		// Now that we have the correct position for currItem, we can place it in its correct position.
		if (posForCurrItem != start) { 
			swap(currItem, arr[posForCurrItem]); 
		} 

		// Rotate the rest of the cycle.
		while (posForCurrItem != start) { 
			posForCurrItem = start; 

			for (int i = start + 1; i < n; i++) 
				if (arr[i] < currItem) 
					posForCurrItem += 1; 

			while (currItem == arr[posForCurrItem]) 
				posForCurrItem += 1; 

			if (currItem != arr[posForCurrItem]) { 
				swap(currItem, arr[posForCurrItem]); 
			} 
		} 
	} 
} 

void printArray(int arr[], int n){
	for (int i = 0; i < n; i++) 
		cout << arr[i] << " "; 

	cout << endl;
}

int main() 
{ 
	int n = 6;
	int maxElement = 100;
	int arr[n]; 

	for(int i = 0; i < n; i++) {
		arr[i] = rand() % maxElement;
	}

	cout << "Before sort: " << endl;
	printArray(arr, n);

	cycleSort(arr, n); 

	cout << "After sort : " << endl; 
	printArray(arr, n);

	return 0; 
} 
