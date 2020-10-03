# Python program to implement stooge sort
from typing import List, TypeVar

T = TypeVar('T')  # Create a generic type of T


def stoogesort(arr: List[T], l: int, h: int) -> None:
    if l >= h:
        return

    # If first element is smaller
    # than last, swap them
    if arr[l] > arr[h]:
        t = arr[l]
        arr[l] = arr[h]
        arr[h] = t

    # If there are more than 2 elements in
    # the array
    if h - l + 1 > 2:
        t = (h - l + 1) // 3

        # Recursively sort first 2 / 3 elements
        stoogesort(arr, l, (h - t))

        # Recursively sort last 2 / 3 elements
        stoogesort(arr, l + t, (h))

        # Recursively sort first 2 / 3 elements
        # again to confirm
        stoogesort(arr, l, (h - t))


if __name__ == '__main__':
    arr = [2, 4, 5, 3, 1]
    n = len(arr)

    stoogesort(arr, 0, n - 1)

    print(arr)
