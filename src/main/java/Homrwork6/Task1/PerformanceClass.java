package Homrwork6.Task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PerformanceClass {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Class<?> clsInfo = ForMethodWithAnnotation.class;
        Method method = clsInfo.getMethod("methodExampleForAnnotation", int.class, int.class);
        AnnotationTest.Test test = method.getAnnotation(AnnotationTest.Test.class);
        method.invoke(clsInfo.newInstance(), test.a(),test.b());

        }
    }
