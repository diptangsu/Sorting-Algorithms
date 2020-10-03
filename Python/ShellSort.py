# Python3 program for implementation of Shell Sort
from typing import List


def shell_sort(arr: List[int]) -> None:
    # Start with a big gap, then reduce the gap
    n: int = len(arr)
    gap: int = n // 2

    # Do a gapped insertion sort for this gap size.
    # The first gap elements a[0..gap-1] are already in gapped
    # order keep adding one more element until the entire array
    # is gap sorted
    while gap > 0:
        for i in range(gap, n):
            # add a[i] to the elements that have been gap sorted
            # save a[i] in temp and make a hole at position i
            temp: int = arr[i]

            # shift earlier gap-sorted elements up until the correct
            # location for a[i] is found
            j: int = i
            while j >= gap and arr[j - gap] > temp:
                arr[j] = arr[j - gap]
                j -= gap

            # put temp (the original a[i]) in its correct location
            arr[j] = temp
        gap //= 2


# Driver code to test above
if __name__ == '__main__':
    arr = [12, 34, 54, 2, 3]
    print("Array before sorting:", arr)

    shell_sort(arr)
    print("Array after sorting:", arr)
