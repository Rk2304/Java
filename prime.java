
public class prime {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=53,f=0;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				f=0;
				System.out.println("not prime");
				System.out.println("i"+i);
				break;
			}
			
		}
		f=2;
		System.out.println("i"+i);
		if(i==n)
		{
			System.out.println("prime no");
		}
		
	}

}
