# Python program for implementation of heap Sort
from typing import List, TypeVar

T = TypeVar('T')  # Create a generic type of T


# To heapify subtree rooted at index i.
# n is size of heap
def heapify(arr: List[T], n: int, i: int) -> None:
    largest: int = i  # Initialize largest as root
    l: int = 2 * i + 1  # left = 2*i + 1
    r: int = 2 * i + 2  # right = 2*i + 2

    # See if left child of root exists and is
    # greater than root
    if l < n and arr[i] < arr[l]:
        largest = l

    # See if right child of root exists and is
    # greater than root
    if r < n and arr[largest] < arr[r]:
        largest = r

    # Change root, if needed
    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]  # swap

        # Heapify the root.
        heapify(arr, n, largest)

# The main function to sort an array of given size


def heap_sort(arr: List[T]) -> None:
    n: int = len(arr)

    # Build a maxheap.
    for i in range(n, -1, -1):
        heapify(arr, n, i)

    # One by one extract elements
    for i in range(n - 1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]  # swap
        heapify(arr, i, 0)


# Driver code to test above
if __name__ == '__main__':
    arr = [12, 11, 13, 5, 6, 7]
    heap_sort(arr)
    print("Sorted array:", arr)
