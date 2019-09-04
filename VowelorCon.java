import java.util.Scanner;
class VowelorCon{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a char");
char ch=scan.next().toLowerCase().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
System.out.println(ch+" is vowel");
else
System.out.println(ch+" is consonant");
}
}