import java.util.*;
public class CFG
{
public static void main(String[] args)
{
Scanner name=new Scanner(System.in);
System.out.print("User name:");
String str=name.next();
int digits = 0;
for (int i = 0; i < str.length(); i++) {
if (str.charAt(i) >= 0 && str.charAt(i) <= 9)
digits++;
}
System.out.println("Total number of Digits = "+ digits);
}
}

