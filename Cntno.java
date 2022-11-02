import java.util.*;
class Cntno
{
 static int fun(String str)
 {
 int i, count = 0;
 char ch[] = str.toCharArray();
 for(i = 0; i < str.length(); i++)
 {
 if(ch[i] >= '0' && ch[i] <= '9')
 count++;
 }
 return count;
 }
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
 System.out.println(fun(str));
 }
}
