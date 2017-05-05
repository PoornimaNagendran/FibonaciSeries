package guvipractise;
import java.util.Scanner;
public class Fibonacci {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Fibonacci series");
System.out.println("Enter the range");
int f1=0;
int f2=1;
int f3;
int r=s.nextInt();

if(r==0 || r==1)
{
	System.out.println(f1);
}
else if(r==2)
{
System.out.println(f1+"\n"+f2);
}
else
{
	System.out.println(f1+"\n"+f2);
for(int i=3;i<=r;i++)
{
	f3=f1+f2;
	f1=f2;
	f2=f3;
	System.out.println(f3);
}
	}
	}
}
