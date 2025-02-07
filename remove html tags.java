import java.util.*;
public class main
{
    public static void main (String[]args)
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        for(int i=0;i<=a;i++)
        {
           String s=in.nextLine();
      ///  System.out.print(s);
            String[] parts=s.split("<");
             String[] x=new String[10];  
             String[] u=new String[10];
             int l=-1;
            // u[l]="";
            String t="";
            int d=0;
            x[d]="";
            for(String p:parts)
            {
              //  String[] q=p.split(">");
                /*for(String w:q)
                {
                    System.out.println(w);
                }
                str x
                //String d=p;
            String[] x=new String[10];  
            String t="";
            int d=0;
            x[d]="";*/
            int h=0;
            //int m2=0;
            for(int j=0;j<p.length();j++)
            {
                if(p.charAt(j)!='>')
                {
                    if(h==0)
                    {
                t=t+Character.toString(p.charAt(j));
                  x[d]=x[d]+(Character.toString(p.charAt(j)));  
                 // System.out.print(x[d]+" ");
                    }
                    else{
                       
                         u[l]=u[l]+(Character.toString(p.charAt(j)));
                        //  System.out.print(u[l]+" ");
                    }
                }
               
                else{
                    d++;
                    x[d]="";
                    l++;
                    h=-1;
                  //  m2=-1;
                    u[l]="";
                   // break;
                   
                }
            }
            }
         
             int c=0;
              for(int v=0;v<d;v++)
              {
                  if(d<=2)
                  {
                  if(("/"+x[v]).equals(x[v+1]))   {              
                      System.out.println(u[c]);
                  }
                  else{
                      System.out.println("None");
                  }
                  c++;
                  v++;
                 
                  }
                  else{
                    // int m1=0;
                      for(int w=0;w<d;w++)
                      {
                          if(("/"+x[v]).equals(x[w]))
                          {
                           
                                  if(u[c].equals(""))
                                  {
                                      c++;
                                     
                                  }
                                 else{
                              System.out.println(u[c]);
                                 
                             c++;}
                             //m1=-1;
                            // w++;
                             
                             }
                      }
                   /*  if(m1==-1){
                      System.out.println();}
                  }*/
                 
              }
               
           
           /* for(int j=0;j<s.length();j++)
            {
               // System.out.print(s.charAt(j));
            }*/
        //System.out.println();
        }
    }
}
}
