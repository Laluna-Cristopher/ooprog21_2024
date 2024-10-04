public class Billing {
    
    
    public void computeBill(double price) {
        double tax = 0.08;
        double total = price + (price * tax);
        System.out.printf("Total bill for price %.2f: %.2f%n", price, total);
    }

    
    public void computeBill(double price, int quantity) {
        double tax = 0.08;
        double subtotal = price * quantity;
        double total = subtotal + (subtotal * tax);
        System.out.printf("Total bill for price %.2f and quantity %d: %.2f%n", price, quantity, total);
    }

    
    public void computeBill(double price, int quantity, int couponDiscount) {
        double tax = 0.08;
        double subtotal = price * quantity;
        double discountAmount = (subtotal * couponDiscount) / 100;
        double total = (subtotal - discountAmount) + ((subtotal - discountAmount) * tax);
        System.out.printf("Total bill for price %.2f, quantity %d, and coupon discount %d%%: %.2f%n", price, quantity, couponDiscount, total);
    }

    
    public static void main(String[] args) {
        Billing billing = new Billing();
        
        
        billing.computeBill(23.2);
        billing.computeBill(23.2, 3);
        billing.computeBill(23.2, 3, 10);
    }
}
