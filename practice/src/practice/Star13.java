package practice;

public class Star13 {

	public static void main(String[] args) {
		
		for(int a=1; a<=11; a++)
		{
			for(int b=2; b<=a; b++)
			{
				System.out.print(" ");	
			}
			
			for(int c=11; c>=2*a-1; c-- )
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
