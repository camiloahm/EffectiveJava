package staticfactorymethod;

/**
 * Created by CamiloH on 13/03/2016.
 */
class RandomIntGenerator implements RandomGenerator<Integer> {
    private final int min;
    private final int max;

    RandomIntGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Integer next() {return null;}
}