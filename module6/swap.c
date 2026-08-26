#include <stdio.h>

void swap(int *a, int *b);
void broken_swap(int a, int b);

int main() {
    int x = 5, y = 10;
    printf("Before swap: x = %d, y = %d\n", x, y);
    swap(&x, &y);
    printf("After swap: x = %d, y = %d\n", x, y);

    int m = 15, n = 20;
    printf("Before broken swap: m = %d, n = %d\n", m, n);
    broken_swap(m, n); 
    printf("After broken swap: m = %d, n = %d\n", m, n);
    // This will not swap because the function receives copies, not addresses
    
    return 0;
}

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void broken_swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}