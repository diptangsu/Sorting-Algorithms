package main

import "fmt"

func sort(arr []int, n int) {
	for i:=1; i<n-1; i++ {
		if(arr[i] < arr[i-1]) {
			arr[i], arr[i-1] = arr[i-1], arr[i]

			i--
		}
	}
}

func main() {
	var n int

	fmt.Printf("Enter the number of elements: ")
	fmt.Scan(&n)
	arr := make([]int, n)

	fmt.Printf("Enter the %d elements: ", n)
	for i:=0; i<n; i++ {
		fmt.Scan(&arr[i])
	}

	sort(arr, n)
	fmt.Println("Sorted Array:")
	for _, x := range arr {
		fmt.Printf("%d ", x)
	}
	fmt.Println()
}