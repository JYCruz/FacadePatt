public class Cart implements HotelService {
    @Override
    public void execute(String numberOfCarts) {
        requestCart(numberOfCarts);
    }

    private void requestCart(String numberOfCarts) {
        System.out.println("Cart service is providing " + numberOfCarts + " carts.");
    }
}
