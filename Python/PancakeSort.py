# Python3 program to
# sort array using
# pancake sort

# Reverses arr[0..i]
from typing import List, TypeVar

T = TypeVar('T')  # Create a generic type of T


def flip(arr: List[T], i: int) -> None:
    start = 0
    while start < i:
        temp = arr[start]
        arr[start] = arr[i]
        arr[i] = temp
        start += 1
        i -= 1


# Returns index of the maximum
# element in arr[0..n-1]


def find_max(arr: List[T], n: int) -> int:
    mi = 0
    for i in range(0, n):
        if arr[i] > arr[mi]:
            mi = i
    return mi

# The main function that
# sorts given array
# using flip operations


def pancake_sort(arr: List[T]) -> None:
    n: int = len(arr)
    # Start from the complete
    # array and one by one
    # reduce current size
    # by one
    curr_size: int = n
    while curr_size > 1:
        # Find index of the maximum
        # element in
        # arr[0..curr_size-1]
        mi: int = find_max(arr, curr_size)

        # Move the maximum element
        # to end of current array
        # if it's not already at
        # the end
        if mi != curr_size - 1:
            # To move at the end,
            # first move maximum
            # number to beginning
            flip(arr, mi)

            # Now move the maximum
            # number to end by
            # reversing current array
            flip(arr, curr_size - 1)
        curr_size -= 1


# Driver program
if __name__ == '__main__':
    arr = [23, 10, 20, 11, 12, 6, 7]
    pancake_sort(arr)

    print('Sorted Array:', arr)
