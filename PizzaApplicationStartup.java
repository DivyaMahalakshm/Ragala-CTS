import javax.swing.JOptionPane;

public class PizzaApplicationStartup {
	private  static String pizzaname;
	private static String size;
	private static String Crust;
	private static int price;
	private static String toppings;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		String pizzName = JOptionPane.showInputDialog("Choose Pizza Name : [Veg Extravaganza, FarmHouse ]");
		String pizzSize = JOptionPane.showInputDialog("Choose pizza Size [Medium, Regular]");
		String pizzCrust = JOptionPane.showInputDialog("Choose pizza Crust [New Hannd Tosted]");

		orderPizza(pizzName,pizzSize, pizzCrust);
		displayPizzaOrder();
		
	}
	private static void orderPizza(String pName,String pSize, String pCrust) {
		pizzaname =  pName;
		size = pSize;
		Crust = pCrust;
		if(pizzaname.equals(PizzaConstants.VEG_EXTRAVAGANZA_PIZZA) 
				&& pSize.equals(PizzaConstants.SIZE_MEDIUM) 
				&& pCrust.equals(PizzaConstants.CRUST_NEW_HAND_TOASTED)) {
			price=PizzaConstants.PRICE_VEG_EXTRAVAGANZA;
			toppings=PizzaConstants.TOPPING_VEG_EXTRAVAGANZA;
		}
		if(pizzaname.equals(PizzaConstants.FARMHOUSE_PIZZA) 
				&& pSize.equals(PizzaConstants.SIZE_REGULARE)
				&& pCrust.equals(PizzaConstants.CRUST_NEW_HAND_TOASTED) ){
			price=PizzaConstants.PRICE_FARMHOUSE;
			toppings=PizzaConstants.TOPPING_FARMHOUSE;
		}

	}
	
	
	private static void displayPizzaOrder()
	{
		
		System.out.println("--------Your pizza details------");
		System.out.println("Pizza Name : "+pizzaname);
		System.out.println("Size: " +size);
		System.out.println("Crust :" +Crust);
		System.out.println("Price: "+price);
		System.out.println("Toppings: "+toppings);

	}

}
