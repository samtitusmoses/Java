import java.util.Scanner;
class NnumSum{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value of N"); 
int N=scan.nextInt();
int x=1;
int sum=0;
while(x<=N){
sum=sum+x;
x++;
}
System.out.println("Total sum is "+sum);
}
}