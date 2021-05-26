import java.util.Scanner;
public class sum {
	public static void main(String[] args) {
		int i,n,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			c=c+i;
		}
		System.out.println("Sum of series\t"+c);
	}
}
