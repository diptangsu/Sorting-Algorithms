

// C++ program to sort an array using the bucket sort method
#include <algorithm> 
#include <iostream> 
#include <vector> 
using namespace std; 

// to sort arr[] of size n using bucket sort
void bucketSort(float arr[], int n) 
{ 
	
	vector<float> b[n]; 
    // Put array elements in different buckets 
	for (int i = 0; i < n; i++) { 
		int bi = n * arr[i]; // Index in bucket 
		b[bi].push_back(arr[i]); 
	} 
    // sorting the buckets 
	for (int i = 0; i < n; i++) 
		sort(b[i].begin(), b[i].end()); 
    // add all the buckets into arr.
	int index = 0; 
	for (int i = 0; i < n; i++) 
		for (int j = 0; j < b[i].size(); j++) 
			arr[index++] = b[i][j]; 
} 
//main driver code
int main() 
{ 
	float arr[] = { 0.878, 0.463, 0.616, 0.1234, 0.665, 0.3154 }; 
	int n = sizeof(arr) / sizeof(arr[0]); 
	bucketSort(arr, n); 

	cout << "here is the sorted array: \n"; 
	for (int i = 0; i < n; i++) 
		cout << arr[i] << " "; 
	return 0;
};

