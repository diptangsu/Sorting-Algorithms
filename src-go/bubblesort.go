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
	BubbleSort(arr)
	fmt.Println("sorted array:")
	for i := 0; i < n; i++ {
		fmt.Printf("%v ", arr[i])
	}
	fmt.Println()
}

func BubbleSort(arr []int) {
	n := len(arr)
	for i := 0; i < n; i++ {
		flag := false
		for j := 0; j < n - i - 1; j++ {
			if arr[j] > arr[j + 1] {
				tmp := arr[j]
				arr[j] = arr[j + 1];
				arr[j + 1] = tmp
				flag = true
			}
		}
		if (!flag) {
			break;
		}
	}
}
