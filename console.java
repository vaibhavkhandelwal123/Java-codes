import java.util.*;
import java.io.*;
class console {
    public static void main(String...aa) throws IOException {
        File obj1=new File("abcd1.txt");
        Scanner sc =new Scanner(obj1);
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("Enter your name");
        while(sc.hasNext())
        {
            pw.println(sc.next());
            //System.out.println(sc1.next());
        }
        pw.close();
        sc.close();
}
}
