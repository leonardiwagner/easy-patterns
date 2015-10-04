package easypatterns.creational.factory;

public class Robot {
    protected String name;
    protected int speed;
    protected int stamina;
    protected int strength;

    protected Robot(String name, int speed, int stamina, int strength){
        this.name = name;
        this.speed = speed;
        this.stamina = stamina;
        this.strength = strength;
    }

    public String getName() { return this.name; }
    public int getSpeed() { return this.speed; }
    public int getStamina() { return this.stamina; }
    public int getStrength() { return this.strength; }
}

