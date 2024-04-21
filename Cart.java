public class Cart {
    int customerID;
    int nProducts;
    Product[] object;
    public void setCustomerID(int id) {
        if (id < 0) {
            id = Math.abs(id);
        }
        this.customerID = id;
    }

    public int getCustomerId() {
        return customerID;
    }

    public void setNProducts(int np) {
        if (np < 0) {
            np = Math.abs(np);
        }
        this.nProducts = np;
        this.object = new Product[np];
    }

    public int getNProducts() {
        return nProducts;
    }
    public void addProduct(Product pdt, int index) {
        if(index >= 0 && index < object.length){
            object[index] = pdt;
        }else System.out.println("The cart is full");
    }

    public void removeProduct(Product a) {
        for (int i = 0; i < nProducts; i++) {
            if (object[i] != null && object[i].equals(a)) {
                object[i] = null;
                break;
            }
        }
    }

    public float calculatePrice() {
        float totalPrice = 0.0f;
        for(int i = 0; i < object.length; i++) {
            if (object[i] != null) {
                totalPrice += object[i].getPrice();
            }
        }
        return totalPrice;
    }

    public void placeOrder() {
        for (Product product : object) {
            System.out.println(product.Name);
        }
    }
}
