public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestService("valet", "ABC123");
        frontDesk.requestService("housekeeping", "101");
        frontDesk.requestService("cart", "2");
    }
}
