package building.lobby;

public class RoomNumberAllotter {
    public static void OddEvenNumbering(DoubleLobby doubleLobby){
        int currentRoomNumber = doubleLobby.getStartRoom();
        for(int i = 0; i<doubleLobby.getNumberOfRooms()/2;i++){
            doubleLobby.lobby[i].getRoom1().setRoomNumber(currentRoomNumber++);
            doubleLobby.lobby[i].getRoom2().setRoomNumber(currentRoomNumber++);
        }
    }

    public static void sequentialNumbering(LinearLobby lobby){
        int currentRoomNumber = lobby.getStartRoom();
        for(int i = 0; i<lobby.getNumberOfRooms();i++){
            lobby.lobby[i].setRoomNumber(currentRoomNumber++);
        }
    }

    public static void sequentialNumbering(DoubleLobby doubleLobby){
        int currentRoomNumber = doubleLobby.getStartRoom();
        for(int i = 0; i<doubleLobby.getNumberOfRooms()/2;i++){
            doubleLobby.lobby[i].getRoom1().setRoomNumber(currentRoomNumber++);
        }
        for(int i = 0; i<doubleLobby.getNumberOfRooms()/2;i++){
            doubleLobby.lobby[i].getRoom2().setRoomNumber(currentRoomNumber++);
        }
        
    }

    public static void wrappedSequentialNumbering(DoubleLobby doubleLobby){
        int currentRoomNumber = doubleLobby.getStartRoom();
        for(int i = 0; i<doubleLobby.getNumberOfRooms()/2;i++){
            doubleLobby.lobby[i].getRoom1().setRoomNumber(currentRoomNumber++);
        }
        for(int i = doubleLobby.getNumberOfRooms()/2 - 1; i>=0;i--){
            doubleLobby.lobby[i].getRoom2().setRoomNumber(currentRoomNumber++);
        }

    }
}
