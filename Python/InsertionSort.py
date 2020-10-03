# Python program for implementation of Insertion Sort
from typing import List, TypeVar

T = TypeVar('T')  # Create a generic type of T


# Function to do insertion sort
def insertion_sort(arr: List[T]) -> None:
    # Traverse through 1 to len(arr)
    for i in range(1, len(arr)):
        key: T = arr[i]

        # Move elements of arr[0..i-1], that are
        # greater than key, to one position ahead
        # of their current position
        j: int = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key


# Driver code to test above
if __name__ == '__main__':
    arr = [12, 11, 13, 5, 6]
    insertion_sort(arr)
    print(arr)
