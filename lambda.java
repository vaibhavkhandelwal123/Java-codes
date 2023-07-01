interface Draw{ 
    public void draw(); 
} 
public class lambda{ 
    public static void main(String[] args) { 
        int width = 10; 
         
        //with lambda 
        Draw d2=()->{ 
            System.out.println("Drawing "+width); 
        }; 
        d2.draw(); 
    } 
}