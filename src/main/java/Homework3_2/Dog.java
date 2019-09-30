package Homework3_2;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            System.out.println("Enter name!");
            //todo перевірити чи не ввели пусту строку
        }else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }else {
            System.out.println("Enter age!");
        }
    }
}