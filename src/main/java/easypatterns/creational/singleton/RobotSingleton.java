package easypatterns.creational.singleton;

public class RobotSingleton {
    private String name;
    private int speed;
    private int stamina;
    private int strength;
    private RobotSingleton(){}

    private static RobotSingleton instance;
    public static RobotSingleton getInstance(){
        if(instance == null) instance = new RobotSingleton();
        return instance;
    }

    public String getName() { return this.name; }
    public int getSpeed() { return this.speed; }
    public int getStamina() { return this.stamina; }
    public int getStrength() { return this.strength; }

    public void setName(String name){ this.name = name;}
    public void setSpeed(int speed){ this.speed = speed;}
    public void setStamina(int stamina){ this.stamina = stamina;}
    public void setStrength(int strength){ this.strength = strength;}
}
