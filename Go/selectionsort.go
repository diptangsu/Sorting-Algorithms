package main

import "fmt"

func main() {
	fmt.Println("Enter the number of elements")
	var n int
	fmt.Scan(&n)
	arr := make([]int, n)
	fmt.Printf("Enter %v elements\n", n)

	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}

	SelectionSort(arr)

	fmt.Println("sorted array:")
	for i := 0; i < n; i++ {
		fmt.Printf("%v ", arr[i])
	}
	fmt.Println()
}

func SelectionSort(arr []int) {
	var n = len(arr)
    for i := 0; i < n; i++ {
        var minIdx = i
        for j := i; j < n; j++ {
            if arr[j] < arr[minIdx] {
                minIdx = j
            }
        }
        arr[i], arr[minIdx] = arr[minIdx], arr[i]
    }
}
