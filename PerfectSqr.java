import java.util.*;
import java.lang.*;
import java.io.*;
class PerfectSqr
{
	public static void main (String[] args)
	{
		// your code goes here
		int n=1243;
		double s=Math.sqrt(n);
		double s1=Math.floor(s);
		if(s-s1==0){
			System.out.println("Perfect sqr");
		}
		else{
			System.out.println("not perfect sqr");
		}
 
	}
}
