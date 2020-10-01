#include <iostream>
using namespace std;

//maximum value in arr[ ]
int getMax(int arr[], int n)
{
	int mx = arr[0];
	for (int i = 1; i < n; i++)
		if (arr[i] > mx)
			mx = arr[i];
	return mx;
}

//counting sort of arr[ ] according to exp
void countSort(int arr[], int n, int exp)
{
    //output
	int op[n];
	int i, count[10] = { 0 };

	for (i = 0; i < n; i++)
		count[(arr[i] / exp) % 10]++;

	//position of this digit in op[ ]
	for (i = 1; i < 10; i++)
		count[i] += count[i - 1];

	for (i = n - 1; i >= 0; i--) {
		op[count[(arr[i] / exp) % 10] - 1] = arr[i];
		count[(arr[i] / exp) % 10]--;
	}

	//make arr[ ] contain sorted numbers according to current digit
	for (i = 0; i < n; i++)
		arr[i] = op[i];
}

void radixsort(int arr[], int n)
{
	int m = getMax(arr, n);

    //exp is 10^i where i is current digit number
	for (int exp = 1; m / exp > 0; exp *= 10)
		countSort(arr, n, exp);
}

void print(int arr[], int n)
{
	for (int i = 0; i < n; i++)
		cout << arr[i] << " ";
}

int main()
{
	int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
	int n = sizeof(arr) / sizeof(arr[0]);
	
	radixsort(arr, n);
    cout<<" The sorted array is: \n";
	print(arr, n);
	return 0;
}