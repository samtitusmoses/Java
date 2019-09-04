import java.util.Scanner;
class NarrayKsum{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the values of N & K:");
int N=scan.nextInt();
int K=scan.nextInt();
int[] arr=new int[N];
int sum=0;
System.out.println("Enter N elements:");
for(int i=0;i<N;i++){
int temp=scan.nextInt();
arr[i]=temp;
}
for(int j=0;j<K;j++)
sum=sum+arr[j];

System.out.println("Output: "+sum);
}
}
