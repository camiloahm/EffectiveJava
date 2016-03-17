package staticfactorymethod;

/**
 * Created by CamiloH on 13/03/2016.
 */
class RandomStringGenerator implements RandomGenerator<String> {
    private final String prefix;

    RandomStringGenerator(String prefix) {
        this.prefix = prefix;
    }

    public String next() {
        return null;
    }
}