#include<stdio.h>
#include<stdlib.h>
void main()
{
 int rq[199],initial,i,headm=0,n;
 printf("\nEnter the No Request\n");
 scanf("%d",&n);
 printf("\nEnter the sequence\n");
 for ( i = 0; i <n; i++)
 scanf("%d",&rq[i]);
 printf("\nEnter the initial\n");
 scanf("%d",&initial);
 for(i=0;i<n;i++)
 {
 headm +=abs(rq[i]-initial);
 initial=rq[i];
 }
 printf("\ntotal moment %d",headm);
}

