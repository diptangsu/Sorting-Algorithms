#include <stdio.h>
#include<conio.h>             //Added library for clear screen
void bubblesort(int a[], int size) {
    for (int i = 1; i < size; i++) {
        for (int j = 0; j < i; j++) {
            if (a[j] > a[j+1]){
                int tmp = a[j+1];
                a[j+1] = a[j];
                a[j] = tmp;
            }
        }
    }
}

int main ()  
{  
    int num,ctr;               //changed variable
    int *a;  
    clrscr();                 //Clear screen added 
    printf("Please insert the number of elements to be sorted: ");  
    scanf("%d", &num);       // The total number of elements  
    a  =  (int *)calloc(num, sizeof(int));  
    for (ctr = 0;ctr<num;ctr++)  
    {  
        printf("Input element %d :", ctr);  
        scanf("%d", &a[ctr]); // Adding the elements to the array  
    }  
    printf("unsorted list: ");       // Displaying the unsorted array  
    for(ctr= 0;ctr<num;ctr++)  
    {  
         printf("%d ", a[ctr]);  
    }  
    bubblesort(a, num);  
    printf("\nAfter sorting:\n"); //Changed the comment which show the display
    for(ctr= 0;ctr<num;ctr++)  
    {  
        printf("%d ", (a[ctr]));  
    }  
    return 0;  
}
