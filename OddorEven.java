import java.util.Scanner;
class OddorEven{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a num");
int a=scan.nextInt();
if(a%2==0){
System.out.println(a+" is Even");
}
else{
System.out.println(a+" is Odd");
}
}
}