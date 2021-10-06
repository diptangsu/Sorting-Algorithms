#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;
 
void insertionsort(int array[], int low, int high)
{
    for (int i = low + 1; i <= high; i++)
    {
        int value = a[i];
        int j = i;
        while (j > low && array[j - 1] > value)
        {
            array[j] = arraya[j - 1];
            j--;
        }
        array[j] = value;
    }
}
 
int partition(int array[], int low, int high)
{
    int pivot = array[high];
    int pIndex = low;
    for (int i = low; i < high; i++)
    {
        if (array[i] <= pivot)
        {
            swap(array[i], array[pIndex]);
            pIndex++;
        }
    }
    swap (array[pIndex], array[high]);
    return pIndex;
}

void heapsort(int *begin, int *end)
{
    make_heap(begin, end);
    sort_heap(begin, end);
}

int randPartition(int array[], int low, int high)
{
    int pivotIndex = rand() % (high - low + 1) + low;
    swap(array[pivotIndex], array[high]);
    return partition(array, low, high);
}

void introsort(int array[], int *begin, int *end, int maxdepth)
{
    if ((end - begin) < 16) {
        insertionsort(array, begin - array, end - array);
    }
    else if (maxdepth == 0) {
        heapsort(begin, end + 1);
    }
    else {
        int pivot = randPartition(array, begin - array, end - array);
        introsort(array, begin, array + pivot - 1, maxdepth - 1);
        introsort(array, array + pivot + 1, end, maxdepth - 1);
    }
}
 
int main()
{
    int array[] = { 5, 7, -8, 9, 10, 4, -7, 0, -12, 1, 6, 2, 3, -4, -15, 12 };
    int n = sizeof(array) / sizeof(array[0]);
    int maxdepth = log(n) * 2;
    introsort(array, array, array + n - 1, maxdepth);
    for (int i = 0; i < n; i++) {
        cout << array[i] << " ";
    }
    return 0;
}
