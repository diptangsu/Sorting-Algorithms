# Python program for implementation of heap Sort


def heapify(arr, n, root):
    """Heapify a subtree rooted at root (an index of arr) and where n is the size of the heap"""
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
        heapify(arr, n, largest)  # After swapping root with largest recursively heapify


# The main function to perform heap sort
def heap_sort(arr):
    n = len(arr)

    # Build a maxheap. Nodes in the range of n//2 to n are leaf nodes so skip those
    for i in range(n // 2 - 1, -1, -1):
        heapify(arr, n, i)
    # Extract from heap one by one, move current root to end and call heapify on the reduced heap
    for i in range(n - 1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, i, 0)


# Driver code to test above
if __name__ == "__main__":
    arr = [12, 11, 13, 5, 6, 7]
    heap_sort(arr)
    print("Sorted array:", arr)
