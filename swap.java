import java.util.Scanner;
public class swap {
	public static void main(String[] args) {
		int t,a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		t=a;
		a=b;
		b=t;
		System.out.println(a);
		System.out.println(b);
		}

}

