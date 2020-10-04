# Python program for implementation of heap Sort

# To heapify subtree rooted at index i.
# n is size of heap


def heapify(arr, n, root):
    largest = root
    left = 2 * root + 1
    right = 2 * root + 2

    # See if left child of root exists and is greater than root
    if left < n and arr[root] < arr[left]:
        largest = left
    # See if right child of root exists and is greater than root
    if right < n and arr[largest] < arr[right]:
        largest = right

    # Change root, if needed
    if largest != root:
        arr[root], arr[largest] = arr[largest], arr[root]

        # Heapify the root.
        heapify(arr, n, largest)

# The main function to sort an array of given size


def heap_sort(arr):
    n = len(arr)

    # Build a maxheap.
    for i in range(n, -1, -1):
        heapify(arr, n, i)

    for i in range(n - 1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, i, 0)


# Driver code to test above
if __name__ == '__main__':
    arr = [12, 11, 13, 5, 6, 7]
    heap_sort(arr)
    print("Sorted array:", arr)
