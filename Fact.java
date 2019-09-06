import java.util.Scanner;
class Fact{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a value:");
int N=scan.nextInt();
int x=1;
int mul=1;
if (N==0)
System.out.println("Factorial of 0 is 1");
else if (N>0){
while(x<=N){
mul=mul*x;
x++;
}
System.out.println(N+" Factorial value is "+mul);
}
else
System.out.println("no factorial value for -ve num");

}
}
