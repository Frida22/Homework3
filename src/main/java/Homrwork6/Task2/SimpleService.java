package Homrwork6.Task2;
@Task1Training.Service(name = "SuperSimpleAnna")
public class SimpleService {
    @Task1Training.Init
    public void initService() {
        System.out.println("initService");
    }
    public void forFun(){
        System.out.println("Fun");
    }
}