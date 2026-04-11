#include<stdio.h>
#include<stdlib.h>

void main(){
    int rq[100], n, initial, i, dir;
    int maxr = -1, minl = 9999, headm;

    printf("\nEnter number of requests\n");
    scanf("%d",&n);

    printf("\nEnter the sequence\n");
    for(i = 0; i < n; i++)
        scanf("%d",&rq[i]);

    printf("\nEnter initial head\n");
    scanf("%d",&initial);

    printf("\nEnter direction (0 = LEFT, 1 = RIGHT): ");
    scanf("%d",&dir);


    for(i = 0; i < n; i++){
        if(rq[i] > initial && rq[i] > maxr)
            maxr = rq[i];

        if(rq[i] < initial && rq[i] < minl)
            minl = rq[i];
    }

    if(dir == 1){  
        headm = (maxr - initial) + (maxr - minl);
    }
    else{          
        headm = (initial - minl) + (maxr - minl);
    }

    printf("\nTotal head movement = %d\n", headm);
}