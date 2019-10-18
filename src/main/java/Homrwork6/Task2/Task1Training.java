package Homrwork6.Task2;

import java.lang.annotation.*;

public class Task1Training {
    @Documented
    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Service{
        String name();
        boolean lazyLoad() default false;
    }
    @Inherited
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Init{
        boolean suppressException() default false;
    }
}
