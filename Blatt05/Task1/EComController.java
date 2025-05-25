package Blatt05.Task1;

public class EComController {
    public static void main(String[] args) {
        try {
            ShippingInfo info = new ShippingInfo("Munich", -80331, null);
            Profile profile = new Profile(info);
            Customer customer = new Customer(profile, 123);

            System.out.println("Shipping to: " + customer. getProfile (). getShippingInfo (). getCity ());

        } catch (InvalidShippingInfoException e) {
            System.err.println("Shipping info error: " + e.getMessage());
        } catch (MissingShippingInfoException e) {
            System.err.println("Profile error: " + e.getMessage());
        } catch (InvalidCustomerException e) {
            System.err.println("Customer error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}