public class Customer {
    int customerID;
    String Name;
    String Address;
    public void setCustomerID(int ID){
        if(ID < 0){
            ID = Math.abs(ID);
        }
        this.customerID = ID;
    }
    public int getCustomerID(){
        return customerID;
    }
    public void setName (String n){
        this.Name = n;
    }
    public String getName(){
        return Name;
    }
    public void setAddress (String add){
        this.Address = add;
    }
    public String getAddress(){
        return Address;
    }
}
