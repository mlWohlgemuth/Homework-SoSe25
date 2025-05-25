package Blatt05.Task3;

public class Calculator {
    public static double divide(double a, double b) throws zeroException{
        if(b==0) throw new zeroException("kannst nich durch 0 teilen");
        return a/b;
    }
    //...

}
