package grooming;

public class Pyramid1 {

	public static void main(String[] args) {



		for (int i=1;i<=4;i++)
		{
			for (int j=i;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");

		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------------");	


		int space=0;
		int star=4;
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		
		System.out.println("------------------------------");
		
		int space1=3;
		int star1=1;
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=star1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space1--;
			star1=star1+2;
		}
		int space2=1;
		int star2=5;
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=space2;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=star2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space2++;
			star2=star2-2;
		}
	}

}
