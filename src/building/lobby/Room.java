package building.lobby;

import building.occupant.Occupants;

public class Room {
    public int roomNumber;
    public int size;
    public boolean occupied;
    public Occupants occupants;

    public Room(int roomNumber, int size){
        this.roomNumber = roomNumber;
        this.size = size;
        occupied = false;

        occupants = new Occupants(size);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public Occupants getOccupants() {
        return occupants;
    }

    public void setOccupants(Occupants occupants) {
        this.occupants = occupants;
    }
}
