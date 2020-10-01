#include <bits/stdc++.h> 
using namespace std; 

void sort(int a[], int n) 
{ 
	int max = *std::max_element(a, a + n); 
	int min = abs(*std::min_element(a, a + n)); 

	//creates hash function upto max size 
	int pos[max + 1] = { 0 }; //positive
	int neg[min + 1] = { 0 }; //negative

	//count
	for (int i = 0; i < n; i++) { 
		if (a[i] >= 0) 
			pos[a[i]] += 1; 
		else
			neg[abs(a[i])] += 1; 
	} 

	//prints present negative numbers according to their count
	for (int i = min; i > 0; i--) { 
		if (neg[i]) { 

			for (int j = 0; j < neg[i]; j++) {				 
				cout << (-1) * i << " "; 
			} 
		} 
	} 

	//prints present positive numbers according to their count
	for (int i = 0; i <= max; i++) { 

		if (pos[i]) { 

			for (int j = 0; j < pos[i]; j++) { 
				cout << i << " "; 
			} 
		} 
	} 
} 

int main() 
{ 
	int a[] = {-7, -3, -1, -4, -5, -2, -6, 0, 3, 6, 1, 7, 4, 2, 5}; 
	int n = sizeof(a) / sizeof(a[0]); 
	sort(a, n); 
	return 0; 
} 
