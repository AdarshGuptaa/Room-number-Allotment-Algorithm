package building.occupant;

public class Occupants {
    public Occupant occupants[];
    int size;
    public Occupants(int size){
        this.size = size;
        occupants = new Occupant[size];
    }
    public Occupant[] getOccupants() {
        return occupants;
    }
    public void setOccupants(Occupant[] occupants) {
        this.occupants = occupants;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
