# Python program for implementation of CombSort
from typing import List, TypeVar

T = TypeVar('T')  # Create a generic type of T


# To find next gap from current
def get_next_gap(gap: int) -> int:
    # Shrink gap by Shrink factor
    gap = (gap * 10) // 13
    if gap < 1:
        return 1
    return gap


# Function to sort arr[] using Comb Sort
def combSort(arr: List[T]) -> None:
    n: int = len(arr)

    # Initialize gap
    gap: int = n

    # Initialize swapped as true to make sure that
    # loop runs
    swapped: bool = True

    # Keep running while gap is more than 1 and last
    # iteration caused a swap
    while gap != 1 or swapped:

        # Find next gap
        gap = get_next_gap(gap)

        # Initialize swapped as false so that we can
        # check if swap happened or not
        swapped = False

        # Compare all elements with current gap
        for i in range(0, n - gap):
            if arr[i] > arr[i + gap]:
                arr[i], arr[i + gap] = arr[i + gap], arr[i]
                swapped = True


# Driver code to test above
if __name__ == '__main__':
    arr = [8, 4, 1, 3, -44, 23, -6, 28, 0]
    combSort(arr)

    print('Sorted array:', arr)
