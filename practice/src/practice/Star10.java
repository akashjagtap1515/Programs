package practice;

public class Star10 {

	public static void main(String[] args) {
		for(int a= 1; a<=5 ; a++)
		{
			for(int b =2; b<=a ; b++)
			{
				System.out.print(" ");
			}
		for(int c=6;c>=a ;c--)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
		for(int a= 1; a<=6 ; a++)
		{
			for(int b = 5; b>=a ; b--)
			{
				System.out.print(" ");
			}
		for(int c=1;c<=a ;c++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}

	}

}
