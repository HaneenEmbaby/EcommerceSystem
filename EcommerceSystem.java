import java.util.Scanner;
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Product p = new Product();
        Order order = new Order();
        Cart cart = new Cart();
        Customer cust = new Customer();
        order.setOrderID(1);

        ElectronicProduct EP = new ElectronicProduct("SmartPhone" , 1 , 599.9f, "Samsung" , 1);
        ClothingProduct CP = new ClothingProduct("T-shirt" , 2, 19.99f, "Medium" , "Cotton");
        BookProduct BP = new BookProduct("OOP" , 3 , 39.99f, "O'Reilly" , "X Publications");

        System.out.println("Welcome to the E-commerce System! \nPlease enter your ID");
        int ID = in.nextInt();
        cust.setCustomerID(ID);
        System.out.println("Please enter your name");
        String name = in.next();
        cust.setName(name);
        System.out.println("Please enter your address");
        String address = in.next();
        cust.setAddress(address);

        System.out.println("How many products you want to add to your cart?");
        int nProducts = in.nextInt();
        cart.setNProducts(nProducts);


        for (int i = 0; i < cart.getNProducts() ; i++) {
            System.out.println("Which product would you like to add? 1.Smartphone  2.T-shirt  3.OOP");
            int select = in.nextInt();

            /* switch (select) {
                 case 1 : cart.addProduct(EP,i);
                     break;
                 case 2 : cart.addProduct(CP,i);
                     break;
                 case 3 : cart.addProduct(BP,i);
                     break;
                 default:
                     System.out.println("Invalid response!");
             }*/

            if (select == 1) {
                cart.addProduct(EP, i);
            }else if (select == 2) {
                cart.addProduct(CP,i);
            }else if (select == 3) {
                cart.addProduct(BP,i);
            }else {
                System.out.println("Invalid response!");
            }
        }

        System.out.println("Your total is $" + cart.calculatePrice() +"\nDo you want to place an order?  1.Yes  2.No");
        int placeOrder = in.nextInt();
        if (placeOrder == 1) {
            System.out.println("Here's your order's summary:");
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Customer ID: " + cust.getCustomerID());
            System.out.println("Products:\n ");
            cart.placeOrder();
            System.out.println("Total price: $" + cart.calculatePrice());


        } else if (placeOrder == 2) {
            System.out.println("Thank you for your time!");
        } else {
            System.out.println("Invalid response!");
             }
    }
}
