// To execute this source file, all the listed sorting algorithms' files must be placed within the same
// directory as this one. There should be no other main function present in any of the listed algorithm files.
// If present, comment those main functions in order to execute this file.

// Additionally, the sort functions should all have unique names and the same signature, i.e.
// func([]int, int) []int {}

// To execute, use the command "go run AlgorithmComparison.go a1.go a2.go a3.go ... an.go", where a1, a2,
// a3, ..., an represents the names of the sorting algorithm files as present in the directory.

package main

import (
	"fmt"
	"math/rand"
	"sort"
	"time"
)

var algorithms = map[string]interface{}{
	"Bitonic Sort":   BitonicSort,
	"Bubble Sort":    BubbleSort,
	"Bucket Sort":    BucketSort,
	"Comb Sort":      CombSort,
	"Cycle Sort":     CycleSort,
	"Gnome Sort":     GnomeSort,
	"Heap Sort":      HeapSort,
	"Insertion Sort": InsertionSort,
	"Quick Sort":     QuickSort,
	"Radix Sort":     RadixSort,
	"Selection Sort": SelectionSort,
	"Shell Sort":     ShellSort,
	"Tim Sort":       TimSort,
}

func timeTaken(algorithm string, arr []int) int64 {
	startTime := time.Now()
	algorithms[algorithm].(func([]int, int) []int)(arr, len(arr))
	timeDuration := time.Since(startTime)

	totalTime, _ := time.ParseDuration(timeDuration.String())

	return totalTime.Nanoseconds()
}

func main() {
	var arr []int
	n := 6000

	fmt.Printf("\nArray length = %d\n", n)
	fmt.Println("\nElements randomly distributed : ")
	fmt.Println("\nSorting Algorithm\tTime Taken(ns)")
	for k, _ := range algorithms {
		arr = rand.Perm(n)

		fmt.Println(k, "\t\t", timeTaken(k, arr))
	}

	fmt.Println("\nElements already sorted : ")
	fmt.Println("\nSorting Algorithm\tTime Taken(ns)")
	for k, _ := range algorithms {
		arr = rand.Perm(n)
		sort.Ints(arr)

		fmt.Println(k, "\t\t", timeTaken(k, arr))
	}

	fmt.Println("\nElements sorted in reverse order : ")
	fmt.Println("\nSorting Algorithm\tTime Taken(ns)")
	for k, _ := range algorithms {
		arr = rand.Perm(n)
		sort.Ints(arr)
		sort.Sort(sort.Reverse(sort.IntSlice(arr)))

		fmt.Println(k, "\t\t", timeTaken(k, arr))
	}
}
