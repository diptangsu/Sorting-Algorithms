# Python program for implementation of Bogo Sort
import random


# Sorts array a[0..n-1] using Bogo sort
def bogo_sort(arr):
    while not arr == sorted(arr):
        random.shuffle(arr)


# Driver code to test above
if __name__ == '__main__':
    a = [3, 2, 4, 1, 0, 5]
    bogo_sort(a)
    print("Sorted array :", a)
