interface Sayab{ 
    public String say(String name); 
} 
public class lambdaexp { 
    public static void main(String[] args) { 
        //lambda expressiong with single parameter 
        Sayab s1 =(name)->{ 
            return "Hello, " + name; 
        }; 
        System.out.println(s1.say("Sonoo")); 
 
        Sayab s2 = name-> { 
            return "Hello, "+ name; 
        }; 
        System.out.println(s2.say("Sonoo")); 
    } 
}