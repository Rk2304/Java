import java.util.Scanner;

public class fact {
	public static void main(String[] args)
	{
		int f,i,n;
		f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of no is\t"+f);
	}

}

