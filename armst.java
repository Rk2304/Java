import java.util.Scanner;
public class armst {
	public static void main(String[] args) {
		int n,i,r=0,t;
		int s=0,am=0;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
     	n=sc.nextInt();
     	t=n;
     		while(n>0)
     		{
     			r=n%10;
     			s=r*r*r;
     			am=am+s;
     			n=n/10;
     		}
			if(am==t)
				System.out.println("Number is Armstrong number");
			else
				System.out.println("nuber is not Armstrong number");
	}
}
