# Python program for counting sort

# The main function that sort the given string arr[] in
# alphabetical order
from typing import List, TypeVar

T = TypeVar('T', int, float)  # Create a generic type of T


def count_sort(arr: str):
    # The output character array that will have sorted arr
    output: List[str] = ['' for _ in range(256)]

    # Create a count array to store count of inidividul
    # characters and initialize count array as 0
    count: List[int] = [0 for _ in range(256)]

    # For storing the resulting answer since the
    # string is immutable
    ans: List[str] = ['' for _ in arr]

    # Store count of each character
    for i in arr:
        count[ord(i)] += 1

    # Change count[i] so that count[i] now contains actual
    # position of this character in output array
    for i in range(256):
        count[i] += count[i - 1]

    # Build the output character array
    for i in range(len(arr)):
        output[count[ord(arr[i])] - 1] = arr[i]
        count[ord(arr[i])] -= 1

    # Copy the output array to arr, so that arr now
    # contains sorted characters
    for i in range(len(arr)):
        ans[i] = output[i]
    return ans


# Driver program to test above function
if __name__ == '__main__':
    arr = "mynameisdiptangsugoswami"
    ans = count_sort(arr)
    print(f'Sorted character array is: {"".join(ans)}')
