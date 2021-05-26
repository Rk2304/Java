import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
				int n,r=0;
				int s=0;
		        Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
		     	n=sc.nextInt();
		     		while(n>0)
		     		{
		     			r=n%10;
		     			s=s*10+r;
		     			n=n/10;
		     		}
		System.out.println("Reverse Number is\t"+s);
	}
}

