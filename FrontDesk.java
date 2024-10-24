public class FrontDesk {
    private HotelService valet;
    private HotelService houseKeeping;
    private HotelService cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void requestService(String serviceType, String request) {
        switch (serviceType.toLowerCase()) {
            case "valet":
                valet.execute(request);
                break;
            case "housekeeping":
                houseKeeping.execute(request);
                break;
            case "cart":
                cart.execute(request);
                break;
            default:
                System.out.println("Service not available.");
        }
    }
}
