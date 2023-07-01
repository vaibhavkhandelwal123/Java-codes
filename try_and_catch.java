class TestFinallyBlock{
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        try{
            int data=a/b;
            System.out.println(data);
        }
        catch(NullPointerException e){
            System.out.println("I am handling the exception"+e);
        }
        catch(ArithmeticException e){
            System.out.println("I am handling the Arithmetic"+e);
        }
        catch(Exception e){
            System.out.println("I am handling the exception"+e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
