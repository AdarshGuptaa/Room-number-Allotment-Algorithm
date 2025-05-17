package building.lobby;

public class LinearLobby extends Lobby{
    public Room[] lobby;
    
    public Room[] getLobby() {
        return lobby;
    }
    public void setLobby(Room[] lobby) {
        this.lobby = lobby;
    }
    public LinearLobby(String lobbyId,int startRoom, int endRoom, int numberOfRooms,  String orientation, int floor) {
        super(lobbyId, startRoom, endRoom, numberOfRooms, orientation, floor);
        lobby = new Room[numberOfRooms];
    }
    
}
