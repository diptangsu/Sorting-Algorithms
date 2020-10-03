# Python program for Bitonic Sort. Note that this program
# works only when size of input is a power of 2.
from typing import List, TypeVar

T = TypeVar('T')  # Create a generic type of T


# The parameter dir indicates the sorting direction, ASCENDING
# or DESCENDING; if (a[i] > a[j]) agrees with the direction,
# then a[i] and a[j] are interchanged.*/
def comp_and_swap(a: List[T], i: int, j: int, dire: int) -> None:
    if (dire == 1 and a[i] > a[j]) or (dire == 0 and a[i] < a[j]):
        a[i], a[j] = a[j], a[i]


# It recursively sorts a bitonic sequence in ascending order,
# if dir = 1, and in descending order otherwise (means dir=0).
# The sequence to be sorted starts at index position low,
# the parameter cnt is the number of elements to be sorted.
def bitonic_merge(a: List[T], low: int, cnt: int, dire: int) -> None:
    if cnt > 1:
        k: int = cnt // 2
        for i in range(low, low + k):
            comp_and_swap(a, i, i + k, dire)
        bitonic_merge(a, low, k, dire)
        bitonic_merge(a, low + k, k, dire)


# This funcion first produces a bitonic sequence by recursively
# sorting its two halves in opposite sorting orders, and then
# calls bitonic_merge to make them in the same order
def bitonic_sort(a: List[T], low: int, cnt: int, dire: int) -> None:
    if cnt > 1:
        k: int = cnt // 2
        bitonic_sort(a, low, k, 1)
        bitonic_sort(a, low + k, k, 0)
        bitonic_merge(a, low, cnt, dire)


# Caller of bitonic_sort for sorting the entire array of length n
# in ASCENDING order
def sort(a: List[T], n: int, up: int) -> None:
    bitonic_sort(a, 0, n, up)


# Driver code to test above
if __name__ == '__main__':
    a = [3, 7, 4, 8, 6, 2, 1, 5]
    n = len(a)
    up = 1

    print('Array:', a)
    sort(a, n, up)
    print('Sorted array:', a)
