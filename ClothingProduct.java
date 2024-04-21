public class ClothingProduct extends Product {
    String Size;
    String Fabric;
    public ClothingProduct (String name, int ID, float price, String size , String fabric) {
        Name = name;
        productID = ID;
        Price = price;
        Size = size;
        Fabric = fabric;
    }
    public void setSize (String s){
        this.Size = s;
    }
    public void setFabric (String f){
        this.Fabric = f;
    }
    public String getSize(){
        return Size;
    }
    public String getFabric(){
        return Fabric;
    }
}
