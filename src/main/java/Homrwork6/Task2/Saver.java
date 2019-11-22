package Homrwork6.Task2;

import Homrwork6.Task2.interfaces.Save;
import Homrwork6.Task2.interfaces.SaveTo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Saver {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        TestContainer testContainer = new TestContainer();
        Class<?> testContainerClass = testContainer.getClass();

        if (!testContainerClass.isAnnotationPresent(SaveTo.class)) {
            System.out.println("Class is not annotated");
        } else {
            Method[] methods = testContainerClass.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Save.class)) {
                    SaveTo saveTo = testContainerClass.getAnnotation(SaveTo.class);
                    method.invoke(testContainer, testContainer.text, saveTo.PATH());
                }
            }
        }
    }
}
