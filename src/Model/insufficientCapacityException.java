package Model;

public class insufficientCapacityException extends Exception{
    private Integer capacity;

    public insufficientCapacityException(Integer capacity) {
        this.capacity = capacity;
    }
    public Integer getCapacity() {
        return capacity;
    }
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}
