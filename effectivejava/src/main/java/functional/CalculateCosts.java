package functional;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by CamiloH on 14/03/2016.
 */
public class CalculateCosts {

    public static void main(String[] args) {
        final LocalDateTime beforeCosts= LocalDateTime.now();
        Double cotst= calculateCosts1();
        final LocalDateTime afterCostos= LocalDateTime.now();
        System.out.println("Cost Calculation 1 "+ChronoUnit.MILLIS.between(beforeCosts,afterCostos));

        final LocalDateTime beforeCosts2= LocalDateTime.now();
        Double cotst2=calculateCosts2();
        final LocalDateTime afterCostos2= LocalDateTime.now();
        System.out.println("Cost Calculation 2 "+ChronoUnit.MILLIS.between(beforeCosts2,afterCostos2));


        Double cost3=timedSupplier("Cost Calculation 3 ",()->calculateCosts3());
        Double cost4=timedCustomInterface("Cost Calculation 4 ",()->calculateCosts4());

        Double cost5=timedCustomInterfaceJava6("Cost Calculation 5 ", new Java6() {
            @Override
            public Double get() {
                return calculateCosts5();
            }
        });

        Long cost6= timedCustomInterfaceGeneric("Cost Calculation 6 ",()->calculateCosts6());

        Long cost7= timedCustomInterfaceGenericFull("Cost Calculation 7 ",(t)->System.out.println(),()->calculateCosts6());

        Long cost8= timedCustomInterfaceGenericFull("Cost Calculation 8 ",System.out::println,()->calculateCosts6());

    }


    private static Long calculateCosts6() {
        return 6L;
    }

    private static Double calculateCosts4() {
        return 4D;
    }

    private static Double calculateCosts3() {
        return 3D;
    }

    private static Double calculateCosts2() {
        return 2D;
    }

    private static Double calculateCosts1() {
        return 1D;
    }

    private static Double calculateCosts5() {
        return 5D;
    }


    private static Double timedSupplier(final String s,final Supplier<Double> method) {
        final LocalDateTime beforeCosts2= LocalDateTime.now();
        Double result=method.get();
        final LocalDateTime afterCostos2= LocalDateTime.now();
        System.out.println(s+ChronoUnit.MILLIS.between(beforeCosts2,afterCostos2));
        return result;
    }

    private static Double timedCustomInterface(String s, Test method) {
        final LocalDateTime beforeCosts2= LocalDateTime.now();
        Double result=method.get();
        final LocalDateTime afterCostos2= LocalDateTime.now();
        System.out.println(s+ChronoUnit.MILLIS.between(beforeCosts2,afterCostos2));
        return result;
    }


    private static Double timedCustomInterfaceJava6(String s, Java6 method) {
        final LocalDateTime beforeCosts2= LocalDateTime.now();
        Double result=method.get();
        final LocalDateTime afterCostos2= LocalDateTime.now();
        System.out.println(s+ChronoUnit.MILLIS.between(beforeCosts2,afterCostos2));
        return result;
    }

    private static <T> T timedCustomInterfaceGeneric(String s, Supplier<T> method) {
        final LocalDateTime beforeCosts2= LocalDateTime.now();
        T result=method.get();
        final LocalDateTime afterCostos2= LocalDateTime.now();
        System.out.println(s+ChronoUnit.MILLIS.between(beforeCosts2,afterCostos2));
        return result;
    }

    public static <T> T timedCustomInterfaceGenericFull(String s, Consumer<String> consumer, Supplier<T> method) {
        final LocalDateTime beforeCosts2= LocalDateTime.now();
        T result=method.get();
        final LocalDateTime afterCostos2= LocalDateTime.now();
        consumer.accept(s+ChronoUnit.MILLIS.between(beforeCosts2,afterCostos2));
        return result;
    }


    @FunctionalInterface
    public interface Test{
       Double get();
    }

    public interface Java6{
        Double get();
    }

}
