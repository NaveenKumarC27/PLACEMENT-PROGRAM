#include<stdio.h>
int power(int n,int m){
    int t=1;
    if(m==0)
        return 1;
    for(int i=0;i<m;i++){
        t*=n;
    }
    return t;
}
int main()
{
    int n;
    int a;
    scanf("%d",&n);
    scanf("%d",&a);
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
    a=i-a;
    if(bin[a]==0)
    {
        bin[a]=1;
    }
    else{
        bin[a]=0;
    }
    b--;
    int total=0;
    int x=b;
    for(int j=0;j<=b;j++)
    {
       if(bin[j]==1)
        {
          int c=power(2,x);
          total += c;
        }
       x--;
    }
    printf("%d",total);
}
