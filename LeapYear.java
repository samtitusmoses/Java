import java.util.Scanner;
class LeapYear{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int yr=scan.nextInt();
if(yr%4==0)
if(yr%100==0)
if(yr%400==0)
System.out.println(yr+" is LEAP");
else
System.out.println(yr+" is NOT LEAP");
else
System.out.println(yr+" is LEAP");
else
System.out.println(yr+" is NOT LEAP");
}
}