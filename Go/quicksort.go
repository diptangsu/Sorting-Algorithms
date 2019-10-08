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

	QuickSort(arr)

	fmt.Println("sorted array:")
	for i := 0; i < n; i++ {
		fmt.Printf("%v ", arr[i])
	}
	fmt.Println()
}

func QuickSort(arr []int) {
	if len(arr) < 2 {
        return
    }
      
    left, right := 0, len(arr)-1
    
    for i, _ := range arr {
        if arr[i] < arr[right] {
            arr[left], arr[i] = arr[i], arr[left]
            left++
        }
    }
      
    arr[left], arr[right] = arr[right], arr[left]
      
    QuickSort(arr[:left])
    QuickSort(arr[left+1:])
}
