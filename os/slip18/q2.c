
#include<stdio.h>
#include<stdlib.h>
int max=199;
void main(){
 int direction,rq[max],initial,i,headm=0,n,min,m,headb;
 printf("\nEnter the No Request\n");
 scanf("%d",&n);
 printf("\nEnter the sequence\n");
 for ( i = 0; i <n; i++)
 scanf("%d",&rq[i]);
 printf("\nEnter the initial\n");
 scanf("%d",&initial);
 printf("\nEnter head direction\n1:Left\n2:Right\n");
 scanf("%d",&direction);
 if(direction==1){
 m=rq[0];
 for(i=1;i<n;i++){
 if(m<=rq[i])
 m=rq[i];
 }
 headb=initial+m;
 printf("\nTotal left HeadMovement %d ",headb);
 }else{
 min=rq[0];
 for(i=1;i<n;i++){
 if(min>=rq[i])
 min=rq[i];
 }
 headm=max-initial+max-min;
 printf("\nTotal right HeadMovement %d ",headm);
 }
}
