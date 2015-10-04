package easypatterns.structural.decorator;

import org.junit.Assert;
import org.junit.Test;

public class DecoratorTests {
    private Robot robot = new SimpleRobot("just a robot", 50, 50, 50);
    @Test
    public void shouldDecorateRobotWithSteelArmor(){
        Robot robotWithArmor = new SteelArmorDecorator(robot);

        Assert.assertTrue(robotWithArmor.getName() == "just a robot, with steel armor");
        Assert.assertTrue(robotWithArmor.getSpeed() == robot.getSpeed());
        Assert.assertTrue(robotWithArmor.getStamina() == robot.getStamina());
        Assert.assertTrue(robotWithArmor.getStrength() > robot.getStrength());
    }

    @Test
    public void shouldDecorateRobotWithTurboAndExtraBatteries(){
        Robot robotWithExtraBatteriesAndTurbo = new ExtraBatteriesDecorator(new TurboDecorator(robot));

        Assert.assertTrue(robotWithExtraBatteriesAndTurbo.getName().equals( "just a robot, with turbo, with extra batteries"));
        Assert.assertTrue(robotWithExtraBatteriesAndTurbo.getSpeed() > robot.getSpeed());
        Assert.assertTrue(robotWithExtraBatteriesAndTurbo.getStamina() > robot.getStamina());
        Assert.assertTrue(robotWithExtraBatteriesAndTurbo.getStrength() == robot.getStrength());
    }
}
