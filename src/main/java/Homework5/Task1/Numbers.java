package Homework5.Task1;

public class Numbers {


    public void numberRelativeToZero(int number)throws NumberIsZeroException{
        if(number < 0 ){
            System.out.println("Number<0");
        }
        if (number > 0){
            System.out.println("Number>0");
        }else {
            throw new NumberIsZeroException();
        }
    }
}
