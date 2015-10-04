package easypatterns.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTests {
    @Test
    public void multipleSingletonRobotsShouldBeTheSame(){
        RobotSingleton firstRobotCall = RobotSingleton.getInstance();
        firstRobotCall.setName("robot one");
        firstRobotCall.setSpeed(50);

        RobotSingleton secondRobotCall =  RobotSingleton.getInstance();
        secondRobotCall.setSpeed(30);

        Assert.assertEquals("robot one", secondRobotCall.getName());
        Assert.assertEquals(30, firstRobotCall.getSpeed());
    }


}
