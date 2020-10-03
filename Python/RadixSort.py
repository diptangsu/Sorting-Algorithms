# Python program for implementation of Radix Sort
from typing import List


# A function to do counting sort of arr[] according to
# the digit represented by exp.


def counting_sort(arr: List[int], exp1: int):
    n: int = len(arr)

    # inthe output array elements that will have sorted arr
    output: List[int] = [0] * n

    # initialize count array as 0
    count: List[int] = [0] * 10

    # Store count of occurrences in count[]
    for i in range(0, n):
        index = arr[i] // exp1
        count[index % 10] += 1

    # Change count[i] so that count[i] now contains actual
    #  position of this digit in output array
    for i in range(1, 10):
        count[i] += count[i - 1]

    # Build the output array
    i: int = n - 1
    while i >= 0:
        index = arr[i] // exp1
        output[count[index % 10] - 1] = arr[i]
        count[index % 10] -= 1
        i -= 1

    # Copying the output array to arr[],
    # so that arr now contains sorted numbers
    i = 0
    for i in range(0, len(arr)):
        arr[i] = output[i]


# Method to do Radix Sort
def radix_sort(arr: List[int]):
    # Find the maximum number to know number of digits
    max1: int = max(arr)

    # Do counting sort for every digit. Note that instead
    # of passing digit number, exp is passed. exp is 10ⁱ
    # where i is current digit number
    exp: int = 1
    while max1 / exp > 0:
        counting_sort(arr, exp)
        exp *= 10


# Driver code to test above
if __name__ == '__main__':
    arr = [170, 45, 75, 90, 802, 24, 2, 66]
    radix_sort(arr)
    print(arr)
