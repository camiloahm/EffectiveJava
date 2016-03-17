package functional;

/**
 * Created by CamiloH on 14/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        final FunctionOverTime sales= time -> 2+time;

        final FunctionOverTime end=time ->sales.valueAt(time)+10;

        System.out.println(end.valueAt(10));
    }
}
