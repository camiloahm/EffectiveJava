package noninstantiableutiliyclass;

/**
 * Created by CamiloH on 13/03/2016.
 */
public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
        // Remainder omitted
    }
}