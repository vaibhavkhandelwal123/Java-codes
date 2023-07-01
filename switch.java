import java.util.*;
class SwitchExample {  
    public static void main(String[] args) {  
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
    
        switch(num){  
        default:System.out.println("Not in 10, 20 or 30"); 
        break;
        case 10: System.out.println("10");  
        break;  
        case 20: System.out.println("20");  
        break;  
        case 30: System.out.println("30");  
        break;   
         
        }  
    }  
    }  