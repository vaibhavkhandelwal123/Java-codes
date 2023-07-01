// package MyClass.file handling;
import java.io.*;

class FileAllMethod {
    public static void main(String[] args)throws Exception {
        File f = new File("abc.txt"); // for parent :\\LPU\\abc.txt
        //f.createNewFile();
        System.out.println("========================================================");
        System.out.println("List of various methods work with File: \n\n");
        System.out.println("File name :"+f.getName());

        System.out.println("path :"+f.getPath());
        System.out.println("lastModified :"+ new java.util.Date(f.lastModified()));
        System.out.println("Absolute path: "+f.getAbsolutePath());
        // System.out.println("Canonical Path: "+f.getCanonicalPath());

        System.out.println("Parent: "+f.getParent());
        System.out.println("Exits :"+f.exists());
        if(f.exists())
        {
            System.out.println("Is writeable: "+f.canWrite());
            System.out.println("Is readable: "+f.canRead());
            System.out.println("Is a directory: "+f.isDirectory());
            System.out.println("Is a File: "+f.isFile());
            System.out.println("File size in bytes "+f.length());

        }


    }
    
}