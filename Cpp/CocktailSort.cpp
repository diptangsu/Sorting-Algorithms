#include<iostream>
using namespace std;
void cocktailSort(int arr[], int n){
   bool flag = true;
   int start = 0, end = n-1;
   while(flag){
      flag = false;
      for(int i = start; i<end; i++){ //scan from left to right as bubble sort
         if(arr[i] > arr[i+1]){
            swap(arr[i], arr[i+1]);
            flag = true;
         }
      }
      if(!flag){ //if nothing has changed simply break the loop
         break;
      }
      flag = false;
      end--; //decrease the end pointer
      for(int i = end - 1; i >= start; i--){ //scan from right to left
         if(arr[i] > arr[i+1]){
            swap(arr[i], arr[i+1]);
            flag = true;
         }
      }
      start++;
   }
}
main() {
   int data[] = {54, 74, 98, 154, 98, 32, 20, 13, 35, 40};
   int n = sizeof(data)/sizeof(data[0]);
   cout << "Sorted Sequence ";
   cocktailSort(data, n);
   for(int i = 0; i <n;i++){
      cout << data[i] << " ";
   }
}
