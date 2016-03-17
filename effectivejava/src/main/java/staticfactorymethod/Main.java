package staticfactorymethod;

/**
 * Created by CamiloH on 13/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        RandomGenerator randomGenerator=RandomGenerators.getIntGenerator();
        randomGenerator.next();
    }
}
