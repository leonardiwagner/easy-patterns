package easypatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class MathRobotProxy extends MathRobot {
    private Map<Integer, Integer> doubles = new HashMap<Integer, Integer>();

    @Override
    public int doubleNumber(int number) {
        Integer cachedResult = doubles.get(number);
        if(cachedResult != null){
            return  cachedResult;
        } else {
            int result = super.doubleNumber(number);
            doubles.put(number, result);
            return result;
        }
    }
}
