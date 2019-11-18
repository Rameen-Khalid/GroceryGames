

public class Batch{
  private int quantity;
  private Product product;

  public Batch(Product product,int quantity){
    setProduct(product);
    setQuantity(quantity);
  }

  public void setProduct(product){
    this.product = product;
  }
  public void setQuantity(int quantity){
    this.Quantity = quantity;
  }
  public Product getProduct(){
    return this.product;
  }
  public int getQuantity(){
    return this.quantity;
  }
  public void remove(int num){
    if(this.quantity > num){
      this.quantity = this.quantity - num;
    }
  }
  public void add(int num){
    this.quantity = this.quantity + num;
  }


}
