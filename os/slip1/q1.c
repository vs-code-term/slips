
#include<stdio.h>
int main()
{
int m,n,i,j,all[10][10],max[10][10],need[10][10],
ava[10],work[10],no=0,safe=0,seq[10];
char p[10],t='t',f='f';
printf("Enter the number of process\n");
scanf("%d",&m);
printf("Enter the number of resources\n");
scanf("%d",&n);
printf("Enter the Allocations\n");
for(i=0;i<m;i++)
{
printf("Enter the allocation for process p%d\t",i);
for(j=0;j<n;j++)
{
scanf("%d",&all[i][j]);
}
}
printf("Enter the Max\n");
for(i=0;i<m;i++)
{
printf("Enter the Max for process p%d\t",i);
for(j=0;j<n;j++)
{
scanf("%d",&max[i][j]);
}
}
printf("Process\t\tAllocation\t\tMax\n\n");
for(i=0;i<m;i++)
{
printf("p%d\t",i);
for(j=0;j<n;j++)
{
printf("%d\t",all[i][j]);
}
printf("\t");
for(j=0;j<n;j++)
{
printf("%d\t",max[i][j]);
}
printf("\n");
}
printf("enter availables:\n");
for(j=0;j<n;j++)
{
scanf("%d",&ava[j]);
work[j]=ava[j];
}
printf("\n work is:\n");
for(j=0;j<n;j++)
printf("%d \t",work[j]);
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
{
 need[i][j]=max[i][j]-all[i][j];
}
}
printf("\n contents of need table is: \n");
printf("Process\tNeed\n\n");
for(i=0;i<m;i++)
{
printf("P%d\t",i);
for(j=0;j<n;j++)
printf("%d \t",need[i][j]);
 printf("\n");
}
 for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
 if(need[i][j]<=work[j])
 no++;
 }
if(no==n)
{
printf("\n p%d is true \n",i);
p[i]=t;
 for(j=0;j<n;j++)
 work[j]=work[j]+all[i][j];
 seq[safe]=i;
 safe++;
 }
else
p[i]=f;
no=0;
printf("\n new work is:\n");
for(j=0;j<n;j++)
printf("%d \t",work[j]);
}
for(i=0;i<m;i++)
{
 if(p[i]!=t)
{
for(j=0;j<n;j++)
{
if(need[i][j]<=work[j])
no++;
}
if(no==n)
{
printf("\n p%d is true \n",i);
p[i]=t;
 for(j=0;j<n;j++)
work[j]=work[j]+all[i][j];
seq[safe]=i;
safe++;
}
else
p[i]=f;
no=0;
printf("\n new work is:\n");
for(j=0;j<n;j++)
printf("%d \t",work[j]);
}
}
if(safe==m)
{
printf("\n system is in safe state:\n");
printf("safe sequence is:{");
 for(i=0;i<m;i++)
 printf("p%d",seq[i]);
 printf("}");
}
else
printf("\n system is not safe:\n");
}




