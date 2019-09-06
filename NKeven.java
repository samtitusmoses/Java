import java.util.Scanner;
class NKeven{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the values of N & K:");
int N=scan.nextInt();
int K=scan.nextInt();
System.out.println("the even nums are:");
for(int i=N+1;i<K;i++){
if(i%2==0)
System.out.println(i);
}
}
}