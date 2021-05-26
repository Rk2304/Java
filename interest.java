import java.util.Scanner;
public class interest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double CI;
	System.out.println("Enter the principle");
	int p=sc.nextInt();
	System.out.println("Enter the time");
	double t=sc.nextDouble();
	System.out.println("Enter the rate");
	double r=sc.nextDouble();
	double c=(1+r/100);
	CI=p*(Math.pow(c,t));
	System.out.println("Compound Intrest is\t"+CI);
}
}

