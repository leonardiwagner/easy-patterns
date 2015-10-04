package easypatterns.creational.factory;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTests {
    private RobotFactory robotFactory = new RobotFactory();

    @Test
    public void shouldCreateSpeedsterRobot(){
        Robot speedsterRobot = robotFactory.create(RobotType.SPEEDSTER);

        Assert.assertEquals("speedster robot", speedsterRobot.getName());
        Assert.assertEquals(100, speedsterRobot.getSpeed());
    }

    @Test
    public void fighterRobotShouldBeStrongerThanExplorerRobot(){
        Robot fighterRobot = robotFactory.create(RobotType.FIGHTER);
        Robot explorerRobot = robotFactory.create(RobotType.EXPLORER);

        Assert.assertTrue(fighterRobot.getStrength() > explorerRobot.getStrength());
    }
}
