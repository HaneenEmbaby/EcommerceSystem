public class Product {
    protected int productID;
    protected String Name;
    protected float Price;
    public void setID(int ID){
        if(ID < 0){
           ID = Math.abs(ID);
        }
        this.productID = ID;
    }
    public void setName(String n){
        this.Name = n;
    }
    public void setPrice(float price){
        if (price < 0){
            price = Math.abs(price);
        }
        Price = price;
    }
    public int getID (){
        return productID;
    }
    public String getName(){
        return Name;
    }
    public float getPrice(){
        return Price;
    }
}
