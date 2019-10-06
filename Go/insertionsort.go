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
	InsertionSort(arr)
	fmt.Println("sorted array:")
	for i := 0; i < n; i++ {
		fmt.Printf("%v ", arr[i])
	}
	fmt.Println()
}

func InsertionSort(arr []int) {
	n := len(arr)
	var j int
	for i := 1; i < n; i++ {
		tmp := arr[i]
		for j = i; j > 0; j-- {
			if arr[j - 1] > tmp {
				arr[j] = arr[j - 1]
			} else {
				break
			}
		}
		arr[j] = tmp
	}
}
