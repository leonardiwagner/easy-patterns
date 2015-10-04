package easypatterns.creational.builder;

public class RobotBuilder extends Robot {

    public RobotBuilder setName(String name){
        this.name = name;
        return this;
    }

    public RobotBuilder setSpeed(int speed){
        this.speed = speed;
        return this;
    }

    public RobotBuilder setStamina(int stamina){
        this.stamina = stamina;
        return this;
    }

    public RobotBuilder setStrength(int strength){
        this.strength = strength;
        return this;
    }

    public Robot build(){
        return this;
    }
}
