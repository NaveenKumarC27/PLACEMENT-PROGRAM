import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String str=in.next();
        str=str.replace("[","");
        str=str.replace("]","");
        String[] s=str.split(",");
        int max=0;
        int n[]=new int[s.length];
       for(int i=0;i<s.length;i++)
       {
           n[i]=Integer.valueOf(s[i]);
       }
       for(int i=0;i<s.length-1;i++)
       {
           int a=0;
           if(n[i]<n[i+1])
           {
               a=n[i]*2;
           }
           if(a>max)
           {
               max=a;
           }
       }
       System.out.println(max);
    }
}
