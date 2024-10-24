public class Valet implements HotelService {
    @Override
    public void execute(String plateNumber) {
        pickUpVehicle(plateNumber);
    }

    private void pickUpVehicle(String plateNumber) {
        System.out.println("Valet is picking up vehicle with plate number: " + plateNumber);
    }
}
