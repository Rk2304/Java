import java.util.Scanner;
public class eoadd {
	public static void main(String[] args) {
		int i,n,c=0,d=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				c=c+i;
			}
			else
			{
				d=d+i;
			}
		}
		System.out.println("Even no addtion is\t"+c);
		System.out.println("Odd no addtion is\t"+d);
	}

}

