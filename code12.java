import java.io.*;
//buffer is used in char transfer not in Byte data transfer so we are not using flush then also working 
class FileReader
{
    public static void main(String[] args) {
        FileInputStream fin;
        FileOutputStream fout;
        try{
            fin= new FileInputStream("testOutp.txt");//byte by byte read
            fout=new FileOutputStream("Sample.txt");// byte by byte write
            int i;
            while((i=fin.read())!=-1)
            fout.write(i);
            //fout.flush();
            //fout.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
    }
}
