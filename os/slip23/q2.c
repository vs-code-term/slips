#include<stdio.h>
#include<stdlib.h>

void main(){
    int rq[100], n, initial, i, total = 0;
    int visited[100] = {0};

    printf("\nEnter number of requests\n");
    scanf("%d",&n);

    printf("\nEnter the sequence\n");
    for(i = 0; i < n; i++)
        scanf("%d",&rq[i]);

    printf("\nEnter initial head\n");
    scanf("%d",&initial);

    for(i = 0; i < n; i++){
        int min = 9999, index = -1;


        for(int j = 0; j < n; j++){
            if(!visited[j]){
                int dist = abs(initial - rq[j]);
                if(dist < min){
                    min = dist;
                    index = j;
                }
            }
        }


        total += min;
        initial = rq[index];
        visited[index] = 1;
    }

    printf("\nTotal head movement = %d\n", total);
}