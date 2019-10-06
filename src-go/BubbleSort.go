package main

import (
	"fmt"
)

func bubbleSort(arr []int) {

	swapped := true;
	for swapped {
		swapped = false
		for i := 0; i < len(arr) - 1; i++ {
			if arr[i + 1] < arr[i] {
				Swap(arr, i, i + 1)
				swapped = true
			}
		}
	}	
}

func Swap(arr []int, i, j int) {
	tmp := arr[j]
	arr[j] = arr[i]
	arr[i] = tmp
}

func main() {

	arr := []int{1, 6, 2, 4, 9, 0, 5, 3, 7, 8}
	fmt.Println("Unsorted array: ", arr)
	bubbleSort(arr)
	fmt.Println("Sorted array: ", arr)
}