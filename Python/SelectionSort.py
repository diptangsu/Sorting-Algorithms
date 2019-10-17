# Python program for implementation of Selection Sort
a = [64, 25, 12, 22, 11]

# Traverse through all array elements
for i in range(len(a)):
    # Find the minimum element in remaining
    # unsorted array
    min_idx = i
    for j in range(i + 1, len(a)):
        if a[min_idx] > a[j]:
            min_idx = j

    # Swap the found minimum element with
    # the first element
    a[i], a[min_idx] = a[min_idx], a[i]

# Driver code to test above
print("Sorted array", a)
