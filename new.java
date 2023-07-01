class OuterClass {
    int outer_x=10;
    int outer_y=20;
    private static int outer_private=30;
    class StaticNestedClass
    {
        void display()
        {
            System.out.println("outer_x="+outer_x);
            System.out.println("outer_private="+outer_private);
            System.out.println("outer_y"+outer_y);
        }
    }
}
class StaticNestedClassDemo
{
public static void main(String[] args)
{
    OuterClass ou=new OuterClass();
    OuterClass.StaticNestedClass nestedObject=ou.new StaticNestedClass();
    nestedObject.display();

}
}