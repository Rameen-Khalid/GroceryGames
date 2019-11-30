public class SalaryEmployee extends Person{
  // this class deals with the personal information, payroll and wages of employees.
  
  public static final double WAGE = 25.0;
  public SalaryEmployee(){
    super();
  }
  public SalaryEmployee(String firstName, String lastName, int EmployeeId, double hourlyWage, String startDate,
    int bankAcct, int cellNumber, String address){
    super();
    
    Positions a = Positions.MANAGER;
    
    if (a == Positions.MANAGER || a == Positions.PHARMACY){
      hourlyWage = WAGE;
      totalWage = hourlyWage * hoursWorked;
    }
    else if(a == Positions.DPTMNGR){
      hourlyWage = 17.0;
      totalWage = hourlyWage * hoursWorked;
    }
  }
  public String toString(){   
      return(firstName + " " + lastName +"\n" + "Employee ID: " + EmployeeId + "\n" +
              "Contact number: " + " " + cellNumber + "\n" + "Total hours: " + hoursWorked +
              "Total wage: $" + totalWage + "\n" + "Personal Information: " + "\n\t" +
              "Bank Account: " + bankAcct + "\n" + "Address: " + address +
              "\n" + "Strarting Date: " + startDate);
  }
}