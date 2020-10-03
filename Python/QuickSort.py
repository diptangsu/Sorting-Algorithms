# Python program for implementation of Quicksort Sort
from typing import List, TypeVar

T = TypeVar('T')  # Create a generic type of T


# This function takes last element as pivot, places
# the pivot element at its correct position in sorted
# array, and places all smaller (smaller than pivot)
# to left of pivot and all greater elements to right
# of pivot
def partition(arr: List[T], low: int, high: int) -> int:
    i: int = (low - 1)  # index of smaller element
    pivot: int = arr[high]  # pivot

    for j in range(low, high):
        # If current element is smaller than the pivot
        if arr[j] < pivot:
            # increment index of smaller element
            i = i + 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1

# The main function that implements QuickSort
# arr[] --> Array to be sorted,
# low  --> Starting index,
# high  --> Ending index

# Function to do Quick sort


def quick_sort(arr: List[T], low: int, high: int):
    if low < high:
        # pi is partitioning index, arr[p] is now
        # at right place
        pi: int = partition(arr, low, high)

        # Separately sort elements before
        # partition and after partition
        quick_sort(arr, low, pi - 1)
        quick_sort(arr, pi + 1, high)


# Driver code to test above
if __name__ == '__main__':
    arr = [10, 7, 8, 9, 1, 5]
    n = len(arr)
    quick_sort(arr, 0, n - 1)
    print("Sorted array is:", arr)
