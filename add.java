import java.util.Scanner;
public class add {

	public static void main(String[] args) {
		int a,b,c;
		char ch1;
		char ch2;
		ch1='a';
		ch2='b';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition is"+c);
		System.out.println("addition of char="+ch1+ch2);
		String s=String.valueOf(ch1)+String.valueOf(ch2);
		System.out.println(s);
		
	}

}
