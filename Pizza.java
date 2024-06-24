/*ch4 extraproject
pizza $15.99 
toppings 50 cents each 	*/

public class Pizza {

	//instance variables for the pizza class
	private String custName;
	private double price;
	private int numToppings;

	//New custom cconstructor for this class
	public Pizza() {
		custName = "Customer";
		price = 15.99;
		numToppings = 0;
	}//constructor method

		//basic static method for this class
		public static void intro() {
			System.out.println("***********************");
			System.out.println("Welcome to the digital pizza shop");
			System.out.println("***********************");
		}//intro

		//mutator methods for the pizza class
		public void enterName(String custName) {
			this.custName = custName;
		}

		public void addToppings(int num) {
			numToppings = num;
		}

		public void calcPrice() {
			price = price + (numToppings * 0.50); 
		}

		//accessor methods for the Pizza class
		public void summary() {
		System.out.println();
		System.out.println("Thank you " + custName);
		System.out.println("A pizza with " + numToppings + " topping(s) will cost $" + price);


		}

}//class

