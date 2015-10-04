package easypatterns.structural.decorator;

public class SimpleRobot implements Robot {
    private String name;
    private int speed;
    private int stamina;
    private int strength;

    public SimpleRobot(String name, int speed, int stamina, int strength){
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
