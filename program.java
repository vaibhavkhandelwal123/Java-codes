import java.io.*;
class Program{
    public static void main(String[] args) {
        try{
            Reader rdr=new FileReader("abc1.txt");
            int data = rdr.read();
            while(data != -1)
            {
                System.out.println((char)data);
                data=rdr.read();
            }
            rdr.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
    }
}
