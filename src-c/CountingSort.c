# include <stdio.h>
# include <stdlib.h>

void countingsort(int a[], int size){
    int max = 0;
    for (int i = 0; i < size; i++){
        if (max < a[i]) max = a[i];
    }
    int* count =  (int *)calloc(max, sizeof(int));  
    for (int i = 1; i < size; i++){
        count[ a[i]] ++;
    }
    printf("\nSorted list:\n"); // Display the sorted array  
    for (int i = 0; i <= max; i++){
        for (int j = 0; j < count[i]; j++)
            printf("%d ", i);
    }
}

int main ()  
{  
    int n, i;  
    int *a;  
    printf("Please insert the number of elements to be sorted: ");  
    scanf("%d", &n);       // The total number of elements  
    a  =  (int *)calloc(n, sizeof(int));  
    for (i = 0;i< n;i++)  
    {  
        printf("Input element %d :", i);  
        scanf("%d", &a[i]); // Adding the elements to the array  
    }  
    printf("unsorted list: ");       // Displaying the unsorted array  
    for(i = 0;i < n;i++)  
    {  
         printf("%d ", a[i]);  
    }  
    countingsort(a, n);  
    return 0;  
}