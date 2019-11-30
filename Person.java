public class Person{
  protected String firstName; //employees and rewards members
  protected String lastName; //employees and rewards members
  protected int EmployeeId; //employee id
  protected double hourlyWage; //for calculating employees salaries
  protected String startDate; //employee start date 
  protected int bankAcct; //for direct deposit of wages for employees
  protected int cellNumber;
  protected double hoursWorked;
  protected String address;
  protected double totalWage;
  
  public String getFirstName() {
       return firstName; // getter method to get first name of employee
   }
   public void setFirstName(String FirstName) {
       this.firstName = firstName; // setter method to set first name of employee
   }
   public String getLastName() {
       return lastName; // getter method to get last name of employee
   }
   public void setLastName(String LastName) {
       this.lastName = lastName; // setter method to set last name of employee
   }
   public int getEmployeeId() {
       return EmployeeId; // getter method to get Employee Id of employee
   }
   public void setEmployeeId(int EmployeeId) {
       this.EmployeeId = EmployeeId; // setter method to set employee id of employee
   }
   public String getStartDate(){  // getter to set an employees start date
     return startDate;
   }
   public void setStartDate(String StartDate){ //setter for an employees start date
     this.startDate = startDate;
   }
   public double getHourlyWage(){ // getter to set an hourly wage rate
     return hourlyWage;
   }
   public void setHourlyWage(int hourlyWage){ //setter for an hourly wage rate
     this.hourlyWage = hourlyWage;
   }
   public int getBankAcct(){// getter to set a bank account for direct deposit
     return bankAcct;
   }
   public void setBankAcct(int bankAcct){//setter for a bank account for direct deposit
     this.bankAcct = bankAcct;
   }
   public int getCellNumber(){// getter for contact number for employees and rewards members
     return cellNumber;
   }
   public void setCellNumber(int cellNumber){//setter for contact number for employees and rewards members
     this.cellNumber = cellNumber;
   }
   public double getHoursWorked(){
     return hoursWorked;
   }
   public void setHoursWorked(double hoursWorked){
     this.hoursWorked = hoursWorked;
   }
   public String getAddress(){
     return address;
   }
   public void setAddress(String address){
     this.address = address;
   }
   public double getTotalWage(){
     return totalWage;
   }
   public void setTotalWage(double totalWage){
     this.totalWage = totalWage;
   }
}
   