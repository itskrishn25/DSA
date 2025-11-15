#include<stdio.h>

void merge(int* first, int* second, int* merged, int m, int n){
    int i,j,k;
    i = j = k = 0;
    while(i<m && j<n){
        if(first[i] < second[j]){
            merged[k] = first[i++];
        } else {
            merged[k] = second[j++];
        }
        k++;
    }
    while(i<m){
        merged[k++] = first[i++];
    }
    while(j<n){
        merged[k++] = second[j++];
    }
}

void traverseArray(int* array, int size){
    for(int i=0;i<size;i++){
        printf("%d ", array[i]);
    }
}

int main(){
    int first[4] = {10,20,25,28};
    int second[8] = {4,7,11,18,19,24,30,35};

    int merged[12];
    merge(first, second, merged, 4, 8);

    traverseArray(merged, 12);
    return 0;
}