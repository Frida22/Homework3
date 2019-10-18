package Homrwork6.Task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Task1 {
    public static void main(String[] args) {
        forTestMethod();

    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Test {
        int a() default 3;
        int b() default 5;
    }

    @Test
    public static void forTestMethod() {
        System.out.println("gyo");
    }

}