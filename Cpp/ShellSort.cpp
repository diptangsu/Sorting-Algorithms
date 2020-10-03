#include<iostream>
using namespace std;
void swapping(int &a, int &b) {        
//to swap the content of a and b
   int temp;
   temp = a;
   a = b;
   b = temp;
}
void display(int *array, int size) {
//to display the elements in array
   for(int i = 0; i<size; i++)
      cout << array[i] << " ";
   cout << endl;
}
void shellSort(int *arr, int n) {
   int gap, j, k;
   for(gap = n/2; gap > 0; gap = gap / 2) { 
      decreasing by gap /2
      for(j = gap; j<n; j++) {
         for(k = j-gap; k>=0; k -= gap) {
            if(arr[k+gap] >= arr[k])
               break;
            else
               swapping(arr[k+gap], arr[k]);
         }
      }
   }
}
int main() {
   int n;
   cout << "Enter number of elements: ";
   cin >> n;
   //create an array with given number of elements
   int arr[n];     
   cout << "Enter elements:" << endl;
   for(int i = 0; i<n; i++) {
      cin >> arr[i];
   }
   cout << "Before Sorting: ";
   display(arr, n);
   shellSort(arr, n);
   cout << "After Sorting: ";
   display(arr, n);
}
