#include <stdio.h>

#define QUEUE_CAPACITY 8

int queue[QUEUE_CAPACITY];
int head = 0;
int tail = -1;
int size = 0;

void enqueue(int n) {
    if( size == QUEUE_CAPACITY ) {
        printf("queue full!\n");
        return;
    }
    tail = (tail+1) % QUEUE_CAPACITY;
    size++;
    queue[tail] = n;
}

int dequeue() {
    int val = 0;
    if( size == 0 ) {
        printf("queue empty!\n");
        return -1;
    }
    val = queue[head];
    head = (head+1) % QUEUE_CAPACITY;
    size--;

    return val;
}

int main() {
    int number = 0;
    int printVal = 0;

    do {
        printf("Input Number : ");
        scanf("%d", &number);

        if( number > 0 ) {
            enqueue(number);
        } else if( number == 0 ) {
            printVal = dequeue();
            printf("[%d]\n", printVal);
        }
    } while( number >= 0 );

    printf("Program End\n");
    return 0;
}
