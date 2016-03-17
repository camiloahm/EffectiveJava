package functional;

/**
 * Created by CamiloH on 14/03/2016.
 */
@FunctionalInterface
public interface FunctionOverTime {
    double valueAt(int time);

    static FunctionOverTime line(final double i){
        return time -> i;
    }
}
