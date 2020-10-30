#include<stdio.h>
int main() {

    int length;
    printf("Enter the length of the array: ");
    scanf("%d", &length);
    int intArray[length];
    for(int i = 0; i < length; i++) {
        scanf("%d", &intArray[i]);
    }
    //example input
    //int intArray[] = {60, 80, 20, 40, 10, 90, 100, 70, 30, 60, 50};

    int swapped = 1;
    int start = 0;
    int end = length;

    while (swapped) {
        swapped = 0;

        for (int i = start; i < end - 1; i++) {
            if (intArray[i] > intArray[i + 1]) {
                int temp = intArray[i];
                intArray[i] = intArray[i + 1];
                intArray[i + 1] = temp;
                swapped = 1;
            }
        }

        if (!swapped)
            break;

        swapped = 0;
        end--;

        for (int i = end - 1; i >= start; i--) {
            if (intArray[i] > intArray[i + 1]) {
                int temp = intArray[i];
                intArray[i] = intArray[i + 1];
                intArray[i + 1] = temp;
                swapped = 1;
            }
        }

        start++;
    }

    printf("Sorted array: ");

    for(int i = 0; i < length; i++) {
        printf("%d ", intArray[i]);
    }

    //example output
    //Sorted array: 10 20 30 40 50 60 70 80 90 100
}
