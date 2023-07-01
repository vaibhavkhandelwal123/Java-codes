interface Sayabl{
    public String say();
}
public class lambda1{
    public static void main(String[] args) {
        Sayabl s=()->{
            return "my name is vaibhav";
        };
        System.out.println(s.say());
    }
}