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
	ans := BucketSort(arr)
	fmt.Println("sorted array:")
	for i := 0; i < n; i++ {
		fmt.Printf("%v ", ans[i])
	}
	fmt.Println()
}

func BucketSort(arr []int) []int {
	n := len(arr)
	max := maxval(arr)
	bucket := make([]int, max + 1)
	ans := make([]int, n)
	for i := 0; i < n; i++ {
		bucket[arr[i]]++
	}
	idx := 0
	for i := 0; i < len(bucket); i++ {
		for j := 0; j < bucket[i]; j++ {
			ans[idx] = i
			idx++
		}
	}
	return ans
}

func maxval(arr []int) int {
	max := arr[0]
	n := len(arr)
	for i := 1; i < n; i++ {
		if max < arr[i] {
			max = arr[i]
		}
	}
	return max
}
