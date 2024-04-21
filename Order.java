import java.util.Arrays;
public class Order {
    int customerID;
    int orderID;
    float totalPrice;

    public void setCustomerID(int cID) {
        if (cID < 0) {
            cID = Math.abs(cID);
        }
        this.customerID = cID;
    }

    public float getCustomerID() {
        return customerID;
    }

    public void setOrderID(int oID) {
        if (oID < 0) {
            oID = Math.abs(oID);
        }
        this.orderID = oID;
    }

    public float getOrderId() {
        return orderID;
    }

    public void setTotalPrice(float total) {
        this.totalPrice = total;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public float printOrderInfo() {
        return totalPrice;
    }
}