import java.util.*;

public class check_num {

		@SuppressWarnings("resource")
		
		public static void main(String[] args) {
			Scanner b=new Scanner(System.in); 
			System.out.println("Enter a positive integer");
			int B=b.nextInt();
			int C=0;
			
			if(B%2==0)
			{
				System.out.println(B+" is Even Number");
			}
			else
			{
				System.out.println(B+" is Odd Number");
			}
			
			for(int i=1;i<=B;i++)
			{
				if(B%i==0)
				{
					C++;
				}
			}
			if(C==2)
			{
				System.out.println(B+" is Prime Number");
			}
			else 
			{
				System.out.println(B+" is Composite Number");
			}
		}
	}