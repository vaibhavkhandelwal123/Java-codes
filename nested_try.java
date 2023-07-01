import java.util.*;
class  Nested_try {
    public static void main(String[] args) {
        try{
        int a=Integer.parseInt(args[0]);
        try{
            int b=Integer.parseInt(args[1]);
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Div by Zero");
        }
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Need two parameter!");
    }
    System.out.println("remaining program");
}
}

