package Homrwork6.Task2.interfaces;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String PATH(); // = C:\Users\Njuta\ForProject
}