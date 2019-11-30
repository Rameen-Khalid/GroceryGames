public class Expenses extends Vendors{
  
  double totalPrice;
  double totalExpenses;

  public static final double EnergyCost = 4.0; //energy cost per square foot of the store
  double sqrFootage;

  public Expenses(){
    super();
  }
  public Expenses(String nameCompany, String nameDriver, int dateDelivery, int quantityItem,
                  String nameItem, double priceItem){
    super();
    
    totalPrice = quantityItem * priceItem;
    double energyCost = EnergyCost * sqrFootage;
    
    double he = new HourlyEmployee().totalWage;
    double se = new SalaryEmployee().totalWage;
    
    totalExpenses = totalPrice + energyCost + he + se;
  }
  public String toString(){
    return ("Delivery Company: " + nameCompany +
            "Delivery Driver: " + nameDriver +
            "Delivery Date: " + dateDelivery +
            "Item Name: " + nameItem +
            "Quantity: " + quantityItem+
            "Price per unit: " + priceItem +
            "\n\n" + "Cost of Busniness: " + totalExpenses);
  }
}