
#include <stdio.h>

int main()
{
    int a[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int i;
    int loc = -1;
    int item = 10;

    /* printf("Enter the ten element :");
     for (i = 0; i <= 10; i++)
     {
         scanf("%d", &i);
     }
     printf("\nEnter the item to be Search:");
     scanf("%d", &item);*/
    for (i = 0; i < 10; i++)
    {
        if (a[i] == item)
        {
            loc = i;
            loc++;
            break;
        }
    }
    if (loc == -1)

        printf("Eelement is  not found ");
    else
        printf("Element is  at %d found: ", item);
}