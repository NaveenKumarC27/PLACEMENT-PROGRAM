import java.util.*;
public class main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            int max=0;
            for(int j=0;j<n;j++)
            {
                arr[j]=in.nextInt();
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
            int sum=0,p=0,c=1;
            p=arr[n-1]*c+max;
            c++;
            sum+=p;
            for(int j=0;j<n-1;j++)
            {
                p=0;
                p=arr[j]*c;
                p+=max;
                c++;
                sum+=p;
            }
            System.out.println(sum);
        }
    }
}
