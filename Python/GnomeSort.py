# Python program to implement Gnome Sort
from typing import List, TypeVar

T = TypeVar('T')  # Create a generic type of T


# A function to sort the given list using Gnome sort
def gnome_sort(arr: List[T]) -> List[T]:
    index: int = 0
    n: int = len(arr)
    while index < n:
        if index == 0:
            index = index + 1
        if arr[index] >= arr[index - 1]:
            index += 1
        else:
            arr[index], arr[index - 1] = arr[index - 1], arr[index]
            index -= 1

    return arr


# Driver Code
if __name__ == '__main__':
    arr = [34, 2, 10, -9]

    arr = gnome_sort(arr)
    print("Sorted sequence after applying Gnome Sort :", arr)
