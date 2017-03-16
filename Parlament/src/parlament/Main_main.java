package parlament;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		VRU vru = new VRU();
		vru.makeFraction();
		vru.makeFraction();
		vru.makeFraction();
		vru.makeFraction();
		vru.showAllFractions();
		vru.showConcretFraction();
		vru.addDeputyToConcretFraction();
		vru.deleteFraction();
		vru.deleteDeputy();
		vru.showAllFractions();

		boolean flag=true;
	    while(flag) 	 {
			System.out
					.println("Enter number from 1 to 9 to select menu option:");
			System.out.println("       1 - to add fraction");
			System.out.println("       2 - to remove fraction");
			System.out.println("       3 - to clear fraction");
			System.out.println("       4 - to show all fractions");
			System.out.println("       5 - to show fraction");
			System.out.println("       6 - to add deputy into fraction");
			System.out.println("       7 - to remove deputy from fraction");
			System.out.println("       8 - to show all grafters");
			System.out.println("       9 - to show the biggest grafter");

			try {
				if(scanner.hasNextInt()){
				int menuOption = scanner.nextInt();
				switch (menuOption) {
				case 1:
					vru.makeFraction(); flag=false;
					break;
				case 2:
					vru.deleteFraction();flag=false;
					break;
				case 3:
					vru.clearFraction();flag=false;
					break;
				case 4:
					vru.showAllFractions();flag=false;
					break;
				case 5:
					vru.showConcretFraction();flag=false;
					break;
				case 6:
					vru.addDeputyToConcretFraction();flag=false;
					break;
				case 7:
					vru.deleteDeputy();flag=false;
					break;
				case 8:
					vru.showAllGraftersInFraction();flag=false;
					break;
				case 9:
					vru.biggestGraftersInFfaction();flag=false;
					break;
				default:
					System.out
							.println("Only digits are allowed. Enter a number from 1 to 9");
					break;
				}}
				else{
					System.out
					.println("Only digits are allowed. Enter a number from 1 to 9");
				}
			} catch (InputMismatchException exception) {
				System.out
						.println("Only digits are allowed. Enter a number from 1 to 9");
			} 

		
		}
		
	}
}
