package staticfactorymethod;

/**
 * Created by CamiloH on 13/03/2016.
 */
public class RandomGenerators {

    //block instance
    private RandomGenerators() {}

    public static final RandomGenerator<Integer> getIntGenerator() {
        return new RandomIntGenerator(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static final RandomGenerator<String> getStringGenerator() {
        return new RandomStringGenerator("");
    }

}


