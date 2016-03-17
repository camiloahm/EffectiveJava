package functional;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

/**
 * Created by CamiloH on 14/03/2016.
 */
public class CalculateCostsTest {


    @Test
    public void testTimedCustomInterfaceGenericFull() throws Exception {
        final String description="Calculate";
        AtomicReference<String> atomicReference=new AtomicReference<>("");
        CalculateCosts.timedCustomInterfaceGenericFull(description,atomicReference::set,()->"method");
        assertTrue(atomicReference.get().contains(description));
    }
}