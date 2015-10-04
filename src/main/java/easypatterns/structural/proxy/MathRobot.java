package easypatterns.structural.proxy;

public class MathRobot {
    public int timesAskedToDouble = 0;

    public int doubleNumber(int number) {
        timesAskedToDouble++;
        return number * 2;
    }
}
