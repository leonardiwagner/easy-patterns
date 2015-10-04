package easypatterns.structural.decorator;

public class SteelArmorDecorator implements Robot {
    private Robot robot;
    public SteelArmorDecorator(Robot robot){ this.robot = robot;}

    @Override
    public String getName() {
        return this.robot.getName() + ", with steel armor";
    }

    @Override
    public int getSpeed() {
        return this.robot.getSpeed();
    }

    @Override
    public int getStamina() {
        return this.robot.getStamina();
    }

    @Override
    public int getStrength() {
        return this.robot.getStrength() + 50;
    }
}