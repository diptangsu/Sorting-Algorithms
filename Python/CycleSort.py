# Python program to implement cycle sort
from typing import List, TypeVar

T = TypeVar('T')  # Create a generic type of T


def cycle_sort(array: List[T]) -> int:
    writes: int = 0

    # Loop through the array to find cycles to rotate.
    for cycleStart in range(0, len(array) - 1):
        item: T = array[cycleStart]

        # Find where to put the item.
        pos: int = cycleStart
        for i in range(cycleStart + 1, len(array)):
            if array[i] < item:
                pos += 1

        # If the item is already there, this is not a cycle.
        if pos == cycleStart:
            continue

        # Otherwise, put the item there or right after any duplicates.
        while item == array[pos]:
            pos += 1
        array[pos], item = item, array[pos]
        writes += 1

        # Rotate the rest of the cycle.
        while pos != cycleStart:

            # Find where to put the item.
            pos = cycleStart
            for i in range(cycleStart + 1, len(array)):
                if array[i] < item:
                    pos += 1

            # Put the item there or right after any duplicates.
            while item == array[pos]:
                pos += 1
            array[pos], item = item, array[pos]
            writes += 1

    return writes


# driver code
if __name__ == '__main__':
    arr = [1, 8, 3, 9, 10, 10, 2, 4]
    n = len(arr)
    cycle_sort(arr)

    print("After sort : ", arr)
