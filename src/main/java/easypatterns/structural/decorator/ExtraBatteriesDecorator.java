package easypatterns.structural.decorator;

public class ExtraBatteriesDecorator implements Robot {
    private Robot robot;
    public ExtraBatteriesDecorator(Robot robot){ this.robot = robot;}

    @Override
    public String getName() {
        return this.robot.getName() + ", with extra batteries";
    }

    @Override
    public int getSpeed() {
        return this.robot.getSpeed();
    }

    @Override
    public int getStamina() {
        return this.robot.getStamina() + 50;
    }

    @Override
    public int getStrength() {
        return this.robot.getStrength();
    }
}
