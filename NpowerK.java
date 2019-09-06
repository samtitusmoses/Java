import java.util.Scanner;
class NpowerK{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a value");
int N=scan.nextInt();
System.out.println("enter the power value:");
int K=scan.nextInt();
int res=1;
for(int i=1;i<=K;i++){
res=res*N;
}
System.out.println("Result:"+res);
}
}