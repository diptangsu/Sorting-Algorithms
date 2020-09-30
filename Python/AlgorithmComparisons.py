import random
import time

from BinaryInsertionSort import insertion_sort
from BubbleSort import bubble_sort


SORT_FUNCTIONS = {
    'BINARY INSERTION SORT': insertion_sort,
    'BUBBLE SORT': bubble_sort,
}

random_numbers = random.sample(range(8000), 2000)
random_numbers_sorted = sorted(random_numbers)
random_numbers_reverse_sorted = sorted(random_numbers, reverse=True)


def print_comparison(comparison):
    largest_name_len = len(max(comparison.keys(), key=len))
    largest_name_len += 6

    heading = 'ALGORITHM'.ljust(largest_name_len) + 'TIME TAKEN'
    print(heading)
    print('-' * len(heading))
    for algo, time_taken in comparison.items():
        print(f'{algo:<{largest_name_len}}{time_taken}')


def compare_algorithms(numbers):
    time_taken = {}
    for algo_name, sorter in SORT_FUNCTIONS.items():
        start = time.perf_counter()
        sorter(numbers.copy())
        end = time.perf_counter()

        time_taken[algo_name] = end - start

    time_taken_sorted = dict(sorted(time_taken.items(), key=lambda kv: kv[1]))
    print_comparison(time_taken_sorted)


print('COMPARISON OF SORTING ALGORITHMS (fastest to slowest):')
print('------------------------------------------------------')
print(f'Length of list: {len(random_numbers)}')
print('\nElements randomly distributed:')
compare_algorithms(random_numbers)

print('\nElements sorted:')
compare_algorithms(random_numbers_sorted)

print('\nElements reverse sorted:')
compare_algorithms(random_numbers_reverse_sorted)
