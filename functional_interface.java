@java.lang.FunctionalInterface
interface sayable{
void say(String msg);
}
public class functional_interface implements sayable {
public void say(String msg){
System.out.println(msg);
}
public static void main(String[] args) {
functional_interface fie = new functional_interface();
fie.say("Hello there");
}
}