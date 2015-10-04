package easypatterns.creational.factory;

/**
 * Created by wagner on 10/3/15.
 */
public class RobotFactory {
    public Robot create(RobotType robotType){
        switch (robotType){
            case SPEEDSTER:
                return new Robot("speedster robot", 100, 80, 20);
            case EXPLORER:
                return new Robot("explorer robot", 50, 100, 50);
            case FIGHTER:
                return new Robot("fighter robot", 20, 80, 100);
            default:
                return new Robot("robot", 50, 50, 50);
        }
    }
}
