/**
* Compares various sorting algorithms.
* To execute, compile files using:
* g++ *.cpp -o output
* Run:
* output.exe  
*/

#include <bits/stdc++.h> 
#include <algorithm> 
#include <chrono>
#include<string>

#include "sort_type.h"
#include "sorting_algorithms.h"

using namespace std;

int SIZE = 600;
int MAX_ELEMENT = 1000;

void printSortingTime(SortType sortType, int arr[]){
	int arrCopy[SIZE];
	copy(arr, arr + SIZE, arrCopy);
	string algorithmUsed = "";
	
	auto start = chrono::high_resolution_clock::now();

	switch(sortType){
		case BUBBLE:
			bubbleSort(arrCopy, SIZE);
			algorithmUsed = "BUBBLE_SORT";
			break;
		case COUNT:
			countSort(arrCopy, SIZE);
			algorithmUsed = "COUNT_SORT";
			break;
		case HEAP:
			heapSort(arrCopy, SIZE);
			algorithmUsed = "HEAP_SORT";
			break;
		case INSERTION:
			insertionSort(arrCopy, SIZE);
			algorithmUsed = "INSERTION_SORT";
			break;
		case MERGE:
			MergeSort(arrCopy, 0, SIZE - 1);
			algorithmUsed = "MERGE_SORT";
			break;
		case QUICK:
			quickSort(arrCopy, 0, SIZE - 1);
			algorithmUsed = "QUICK_SORT";
			break;
		case SELECTION:
			selectionSort(arrCopy, SIZE);
			algorithmUsed = "SELECTION_SORT";
			break;
	}

	auto finish = chrono::high_resolution_clock::now();
	auto timeTaken = chrono::duration_cast<chrono::nanoseconds>(finish-start).count();
	printf("%-17s %15d \n", algorithmUsed.c_str(), timeTaken);

}

void compareSortingAlgorithms(int arr[]){
	printSortingTime(SortType::BUBBLE, arr);
	printSortingTime(SortType::COUNT, arr);
    printSortingTime(SortType::HEAP, arr);
    printSortingTime(SortType::INSERTION, arr);
    printSortingTime(SortType::MERGE, arr);
    printSortingTime(SortType::QUICK, arr);
    printSortingTime(SortType::SELECTION, arr);
}

int main(){
	int arr[SIZE];

	for(int i = 0; i < SIZE; i++){
		arr[i] = rand() % MAX_ELEMENT;
	}

	cout << "Array length = " << SIZE << endl;
	cout << "\nElements randomly distributed: " << endl;
	cout << "\nSorting Algorithm\tTime Taken(ns)" << endl;

	compareSortingAlgorithms(arr);
	
	cout << "\nElements already sorted: " << endl;
	cout << "\nSorting Algorithm\tTime Taken(ns)" << endl;
	
	sort(arr, arr + SIZE);
	compareSortingAlgorithms(arr);

	cout << "\nElements sorted in reverse order:" << endl;
	cout << "\nSorting Algorithm\tTime Taken(ns)" << endl;

	reverse(arr, arr + SIZE);
	compareSortingAlgorithms(arr);
}

