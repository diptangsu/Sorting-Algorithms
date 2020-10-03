import Foundation
func selectionSort(array: inout [Int]) {
    for currentIndex in 0..<(array.count - 1) {
        var minIndex = currentIndex;
        for i in (currentIndex + 1)..<array.count {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        if (minIndex != currentIndex) {
            let temp = array[currentIndex];
            array[currentIndex] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}

var array = [12, 11, 15, 10, 9, 1, 2, 3, 13, 14, 4, 5, 6, 7, 8]
selectionSort(array: &array)
print(array)
