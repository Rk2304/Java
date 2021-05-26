import java.util.Scanner;
public class palin {
	public static void main(String[] args) {
		int n,i,r=0,t;
		int s=0;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
     	n=sc.nextInt();
     	t=n;
     		while(n>0)
     		{
     			r=n%10;
     			s=(s*10)+r;
     			n=n/10;
     		}
			if(s==t)
				System.out.println("Number is palindrome");
			else
				System.out.println("nuber is not palindrome");
	}

}
