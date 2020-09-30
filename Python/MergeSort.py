#!/usr/bin/env python3

from typing import List


# Python program for the implementation of Merge Sort


def merge(arr: List[int], aux: List[int], lo: int, mid: int, hi: int) -> None:
    for x in range(lo, hi + 1):
        aux[x] = arr[x]

    i = lo
    j = mid + 1

    for k in range(lo, hi + 1):
        if i > mid:
            arr[k] = aux[j]
            j += 1
        elif j > hi:
            arr[k] = aux[i]
            i += 1
        elif aux[j] < aux[i]:
            arr[k] = aux[j]
            j += 1
        else:
            arr[k] = aux[i]
            i += 1


def sort_util(arr: List[int], aux: List[int], lo: int, hi: int) -> None:
    if lo >= hi:
        return

    mid = lo + (hi - lo) // 2

    sort_util(arr, aux, lo, mid)
    sort_util(arr, aux, mid + 1, hi)
    merge(arr, aux, lo, mid, hi)


def merge_sort(arr: List[int]) -> None:
    aux = [0 for _ in range(len(arr))]
    sort_util(arr, aux, 0, len(arr) - 1)


def main():
    a = [9, 8, 1, 3, 0, 7, 6, 4, 5, 2]
    merge_sort(a)
    print(a)


if __name__ == "__main__":
    main()
