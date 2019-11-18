

public class Stock{
  private Map<Product,ArrayList<Batch>> stock = new Map<>();

  public ArrayList<Batch> get(Product prod){
    return stack.get(prod);
  }
  public void add(Batch batch){
    Product temp = batch.getProduct();
    if(stock.containsKey(temp)){
      ArrayList<Batch> replace = stock.get(temp);
      replace.add(batch);
      stock.replace(temp,replace);
    }else{
      ArrayList<Batch> newlist = new ArrayList<>();
      newlist.add(batch);
      stock.put(temp,newlist);
    }
  }
  public void removeExpired(int month, int day, int year){//iterate through map and array to find expired batches

  }

  

}
