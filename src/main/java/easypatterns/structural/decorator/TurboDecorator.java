package easypatterns.structural.decorator;

public class TurboDecorator implements Robot {
    private Robot robot;
    public TurboDecorator(Robot robot){ this.robot = robot;}

    @Override
    public String getName() {
        return this.robot.getName() + ", with turbo";
    }

    @Override
    public int getSpeed() {
        return this.robot.getSpeed() + 50;
    }

    @Override
    public int getStamina() {
        return this.robot.getStamina();
    }

    @Override
    public int getStrength() {
        return this.robot.getStrength();
    }
}
