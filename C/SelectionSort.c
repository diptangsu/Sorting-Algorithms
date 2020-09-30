#include<stdio.h>
int main(){
   /* Here i & j for loop counters, temp for swapping,
    * count for total number of elements, number[] to
    * store the input numbers in array. You can increase
    * or decrease the size of number array as per requirement
    */
   int a[10000], i, j, p, tmp, n; //Initializing variables

    printf("Enter no. of elements in array:\n");
    scanf("%d", &n);

    printf("Enter elements of array:\n");
    //Loop to input elements of array
    for(int k =0; k<n; k++){
        scanf("%d", &a[i]);
    }
 
   //The given loops used to compare each element with all others and swap
    for(j=0;j<n;j++){
        p=j;
        for(i=j;i<n;i++){
            if(a[p]>a[i]){
                tmp=a[p];
                a[p]=a[i];
                a[i]=tmp;
            }
        }
    }

   //Array in sorted ascending order 
    printf("Array in ascending order:\n");
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    printf("\nArray in descending order:\n")
    for(i=n-1; i>=0; i--){
        printf("%d ", a[i]);
    }
    return 0;
}

//This code is contributed by Akhil
