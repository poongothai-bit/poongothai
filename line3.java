import java.util.*;
public class number_of_words_line_3
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
String p="i am studing in velammal college";
int l,j=0;
l=sc.nextInt();
char c[]=p.toCharArray();
int i=0;
while(i<c.length)
{
    j=0;
while(j<=l)
{
System.out.print(c[i++]);
j++;
}
System.out.println("");
}
}
}
