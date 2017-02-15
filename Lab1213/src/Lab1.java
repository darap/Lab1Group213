import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Years to Work:");
		int YearstoWork = input.nextInt();
		System.out.println("Annual Return:");
		int AnnualReturn = input.nextInt();
		System.out.println("Years Retired:");
		int YearsRetired = input.nextInt();
		System.out.println("Annual Return Two:");
		int AnnualReturnTwo = input.nextInt();
		System.out.println("Required Income:");
		double RequiredIncome = input.nextDouble();
		System.out.println("Monthly SSI:");
		double MonthlySSI = input.nextDouble();
	}

}
