#include <algorithm> 
#include <iostream> 
#include <vector> 
using namespace std; 

void bucketSort(float arr[], int n) 
{ 
	//creates n empty buckets 
	vector<float> b[n]; 

	//inputs array elements into different buckets 
	for (int i = 0; i < n; i++) { 
		int bi = n * arr[i];
		b[bi].push_back(arr[i]); 
	} 

	//sorts individual buckets 
	for (int i = 0; i < n; i++) 
		sort(b[i].begin(), b[i].end()); 

	//arr[ ] gets filled with buckets by concatenation
	int k = 0; 
	for (int i = 0; i < n; i++) 
		for (int j = 0; j < b[i].size(); j++) 
			arr[k++] = b[i][j]; 
} 

int main() 
{ 
	float arr[] = { 12.345, 98.765, 56.789, 54.321, 0.123, 9.876 }; //sample array
	int n = sizeof(arr) / sizeof(arr[0]); 
	bucketSort(arr, n); 

	cout << "The sorted array is: \n"; 
	for (int i = 0; i < n; i++) 
		cout << arr[i] << " "; 
	return 0; 
} 
