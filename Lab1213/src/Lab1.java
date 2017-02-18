import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Years to Work: ");
			int YearstoWork = input.nextInt();
			System.out.print("\n");
			
		System.out.print("Annual Return: ");
			double AnnualReturn = input.nextDouble();
			System.out.print("\n");
			
			while (AnnualReturn > 20 | AnnualReturn < 0) 
			{
				System.out.print("Invalid Input, enter new value: ");
				AnnualReturn = input.nextDouble();
				System.out.print("\n");
			}
			
			
			
		
		System.out.print("Years Retired: ");
			int YearsRetired = input.nextInt();
			System.out.print("\n");
		
		System.out.print("Annual Return Two: ");
			double AnnualReturnTwo = input.nextDouble();
			System.out.print("\n");
			
			while (AnnualReturnTwo > 20 | AnnualReturnTwo < 0) 
			{
				System.out.print("Invalid Input, enter new value: ");
				AnnualReturnTwo = input.nextDouble();
				System.out.print("\n");
			}
		
		System.out.print("Required Income: ");
			double RequiredIncome = input.nextDouble();
			System.out.print("\n");
		
		System.out.print("Monthly SSI: ");
			double MonthlySSI = input.nextDouble();
			System.out.print("\n");
		
			
		input.close();
	}
}



	
