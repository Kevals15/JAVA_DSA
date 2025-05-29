#include <stdio.h>
#include <stdlib.h>

void printname(int n)
{
    if (n <= 0)
        return;
    printf("\n keval");
    printname(n - 1);
}

void printwithi(int i, int n)
{
    if (i > n)
        return;
    printf("\n Keval");
    printwithi(i + 1, n);
}

void print1toN(int i, int n)
{
    if (i > n)
        return;
    printf("%d\n", i);
    print1toN(i + 1, n);
}

void printNto1(int i, int n)
{
    if (i > n)
        return;
    printNto1(i + 1, n);
    printf("%d\n", i);
}

int sumofN(int sum, int n)
{
    if (n <= 0)
        return sum;
    sum += n;
    return sumofN(sum, n - 1);
}

int factorial(int n)
{
    if (n <= 0)
        return 1;
    return n * factorial(n - 1);
}

int main()
{
    int n;
    scanf("%d", &n);
    // printNto1(1, n);
    printf("%d ", factorial(n));
}