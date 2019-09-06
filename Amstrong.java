import java.util.Scanner;
class Amstrong{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a value");
int N=scan.nextInt();
int a=0;
int b;
int temp=N;
while(temp!=0){
b=temp%10;
temp=temp/10;
a=a+(b*b*b);
}
if(N==a)
System.out.println("Amstrong Num");
else
System.out.println("Not Amstrong num");

}
}