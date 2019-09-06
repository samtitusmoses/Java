import java.util.Scanner;
class Palindrome{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a value");
int N=scan.nextInt();
int temp=N;
int rev=0;
while(temp!=0){
rev=rev*10+temp%10;
temp=temp/10;
}
System.out.println(N+" the rev num for given num is:"+rev);
if(rev==N)
System.out.println("palindrome");
else
System.out.println("Not a palindrome");

}
}