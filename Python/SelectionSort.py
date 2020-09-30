# Python program for implementation of Selection Sort
def selectnsort(a):

    # Traverse through all array elements
    for i in range(len(a)):
        # Find the minimum element in remaining
        # unsorted array
        min_idx = i
        for j in range(len(a)):
            if a[min_idx] < a[j]:
                min_idx = j

            # Swap the found minimum element with
            # the first element
            a[i], a[min_idx] = a[min_idx], a[i]

    return a

if __name__ == "__main__":
    print("Enter the number of elements:")
    n = int(input())
    print("Enter the elements of array:")
    a = []
    for i in range(n):
        x = int(input())
        a.append(x)
    # Driver code to test above
    print("Sorted array:", selectnsort(a))

    #This code is contributed by Akhil
