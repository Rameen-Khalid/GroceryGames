

public class Perishable extends Product{
  private String productName;
  private int productID;
  private double productPrice;
  private int month;
  private int day;
  private int year;


  public Perishable(String productName, int productID, double productPrice, int month, int day, int year){
    super(productName,productID, productPrice);
    setProductName(productName);
    setProductId(productID);
    setProductPrice(productPrice);
    setMonth(month);
    setDay(day);
    setYear(year);
  }

  //checks to see if the item is expired
  public boolean expiredCheck(int currentMonth, int currentDay,int currentYear){
    if(currentYear > this.year){
      if(currentMonth > this.month){
        if(currentDay > this.day){
          return false;
        }else{
          return true;
        }
      }else{
        return true;
      }
    }else{
      return true;
    }
    return;
}

  //set methods for private variables
  public void setProductName(String productName){
    this.productName = productName;
  }
  public void setProductId(int productID){
    this.ProductID = productID;
  }
  public void setProductPrice(double productPrice){
    this.productPrice = productPrice;
  }
  public void setMonth(int month){
      this.month = month;
  }
  public void setDay(int day){
    this.day = day;
  }
  public void setYear(int year){
    this.year = year;
  }
  //get methods for private variables
  public String getProductName(){
    return this.productName;
  }
  public int getProductId(){
    return this.productID;
  }
  public double getProductPrice(){
    return this.productPrice;
  }
  public int getMonth(){
    return this.month;
  }
  public int getDay(){
    return this.day;
  }
  public int getYear(){
    return this.year;
  }

}
