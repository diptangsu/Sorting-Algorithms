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
	HeapSort(arr)
	fmt.Println("sorted array:")
	for i := 0; i < n; i++ {
		fmt.Printf("%v ", arr[i])
	}
	fmt.Println()
}

func HeapSort(arr []int)  {
	n := len(arr)
	for i := n / 2 - 1; i >= 0; i-- {
		heapify(arr, i, n)
	}

	for i := n - 1; i >= 0; i-- {
		tmp := arr[0]
		arr[0] = arr[i]
		arr[i] = tmp
		heapify(arr, 0, i)
	}
}

func heapify(arr []int, i, n int) {
	l := 2 * i + 1
	r := 2 * i + 2
	max := i

	if l < n && arr[l] > arr[max] {
		max = l
	}
	if r < n && arr[r] > arr[max] {
		max = r
	}
	if i != max {
		tmp := arr[i]
		arr[i] = arr[max]
		arr[max] = tmp
		heapify(arr, max, n)
	}
}
