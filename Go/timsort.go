package main

const run int = 32

func TimSort(a []int) {
	for i := 0; i < len(a); i += run {
		insertionSort(a, i, minimum(i+31, len(a)-1))
	}
	for size := run; size < len(a); size = 2 * size {
		for begin := 0; begin < len(a); begin += 2 * size {
			middle := begin + size - 1
			end := minimum((begin + 2*size - 1), (len(a) - 1))
			if end < middle {
				continue
			}
			merge(a, begin, middle, end)
		}
	}
}

func insertionSort(a []int, begin, end int) {
	for i := begin + 1; i <= end; i++ {
		temp := a[i]
		j := i - 1
		for j >= begin && a[j] > temp {
			a[j+1] = a[j]
			j--
		}
		a[j+1] = temp
	}
}

func merge(a []int, left, middle, right int) {
	len1 := middle - left + 1
	len2 := right - middle
	begin := make([]int, len1)
	end := make([]int, len2)
	for i := 0; i < len1; i++ {
		begin[i] = a[left+i]
	}
	for i := 0; i < len2; i++ {
		end[i] = a[middle+1+i]
	}
	var i, j int
	k := left
	for i < len1 && j < len2 {
		if begin[i] <= end[j] {
			a[k] = begin[i]
			i++
		} else {
			a[k] = end[j]
			j++
		}
		k++
	}
	for i < len1 {
		a[k] = begin[i]
		k++
		i++
	}
	for j < len2 {
		a[k] = end[j]
		k++
		j++
	}
}

func minimum(a, b int) int {
	if a < b {
		return a
	}
	return b
}

func main(){
  var a []int
  var x,n int
  fmt.Println("Enter the number of elements")
  fmt.Scan(&n)
  fmt.Println("Enter the values one by one: ")
  for i:=0;i<n;i++ {
    fmt.Scan(&x)
    a = append(a,x)
  }
  TimSort(a)
  fmt.Println("Sorted array: \n",a)
}
