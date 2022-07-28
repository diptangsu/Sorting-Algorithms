"""Python program for implementation of Insertion Sort"""


def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1

        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key


# Driver code to test above
if __name__ == "__main__":
    nums = [12, 11, 13, 5, 6]
    insertion_sort(nums)
    print(nums)
