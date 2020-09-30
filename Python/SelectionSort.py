# Python program for implementation of Selection Sort
from typing import List, TypeVar

# Declare generic type for the sort function input
T = TypeVar("T")


# Function to do selection sort
def selection_sort(arr: List[T]) -> None:
    # Traverse through all array elements
    for i in range(len(arr)):
        # Find the minimum element in remaining
        # unsorted array
        min_idx = i
        for j in range(i + 1, len(arr)):
            if arr[min_idx] > arr[j]:
                min_idx = j

        # Swap the found minimum element with
        # the first element
        arr[i], arr[min_idx] = arr[min_idx], arr[i]


# Driver code to test above
if __name__ == "__main__":
    a = [64, 25, 12, 22, 11]
    selection_sort(a)
    print("Sorted array", a)
