import java.util.Scanner;
class Greatnum{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a>b&&a>c)
System.out.println(a+" is greatest");
if(b>c)
System.out.println(b+" is greatest");
else
System.out.println(c+" is greatest");
}
}