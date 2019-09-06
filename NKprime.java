import java.util.Scanner;
class NKprime{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a value");
int N=scan.nextInt();
int K=scan.nextInt();
int flag=0;
System.out.println("result");
for(int i=N+1;i<K;i++){
for(int j=2;j<i;j++){
if(i%j==0){
flag=0;
break;
}
else{
flag=1;
}
}
if(flag==1){
System.out.println(i);
}
}

}
}
