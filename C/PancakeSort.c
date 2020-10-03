#include <stdio.h>
#include <stdlib.h>
 
void doFlip(int *, int, int);
 
int pancakeSort(int *list, unsigned int length)
{
    if (length < 2)
        return 0;
    int i, a, max_num_pos, moves;
 
    moves = 0;
    for (i = length;i > 1;i--)
    {
        max_num_pos = 0;
        for (a = 0;a < i;a++)
        {
            if (list[a] > list[max_num_pos])
                max_num_pos = a;
        }
        if (max_num_pos ==  i - 1)
            continue;
        if (max_num_pos)
        {
            moves++;
            doFlip(list, length, max_num_pos + 1);
        }
        doFlip(list, length, i);
    }
    return moves;
}
 

void doFlip(int *list,  int length,  int num)
{
    int swap;
    int i = 0;
    for (i;i < --num;i++)
    {
        swap = list[i];
        list[i] = list[num];
        list[num] = swap;
    }
}
 

void printArray(int list[], int length)
{
    int i;
    for (i = 0;i < length;i++)
    {
        printf("%d ", list[i]);
    }
}
 
int main(int argc,  char **argv)
{
   int n;
   scanf("%d",&n);
   int list[n];
   int i;
   printf("enter the n elements of array:\n");
   for (i = 0;i < n;i++)
       scanf("%d", &list[i]);
   printf("\nOriginal: ");
   printArray(list, n);
   int moves  =  pancakeSort(list, n);
   printf("\nSorted: ");
   printArray(list, n);
   printf(" - with a total of %d moves\n",  moves);
}
