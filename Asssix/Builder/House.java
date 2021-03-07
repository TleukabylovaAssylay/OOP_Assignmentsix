package Asssix.Builder;

public class House {
    private String windows;
    private String doors;
    private String rooms;
    private  String garage;
    private  String swimmingPool;
    private  String statues;
    private  String garden;
    public House(String windows, String doors, String rooms, String garage, String swimmingPool, String statues,
            String garden) {
        this.setWindows(windows);
        this.setDoors(doors);
        this.setRooms(rooms);
        this.setGarage(garage);
        this.setSwimmingPool(swimmingPool);
        this.setStatues(statues);
        this.setGarden(garden);
    }
    public String getGarden() {
        return garden;
    }
    public void setGarden(String garden) {
        this.garden = garden;
    }
    public String getStatues() {
        return statues;
    }
    public void setStatues(String statues) {
        this.statues = statues;
    }
    public String getSwimmingPool() {
        return swimmingPool;
    }
    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
    public String getGarage() {
        return garage;
    }
    public void setGarage(String garage) {
        this.garage = garage;
    }
    public String getRooms() {
        return rooms;
    }
    public void setRooms(String rooms) {
        this.rooms = rooms;
    }
    public String getDoors() {
        return doors;
    }
    public void setDoors(String doors) {
        this.doors = doors;
    }
    public String getWindows() {
        return windows;
    }
    public void setWindows(String windows) {
        this.windows = windows;
    }
}
