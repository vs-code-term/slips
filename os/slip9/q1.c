
#include<stdio.h>
int main()
{
int need[10][10],all[10][10],max[10][10],ava[10],
i,j,finish[10],m,n,work[10],no=0,safe=0,seq[10];
char p[10],t='t',f='f';
int pn=0,temp=0,temp1=0,req[10],seq1[10],safe1=0;
printf("Enter the number of process\n");
scanf("%d",&m);
printf("Enter the number of resources\n");
scanf("%d",&n);
printf("enter allocations: \n");
for(i=0;i<m;i++)
{
 printf("enter the process %d: ",i);
 for(j=0;j<n;j++)
{
scanf("%d",&all[i][j]);
}
}
printf("enter max:\n");
for(i=0;i<m;i++)
 {
 printf("enter the process %d: ",i);
 for(j=0;j<n;j++)
 {
 scanf("%d",&max[i][j]);
 }
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
for(i=0;i<m;i++)
{
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
for(i=0;i<m;i++)
{
if(p[i]!=t)
{
for(j=0;j<n;j++)
 {
 if(need[i][j]<=work[j])
 no++;
 }
//f(no==n)
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
printf("Resourse process");
printf("enter the process no");
scanf("%d",&pn);
printf("enter the request");
 for(i=0;i<=n;i++)
{
 scanf("%d",&req[i]);
}
for(i=0;i<=n;i++)
{
 if(req[i]<=need[pn][i])
 temp++;
 }
if(temp==n)
{
 for(i=0;i<=n;i++)
 {
 if(req[i]<=ava[i])
 temp1++;
 }
}
printf("temp1=%d",temp1);
if(temp1==n)
 {
 for(i=0;i<=n;i++)
 {
 ava[i]=ava[i]-req[i];
 all[pn][i]=all[pn][i]+req[i];
 need[pn][i]=need[pn][i]-req[i];

}
}
printf("\n content of need table is:\n");
 for(i=0;i<=m;i++)
{
 for(j=0;j<n;j++)
 printf("%d\t",need[i][j]);
 printf("\n");
 }

 printf(" \n content of allocation table is:\n");
 for(i=0;i<=m;i++)
 {
 for(j=0;j<=n;j++)

 printf("%d\t",all[i][j]);
 printf("\n");
}
for(i=0;i<n;i++)
 work[i]=ava[i];
 for(i=0;i<m;i++)
 {
 printf("new work is:\n");
 for(j=0;j<n;j++)
 printf("%d\t",work[j]);
for(j=0;j<n;j++)
 {
if(need[i][j]<=work[j])
 no++;
}
if(no==n)
{
 printf("\n p%d id true\n",i);
p[i]=t;
 for(j=0;j<n;j++)
work[j]=work[j]+all[i][j];
seq1[safe1]=i;
safe1++;
}
else
p[i]=f;
no=0;
printf("\n new work is \n");
for(j=0;j<n;j++)
 printf("%d\t",work[j]);
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
printf("\n P%d is true \n",i);
p[i]=t;
 for(j=0;j<n;j++)
 work[j]=work[j]+all[i][j];
seq1[safe1]=i;
safe1++;
}
else
p[i]=f;
no=0;
printf("\n new work is");
for(j=0;j<n;j++)
printf("%d\t",work[j]);
}
}
if(safe1==m)
{
 printf("\n sysytem is in safe state");
printf("\n safe sequece is:");
 for(i=0;i<m;i++)
 printf("\n p%d",seq1[i]);
}
else
printf("\n sysytem is not safe \n");
}

  
