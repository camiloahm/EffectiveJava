package functional;

import java.util.function.Consumer;
import static java.lang.System.out;

class JavaResource {

    private JavaResource() {out.println("created...");}

    public void operation1() {out.println("operation 1");}
    public void operation2() {out.println("operation 2");}
    private void close() { out.println("cleanup");}

    public static void use(Consumer<JavaResource> block) {
        JavaResource resource = new JavaResource();
        try {
            block.accept(resource);
        } finally {
            resource.close();
        }
    }
}

public class ExecuteMethodAroundPattern {
    public static void main(String... args) {
        JavaResource.use(resource -> {
            resource.operation1();
            resource.operation2();
        });
    }
}
