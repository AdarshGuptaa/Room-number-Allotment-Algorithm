package building.lobby;

import java.util.UUID;

public class lobbyBuilder {
    public static Lobby buildLinearLobby(int startRoom, int numberOfRooms, String orientation, int floor){
        LinearLobby lobby = new LinearLobby(UUID.randomUUID().toString(), startRoom, startRoom + numberOfRooms - 1, numberOfRooms, orientation, floor);
        RoomNumberAllotter.sequentialNumbering(lobby);
        return lobby;
    }

    public static Lobby buildDoubleLobby(int startRoom, int numberOfRooms, String orientation, int floor){
        DoubleLobby lobby = new DoubleLobby(UUID.randomUUID().toString(), startRoom, startRoom + numberOfRooms - 1, numberOfRooms, orientation, floor);
        RoomNumberAllotter.wrappedSequentialNumbering(lobby);
        return lobby;
    }

    public static Lobby buildDoubleLobby(int startRoom, int numberOfRooms, String orientation, int floor, String numbering){
        DoubleLobby lobby = new DoubleLobby(UUID.randomUUID().toString(), startRoom, startRoom + numberOfRooms - 1, numberOfRooms, orientation, floor);
        if(numbering.equals("sequence")){
            RoomNumberAllotter.sequentialNumbering(lobby);

        }
        if(numbering.equals("staggered")){
            RoomNumberAllotter.OddEvenNumbering(lobby);

        }
        else{
            RoomNumberAllotter.wrappedSequentialNumbering(lobby);
        }
        return lobby;
    }
}
