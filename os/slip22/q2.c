
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int bit[256],n,fb;
typedef struct d
{
 char fname[25];
 int length,start;
 struct d *next;
}NODE;
NODE *last,*first;
void init()
{
 printf("Enter the no. of block\n");//10
 scanf("%d",&n);
 for (int i = 0; i < n; i++)
 bit[i] =1;
 fb=n;//free block
}
void BitVector(){
 for (int i = 0; i < n; i++)
 printf("%d\t\n",bit[i]);

}
void createFile(){
 NODE *f;
 int i,j;
 int len;
 char fname[24];

 printf("Enter file name and length : ");
 scanf("%s%d",&fname,&len);

 f=(NODE*)malloc(sizeof(NODE));

 if(fb>len){
 strcpy(f->fname,fname);
 f->length=len;

 for (i = 0; i < n; i++)
 {
 if (bit[i]==1)
 break;
 }
 f->start=i;
 f->next=NULL;
 if (first==NULL)
 {
 first=f;
 }
 else{
 last->next=f;
 }
 last=f;
 fb-=len;
 j=i-1;


 while (len>0)
 {
 if(bit[j]==1){
 bit[i]=0;
 i=j;
 len--;
 }
 j++;
 }
 bit[i]=f->start+f->length;
 printf("File %s created successully.\n",fname);
 }
 else{
 printf("Insufficent Space");
 }
}
void show_dir(){
 NODE *f;
 f=first;
 printf("\tFile\tStart\tLength\n");
 while (f!=NULL)
 {
 printf("%7s\t%8d\t%9d\n",f->fname,f->start,f->length);
 f=f->next;
 }
}
void fdelete(){
 char fname[100];
 NODE *fp,*fn;
 int i,j;
 printf("Enter the file name to delete :\n");
 scanf("%s",&fname);
 fp=fn=first;
 while (fn!=NULL)
 {
 if(strcmp(fname,fn->fname)==0)
 break;
 fp=fn;
 fn=fn->next;
 }
 if (fn==NULL)
 {
 printf("File not found\n");
 }
 else{
 i=fn->start;
 while (bit[i]!=(fn->start+fn->length)){
 bit[i++]=1;
 }
 bit[i]=1;
 fb+=fn->length;
 if(fn==first){
 first=first->next;
 }
 else if(fn==last){
 last=fp;
 last->next=NULL;
 }
 else{
 fp->next=fn->next;
 }
 free(fn);
 printf("File %s deleted successfully.\n",fname);

 }
}
void main()
{
 int choice;
 init();
 do
 {
 printf("1 :Show bit vector\n");
 printf("2 :Create new file \n");
 printf("3 :Show Directry\n");
 printf("4 :Delete file\n");
 printf("5 :Exit\n");
 printf("\nEnter Your choice\n :");
 scanf("%d",&choice);
 switch (choice)
 {
 case 1:
 BitVector();
 break;
 case 2:
 createFile();
 break;
 case 3:
 show_dir();
 break;
 case 4:
 fdelete();
 break;
 default:
 break;
 }
 } while (choice<5);
 }
