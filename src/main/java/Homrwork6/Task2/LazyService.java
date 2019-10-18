package Homrwork6.Task2;
@Task1Training.Service(name = "LazyAnna")
public class LazyService {
    @Task1Training.Init
    void lazyInit() throws Exception {
        System.out.println("lazyInit");
    }
}