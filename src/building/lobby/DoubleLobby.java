package building.lobby;

public class DoubleLobby extends Lobby{

    protected  class Container{
        public Room room1;
        public Room room2;
        public Room getRoom1() {
            return room1;
        }
        public void setRoom1(Room room1) {
            this.room1 = room1;
        }
        public Room getRoom2() {
            return room2;
        }
        public void setRoom2(Room room2) {
            this.room2 = room2;
        }
    }

    public Container lobby[];

    public DoubleLobby(String lobbyId, int startRoom, int endRoom, int numberOfRooms, String orientation, int floor) {
        super(lobbyId, startRoom, endRoom, numberOfRooms, orientation, floor);
        lobby = new Container[numberOfRooms/2];
    }

}
