package building.lobby;

public class Lobby {
    public int lobbyId;
    public int numberOfRooms;
    public int startRoom;
    public int endRoom;
    public String orientation;
    public int floor;

    public Lobby(int lobbyId, int startRoom, int endRoom, int numberOfRooms, String orientation, int floor) {
        this.endRoom = endRoom;
        this.lobbyId = lobbyId;
        this.numberOfRooms = numberOfRooms;
        this.orientation = orientation;
        this.startRoom = startRoom;
        this.floor = floor;
    }
    
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public int getStartRoom() {
        return startRoom;
    }
    public void setStartRoom(int startRoom) {
        this.startRoom = startRoom;
    }
    public int getEndRoom() {
        return endRoom;
    }
    public void setEndRoom(int endRoom) {
        this.endRoom = endRoom;
    }
    public String getOrientation() {
        return orientation;
    }
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}
