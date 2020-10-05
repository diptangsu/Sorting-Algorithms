package main

import "fmt"

func main() {
	var count int
	fmt.Println("Enter the number of elements to sort")
	fmt.Scanln(&count)
	tosort := make([]int, count)
	fmt.Println("Enter the elements")

	for i := 0; i <= count-1; i++ {
		fmt.Scanln(&tosort[i])
	}
	// flag:=1
	fmt.Println(tosort)

	start := 0
	end := count-1
	for {
		flag := 0
		// fmt.Println(start,end,flag)
		for i := 0; i <end; i++ {
			// fmt.Println(tosort[i])
			if tosort[i] > tosort[i+1] {
				temp := tosort[i]
				tosort[i] = tosort[i+1]
				tosort[i+1] = temp
				flag = 1
			}
		}
		end--

		if flag == 0 {
			break
		}

		for i := end; i > 0; i-- {
			if tosort[i] < tosort[i-1] {
				temp := tosort[i]
				tosort[i] = tosort[i-1]
				tosort[i-1] = temp
				flag = 1
			}
		}
		start++

		if flag==0{
			break
		}

	}
	fmt.Println("After Performing Coctail Sort")
	fmt.Println(tosort)

}
