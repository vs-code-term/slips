
#include<stdio.h>
#include<stdlib.h>
int max=199;
void main(){
 int rq[max],initial,i,headm=0,n,j,m,headb;
 printf("\nEnter the No Request\n");
 scanf("%d",&n);
 printf("\nEnter the sequence\n");
 for ( i = 0; i <n; i++)
 scanf("%d",&rq[i]);
 printf("\nEnter the initial\n");
 scanf("%d",&initial);
 m=0;
 for(i=0;i<n;i++){
 if (rq[i] < initial && m<=rq[i])
 {
 m=rq[i];
 }
 }
 headm=max-initial+max+m;
 printf("\ntotal head movement %d %d",headm,m);
}