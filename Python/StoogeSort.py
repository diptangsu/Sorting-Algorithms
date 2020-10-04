# Python program to implement stooge sort
def stooge_sort(arr, first=0, last=None):
    if last is None:
        last = len(arr) - 1
    if first >= last:
        return

    # If first element is smaller  than last, swap them
    if arr[first] > arr[last]:
        arr[first], arr[last] = arr[last], arr[first]

    # If there are more than 2 elements in the array
    if last - first + 1 > 2:
        t = (last - first + 1) // 3
        # Recursively sort first 2 / 3 elements
        stooge_sort(arr, first, (last - t))
        # Recursively sort last 2 / 3 elements
        stooge_sort(arr, first + t, (last))
        # Recursively sort first 2 / 3 elements again to confirm
        stooge_sort(arr, first, (last - t))


if __name__ == '__main__':
    arr = [2, 4, 5, 3, 1]
    stooge_sort(arr)
    print(arr)
