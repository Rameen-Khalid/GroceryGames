public class HourlyEmployee extends Person{
  // this class deals with the personal information, payroll and wages of employees.
  public static final double MIN_WAGE = 8.0;
  public HourlyEmployee(){
    super();
  }
  public HourlyEmployee(String firstName, String lastName, int EmployeeId, double hourlyWage, String startDate,
    int bankAcct, int cellNumber, double hoursWorked, String address, double totalWage){
    super();
    
    Positions a = Positions.CASHIER;
    
    if (a == Positions.CASHIER || a == Positions.BAGGER || a == Positions.JANITOR || a == Positions.MEAT
       || a == Positions.DELI || a == Positions.PRODUCE || a == Positions.SHOPPER){
      hourlyWage = MIN_WAGE;
      totalWage = hourlyWage * hoursWorked;
    }
  }
  public String toString(){   
      return(firstName + " " + lastName +"\n" + "Employee ID: " + EmployeeId + "\n" +
              "Contact number: " + " " + cellNumber + "\n" + "Total hours: " + hoursWorked +
              "Total wage: $" + totalWage + "\n" + "Personal Information: " + "\n\t" +
              "Bank Account: " + bankAcct + "\n" + "Address: " + address +
              "\n" + "Starting Date: " + startDate);
  }
}

  
                   
                   
//String firstName, String lastName, int EmployeeID, double hourlyWage, String startDate,
//int bankAcct, int cellNumber, double hoursWorked, String address){
                     
//super(firstName, lastName, EmployeeID, hourlyWage, startDate, bankAcct, cellNumber, hoursWorked, address);
                     
