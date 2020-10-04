import Foundation
struct bubbleSort {
    func bubbleSort(_ array: [Int]) -> [Int] {
        var arr = array 
        print("Before sorting: \(arr)")
        for _ in 0...arr.count {
            for value in 1...arr.count - 1 {
                if arr[value-1] > arr[value] {
                    let largerValue = arr[value-1]
                    arr[value-1] = arr[value]
                    arr[value] = largerValue
                }
            }
        }
        return arr
    }
}

let Arr = [9, 2, 7, 5, 4, 3, 6, 8, 1]
var sort = bubbleSort()
print("After sorting: \(sort.bubbleSort(Arr))")
