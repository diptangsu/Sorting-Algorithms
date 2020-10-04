# Python program to implement Pigeonhole Sort */


def pigeonhole_sort(a):
    # size of range of values in the list
    # (ie, number of pigeonholes we need)
    my_min = min(a)
    my_max = max(a)
    size = my_max - my_min + 1

    # our list of pigeonholes
    holes = [0] * size

    # Populate the pigeonholes.
    for x in a:
        if not isinstance(x, int):
            raise ValueError(f'{x} is not an integer')
        holes[x - my_min] += 1

    # Put the elements back into the array in order.
    i = 0
    for count in range(size):
        while holes[count] > 0:
            holes[count] -= 1
            a[i] = count + my_min
            i += 1


if __name__ == '__main__':
    a = [8, 3, 2, 7, 4, 6, 8]

    pigeonhole_sort(a)
    print('Sorted array:', a)
