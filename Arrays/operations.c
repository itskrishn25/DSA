#include<stdio.h>

void insert(int* array, int* index, int value, int size){
    if(*index > size-1){
        printf("Insertion is not possible");
        return;
    }
    array[*index] = value;
    *index = *index + 1;
}

void delete(int* index){
    if(*index == 0){
        printf("No element is there to delete!");
        return;
    }
    *index = *index - 1;
}

void traverseArray(int* array, int size){
    for(int i=0;i<size;i++){
        printf("%d ", *(array+i));
    }
}

void reverse(int* array, int size){
    int i=0;
    int j=size-1;
    while(i<j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp; 
        i++;
        j--; 
    }
}

int main(){
    int array[10];
    int index = 0;
    for(int i=0;i<10;i++){
        insert(array, &index, i+1, 10);
    }

    printf("\nAfter Insertion : \n");
    traverseArray(array, 10);

    delete(&index);

    printf("\nAfter Deletion : \n");
    traverseArray(array, index);

    reverse(array, 10);
    printf("\nAfter Reverse : \n");
    traverseArray(array, 10);

    return 0;
}