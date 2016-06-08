#include<stdio.h>
#include<conio.h>
void merge(int [],int ,int ,int );
void part(int [],int ,int );
int main()
{
int arr[30];
int i,size;
printf("Enter total no. of elements : ");
scanf("%d",&size);
for(i=0; i<size; i++)
{
printf("Enter %d element : ",i+1);
scanf("%d",&arr[i]);
}
part(arr,0,size-1);
for(i=0; i<size-1; i++)
{
if(a[i]!=a[i+1])
{
printf("original element= %d:,a[i]);
}
getch();
return 0;
}
