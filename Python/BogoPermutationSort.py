# Python program for implementation of Bogo Sort
import random
from typing import List, TypeVar

T = TypeVar('T')  # Create a generic type of T


# Sorts array a[0..n-1] using Bogo sort
def bogo_sort(a: List[T]) -> None:
    while not is_sorted(a):
        random.shuffle(a)


# To check if array is sorted or not
def is_sorted(a: List[T]) -> bool:
    n: int = len(a)
    for i in range(0, n - 1):
        if a[i] > a[i + 1]:
            return False
    return True


# To generate permuatation of the array
def shuffle(a: List[T]) -> None:
    n: int = len(a)
    for i in range(0, n):
        r: int = random.randint(0, n - 1)
        a[i], a[r] = a[r], a[i]


# Driver code to test above
if __name__ == '__main__':
    a = [3, 2, 4, 1, 0, 5]
    bogo_sort(a)
    print("Sorted array :")
    for i in range(len(a)):
        print("%d" % a[i])
