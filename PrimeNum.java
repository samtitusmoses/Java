import java.util.Scanner;
class PrimeNum{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a value");
int N=scan.nextInt();
int flag=0;
for(int i=2;i<=N/2;i++){
if(N%i==0){
flag=1;
break;
}
else
continue;

}
if(flag==0)
System.out.println("Prime num");
else
System.out.println("Not a Prime Num");

}
}