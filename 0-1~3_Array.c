#include <stdio.h>

int max_arr(int arr[], int arr_len) {
    int i=0;
    int max = arr[0];

    for( i=1 ; i<arr_len ; i++ ) {
        if( arr[i] > max ) {
            max = arr[i];
        }
    }
    return max;
}

int min_arr(int arr[], int arr_len) {
    int i=0;
    int min = arr[0];

    for( i=1 ; i<arr_len ; i++ ) {
        if( arr[i] < min ) {
            min = arr[i];
        }
    }
    return min;
}

void swap(int *x, int *y) {
    int temp;

    temp = *x;
    *x = *y;
    *y = temp;
}

void right_rotate(int arr[], int pos1, int pos2, int count) {
    if( count > 0 ) {
        int i = 0;
        int last = arr[pos2];

        for( i=pos2 ; i>pos1 ; i-- ) {
            arr[i] = arr[i-1];
        }
        arr[pos1] = last;
        right_rotate(arr, pos1, pos2, count-1);
    }
}

int main() {
    int i=0;
    int a = 10;
    int b = 20;
    int numbers[5] = {1, 2, 3, 4, 5};

    right_rotate(numbers, 1, 3, 3);

    for( i=0 ; i < 5 ; i++ ) {
        printf("%d ", numbers[i]);
    }
    printf("\n");
    return 0;
}
