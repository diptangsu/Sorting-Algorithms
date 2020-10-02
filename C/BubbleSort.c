#include <stdio.h>
#include <stdlib.h>

void bubblesort(int a[], int size)
{
    for (int i = 0; i < size - 1; i++)
    {
        int swapped = 0;
        for (int j = 0; j < size - i - 1; j++)
        {
            if (a[j] > a[j + 1])
            {
                int tmp = a[j + 1];
                a[j + 1] = a[j];
                a[j] = tmp;
                swapped = 1;
            }
        }
        if (swapped == 0)
            break;
    }
}

int main()
{
    int n, i;
    int *a;
    printf("Please insert the number of elements to be sorted: ");
    scanf("%d", &n); // The total number of elements
    a = (int *)calloc(n, sizeof(int));
    for (i = 0; i < n; i++)
    {
        printf("Input element %d :", i);
        scanf("%d", &a[i]); // Adding the elements to the array
    }
    printf("unsorted list: "); // Displaying the unsorted array
    for (i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    bubblesort(a, n);
    printf("\nSorted list:\n"); // Display the sorted array
    for (i = 0; i < n; i++)
    {
        printf("%d ", (a[i]));
    }
    return 0;
}
