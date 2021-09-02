package mercury.core.beings;

import mercury.core.rooms.BasicRoom;

public abstract class BasicBeing {
    private String name;
    private int health;
    public BasicRoom location;

    /** Getter for Health */
    public int getHealth(){
        return this.health;
    }

    /**Setter for Health */
    public void setHealth(int newHealth){
        this.health = newHealth;
    }

    /** Getter for Location
    public String BasicRoom getLocation (BasicRoom location){
        return this.location;
    } */

    /** Setter for Location
    public void setLocation (BasicRoom newLocation){
        this.location = newLocation;
    } */

    /** Constructors for all instance variables */
    public BasicBeing (String name, int health, BasicRoom location){
        this.name = name;
        this.health = health;
        this.location = location;
    }

    /** Interact abstract method */
    abstract public void interact();

    /** Change Health */
    public void changeHealth(int change) {
        this.health += change;
    }

    /** Change location class */
    public void changeLocation(BasicRoom newLocation) {
        this.location = newLocation;
    }

}
