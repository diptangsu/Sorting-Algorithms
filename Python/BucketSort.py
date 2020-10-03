"""Python3 program to sort an array
"""
from typing import List, TypeVar

# Create a generic type of T that can hold only numbers
T = TypeVar('T', int, float)


def insertion_sort(arr: List[T]) -> List[T]:
    for i in range(1, len(arr)):
        up: T = arr[i]
        j: int = i - 1
        while j >= 0 and arr[j] > up:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = up
    return arr


def bucket_sort(numbers: List[T]) -> List[T]:
    arr: List[List[T]] = []
    slot_num: int = 10  # 10 means 10 slots, each
    # slot's size is 0.1
    for i in range(slot_num):
        arr.append([])

    # Put array elements in different buckets
    for j in numbers:
        index_b = int(slot_num * j)
        arr[index_b].append(j)

    # Sort individual buckets
    for i in range(slot_num):
        arr[i] = insertion_sort(arr[i])

    # concatenate the result
    k: int = 0
    for i in range(slot_num):
        for j in range(len(arr[i])):
            numbers[k] = arr[i][j]
            k += 1
    return numbers


# Driver Code
if __name__ == '__main__':
    numbers = [0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434]
    print("Sorted Array is")
    print(bucket_sort(numbers))
