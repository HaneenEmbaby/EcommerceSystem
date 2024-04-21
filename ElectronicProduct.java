public class ElectronicProduct extends Product {
    String Brand;
    int warrantyPeriod;
    public ElectronicProduct (String name, int ID, float price, String brand , int WarrantyPeriod){
        Name = name;
        productID = ID;
        Price = price;
        Brand = brand;
        warrantyPeriod = WarrantyPeriod;
    }
    public void setBrand(String b){
        this.Brand = b;
    }
    public void setWarrantyPeriod(int WP){
        if (WP < 0){
            WP = Math.abs(WP);
        }
        this.warrantyPeriod = WP;
    }
    public String getBrand(){
        return Brand;
    }
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }
}
