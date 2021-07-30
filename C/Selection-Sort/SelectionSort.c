#include "SelectionSort.h"

int main(void)
{
    int SIZE;
    do
    {
        printf("how many  array's elements you want: ");
        scanf("%d", &SIZE);
    } while(SIZE > 20); // max = 20

    // memory allocation for array in heap segement
    int *array = malloc(SIZE * sizeof(int));
    array_init(array, SIZE); 
    array_print(array, SIZE); // before sorting
    selection_sort(array, SIZE); // sorting
    array_print(array, SIZE); // after sorting
    free(array); // deallocating the allocated virtual memory in heap segement
    return 0;
}
void array_init(int *array, int SIZE)
{
    printf("add values to your array:\n");
    for(int i = 0 ; i < SIZE ; i++)
    {
        printf("array[%d]: ", i);
        scanf("%d", array+i);
    }

}

void array_print(int *array, int SIZE)
{
    for(int i = 0 ; i < SIZE ; i++)
    {
        printf("%d ", *(array+i));
    }
    printf("\n");
}

void swap(int *a, int *b)
{
    int temp = *b;
    *b = *a;
    *a = temp; 
}

void selection_sort(int *array, int SIZE)
{
    for(int j = 0 ; j < SIZE ; j++)    
    {
        for(int i = j+1, min_index = j; i < SIZE ; i++)
        {            
            if(array[i] < array[min_index])
            {
                swap(array+i, array+min_index);
                min_index++;
            }
        }
    }
}