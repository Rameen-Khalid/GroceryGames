public class Vendors{
  protected String nameCompany; //name of the company delivering the products
  protected String nameDriver; // name of the deliery driver 
  protected int dateDelivery; // date of the delivery to keep track of perishable items
  protected int quantityItem; // quantity of the items delivered
  protected String nameItem; // product name of the item delivered 
  protected double priceItem;
  
  public String getNameCompany(){
    return nameCompany;
  }
  public void setNameCompany(String nameCompany){
    this.nameCompany = nameCompany;
  }
  public String getNameDriver(){
    return nameDriver;
  }
  public void setNameDriver(String nameDriver){
    this.nameDriver = nameDriver;
  }
  public int getDateDelivery(){
    return dateDelivery;
  }
  public void setDateDelivery(int dateDelivery){
    this.dateDelivery = dateDelivery;
  }
  public int getQuantityItem(){
    return quantityItem;
  }
  public void setQuantityItem(int quantityItem){
    this.quantityItem = quantityItem;
  }
  public String getNameItem(){
    return nameItem;
  }
  public void setNameItem(String nameItem){
    this.nameItem = nameItem;
  }
  public double getPriceItem(){
    return priceItem;
  }
  public void setPriceItem(double priceItem){
    this.priceItem = priceItem;
  }
  
}
  
  
  