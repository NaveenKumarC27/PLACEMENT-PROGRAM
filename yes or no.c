#include<stdio.h>
int main()
{
    int n;
    int a=-1,c=-1;
    scanf("%d",&n);
    int arr[10],i=0;
    while(n>0){
        arr[i]=n%2;
        i++;
        n=n/2;
    }
    int bin[i],b=0;
    for(int j=i-1;j>=0;j--)
    {
        bin[b]=arr[j];
        b++;
    }
    for(int j=1;j<b-1;j++)
    {
        if(bin[j]==0)
        {
            a=1;
        }
        else
        {
            a=-1;
        }
    }
    if(bin[0]==1)
    {
        if(bin[b-1]==1)
        {
            c=1;
        }
    }
    
    if(c==1 && a==1)printf("yes");
    else
    printf("no");
}
