import java.util.*;
public class numeric {
    public static void main(String ar[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
    String a=new String();
    a=sc.next();
    int c=0;
    char b[]=a.toCharArray();
    for(int i=0;i<b.length;i++)
    {
    if(b[i]=='0'||b[i]=='1'||b[i]=='2'||b[i]=='3'||b[i]=='4'||b[i]=='5'||b[i]=='6'||b[i]=='7'||b[i]=='8'||b[i]=='9'
    ||b[i]=='.'||b[i]=='e'||b[i]=='E'||b[i]==32)
    {
   c++; 
    }
    else
        c--;
   }
    
    
    if(c==b.length)
        System.out.println("true");
    else
        System.out.println("false");
    }
}
