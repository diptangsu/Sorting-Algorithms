# Python3 program to
# sort array using
# pancake sort

# Reverses arr[0..i]


def flip(arr, i):
    start = 0
    while start < i:
        temp = arr[start]
        arr[start] = arr[i]
        arr[i] = temp
        start += 1
        i -= 1

# Returns index of the maximum
# element in arr[0..n-1]


def find_max(arr, n):
    mi = 0
    for i in range(0, n):
        if arr[i] > arr[mi]:
            mi = i
    return mi

# The main function that
# sorts given array
# using flip operations


def pancake_sort(arr):
    n = len(arr)
    # Start from the complete
    # array and one by one
    # reduce current size
    # by one
    curr_size = n
    while curr_size > 1:
        # Find index of the maximum
        # element in
        # arr[0..curr_size-1]
        mi = find_max(arr, curr_size)

        # Move the maximum element
        # to end of current array
        # if it's not already at
        # the end
        if mi != curr_size - 1:
            # To move at the end,
            # first move maximum
            # number to beginning
            flip(arr, mi)

            # Now move the maximum
            # number to end by
            # reversing current array
            flip(arr, curr_size - 1)
        curr_size -= 1


# Driver program
if __name__ == '__main__':
    arr = [23, 10, 20, 11, 12, 6, 7]
    pancake_sort(arr)

    print('Sorted Array:', arr)
