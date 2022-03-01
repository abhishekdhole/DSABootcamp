#include <stdio.h>

void main()
{
    int array[10];
    int i, item, low, mid, high, loc = -1, n;
    printf("Enter the Size of Array :");
    scanf("%d", &n);
    printf("Enter The array element :");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &array[i]);
    }
    printf("Enter Item to find :");
    scanf("%d", &item);

    low = 0;
    high = n - 1;

    while (low <= high)
    {
        mid = (low + high) / 2;

        if (array[mid] == item)
        {
            loc = mid;
            break;
        }
        if (item > array[mid])
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }

    if (loc == -1)
    {
        printf("Element not Found ");
    }
    else
    {
        printf("Element is found at %d postion", mid);
    }
}