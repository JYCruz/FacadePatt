public class HouseKeeping implements HotelService {
    @Override
    public void execute(String roomNumber) {
        cleanRoom(roomNumber);
    }

    private void cleanRoom(String roomNumber) {
        System.out.println("Housekeeping is cleaning room number: " + roomNumber);
    }
}
