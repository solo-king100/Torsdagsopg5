package Task_3;

import java.util.List;

public class Building {
    private final List<Room>rooms;
    private int numberOfFloors;

    private int numberOfBathrooms;

    private boolean isOfficeBuilding;

    Building(List<Room>rooms,boolean isOfficeBuilding, int numberOfFloors,int numberOfBathrooms){
       this.isOfficeBuilding=isOfficeBuilding;
       this.numberOfFloors=numberOfFloors;
       this.numberOfBathrooms=numberOfBathrooms;
       this.rooms=rooms;

    }


    public List<Room>getRooms(){
        return rooms;
    }
    public boolean getIsOfficeBuilding(){
        return isOfficeBuilding;
    }
    public int getNumberOfFloors(){
        return numberOfFloors;
    }
    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }
}
