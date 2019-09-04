import java.util.Scanner;
class CheckAlpha{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
char ch=scan.next().toUpperCase().charAt(0);
if(ch>64 && ch<91)
System.out.println("Alphabet");
else
System.out.println("Not");
}
}