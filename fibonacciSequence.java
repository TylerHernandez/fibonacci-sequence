package summer2019;
import java.util.*;
public class fibonacci {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your max number here: ");
		findfib(input.nextInt());
	}
	
	
	

	public static void findfib(int maxnumbers)
	{
		
/* Tyler Hernandez
 * Fibonacci is when we add our first two numbers then take the higher of
 * the three numbers we have and add them two together 
 * 
 * 
 */
		
		int a=1;
		int b=2;
		int c=3;
			
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			
	while(true) {
				if(c>a || c>b)
				{
					//c is a top number
					if(b>a)
					{
						//c and b are top numbers
						a=c+b;
						System.out.println(a);
						
						//break;
					}
					else {
						//c and a are top numbers 
						b=c+a;
						System.out.println(b);
						//break;
					}
				}
				if(b>a || b>c)
				{
					//b is a top number
					if(a>c)
					{
						//b and a are top numbers
						c=b+a;
						System.out.println(c);
						//break;
					}
					else {
						//b and c are top numbers
						a=b+c;
						System.out.println(a);
						//break;
					}
				}
				if(a>b || a>c) 
				{
					//a is a top number
					if(b>c)
					{
						//a and b are top numbers
						c=a+b;
						System.out.println(c);
						//break;
					}
					else {
						//a and c are top numbers 
						b=a+c;
						System.out.println(b);
						//break;
					}
				}
				if(a+b+c>maxnumbers)
				{
					break;
				}
				
			
	}//while true
				
		
	}
	
	
	
}
