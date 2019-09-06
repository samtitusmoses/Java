import java.util.Scanner;
class NKAmstrong{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a value");
int N=scan.nextInt();
int K=scan.nextInt();
for(int i=N;i<K;i++){
int temp=i;
int a=0;
int b;
while(temp!=0){
b=temp%10;
temp=temp/10;
a=a+(b*b*b);
if(i==a){
System.out.println(a);
}
}

}

}
}