#include<stdio.h>
int main(){

  
   int i, j, count, temp, number[25];

   printf("Please insert the number of elements to be sorted:");

   scanf("%d",&count);

   printf("Enter %d elements: ", count);
   // This loop would store the input numbers in an array
   for(i=0;i<count;i++)
   {  printf("Enter element no. %d: ", i+1);
     scanf("%d",&number[i]);
   }

   // Implementation of insertion sort algorithm
   for(i=1;i<count;i++){
      temp=number[i];
      j=i-1;
      while((temp<number[j])&&(j>=0)){
         number[j+1]=number[j];
         j=j-1;
      }
      number[j+1]=temp;
   }
//Displaying the sorted array

   printf("Sorted elements: ");
   for(i=0;i<count;i++)
      printf(" %d",number[i]);

   return 0;
}
