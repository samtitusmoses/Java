import java.util.Scanner;
class checksign{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
if(a<0){
System.out.println("Negative");
}
else if(a==0){
System.out.println("Zero");
}
else{
System.out.println("positive");
}
}
}