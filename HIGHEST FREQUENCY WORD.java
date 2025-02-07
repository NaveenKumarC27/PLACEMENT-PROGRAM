import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] str=s.split(" ");
        int max=0,f=0;
        String res="";
        for(int i=0;i<(str.length)-1;i++)
        {
            String word=str[i];
            int count=0;
            for(int j=i+1;j<str.length;j++)
            {
                if(word.equals(str[j]))
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                res=word;
                f=1;
            }
        }
        if(f>=1)
        System.out.println(res);
        else
        System.out.println("None");
    }
}
