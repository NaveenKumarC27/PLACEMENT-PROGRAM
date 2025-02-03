import java.util.*;
public class main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String j=in.next();
        String s=in.next();
        int c=0;
        for(int i=0;i<j.length();i++)
        {
            for(int k=0;k<s.length();k++)
            {
                if(j.charAt(i)==s.charAt(k))
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
