#include <stdio.h>
#include <stdlib.h>
int swapped = 0; // global variable to check if swap() function is called
void swap(int *a, int *b)
{
    int temp = *b;
    *b = *a;
    *a = temp;
    swapped++;
}
int bubblesort(int *a, int size) // to demonstrate passing by refference in C (pointer variable receives only the base address of array)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size - i - 1; j++)
        {
            if (a[j] > a[j + 1])
            {
            swap(a+j, a+j+1); // making a function is good instead of many lines of code in main function 
            }
        }
        if (swapped == 0)
            return 1; // use return values better than break statement
    }
    return 0; // sorted 

}

int main()
{
    int n, i;
    int *a = NULL; // security issue 
    printf("Please insert the number of elements to be sorted: ");
    do
    {
        scanf("%d", &n); // The total number of elements
    } while(n > 21); // never trust the user , heap-overflow , max elements 20 here

    a = (int *)malloc(n * sizeof(int)); // Note: It would be better to use malloc over calloc, unless we want the zero-initialization because malloc is faster than calloc. So if we just want to copy some stuff or do something that doesn’t require filling of the blocks with zeros, then malloc would be a better choice.
    for ( i = 0; i < n; i++)
    {
        printf("Input element %d :", i);
        scanf("%d", (a+i)); // Adding the elements to the array
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
        printf("%d ", *(a+i));// we're using C , so demonstrate pointers :) 
    }
    return 0;
}
