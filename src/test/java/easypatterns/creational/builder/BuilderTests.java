package easypatterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTests {
    @Test
    public void shouldCreateRobot(){
        Robot robot = new RobotBuilder()
                .setName("some robot")
                .setSpeed(50)
                .setStamina(70)
                .setStrength(30)
                .build();

        Assert.assertEquals("some robot", robot.getName());
        Assert.assertEquals(50, robot.getSpeed());
        Assert.assertEquals(70, robot.getStamina());
        Assert.assertEquals(30, robot.getStrength());
    }
}
