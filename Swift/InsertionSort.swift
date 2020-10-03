import Foundation
func insertionSort(_ array: [Int]) -> [Int] {
  var a = array
  for x in 1..<a.count {
    var y = x
    let temp = a[y]
    while y > 0 && temp < a[y - 1] {
      a[y] = a[y - 1]
      y -= 1
    }
    a[y] = temp
  }
  return a
}
let Arr = [9, 2, 7, 5, 4, 3, 6, 8, 1]
print("After sorting: \(insertionSort(Arr))")
