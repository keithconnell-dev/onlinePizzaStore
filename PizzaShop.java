import java.util.Scanner;
public class PizzaShop {
	public static void main(String[] args) {

		//variables and constants
		String customer;
		int toppings;
		Scanner input = new Scanner(System.in);
		Pizza order1 = new Pizza();

		//Input phase 
		Pizza.intro();
		System.out.print("What name will the order be under?:");
		customer = input.nextLine();
		System.out.print("enter number of toppings:");
		toppings = input.nextInt();

		//proccessing phase
		order1.enterName(customer);
		order1.addToppings(toppings);
		order1.calcPrice();

		//output phase
		order1.summary();

	}//end main




}