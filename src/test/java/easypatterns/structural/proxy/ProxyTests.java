package easypatterns.structural.proxy;

import org.junit.Assert;
import org.junit.Test;

public class ProxyTests {
    @Test
    public void shouldDecorateRobotWithSteelArmor(){
        MathRobot mathRobot = new MathRobot();

        int[] numbers = new int[]{1, 2, 2, 3, 4, 5, 5, 5, 6, 7};
        int[] results = new int[10];
        for(int i = 0; i < numbers.length; i++) results[i] = mathRobot.doubleNumber(numbers[i]);

        Assert.assertEquals(10, mathRobot.timesAskedToDouble);
    }

    @Test
    public void shouldDecorateRobotWithTurboAndExtraBatteries(){
        MathRobot mathRobotProxy = new MathRobotProxy();

        int[] numbers = new int[]{1, 2, 2, 3, 4, 5, 5, 5, 6, 7};
        int[] results = new int[10];
        for(int i = 0; i < numbers.length; i++) results[i] = mathRobotProxy.doubleNumber(numbers[i]);

        Assert.assertEquals(7, mathRobotProxy.timesAskedToDouble);
    }
}
