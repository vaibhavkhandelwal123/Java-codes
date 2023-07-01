class parent{ // Dynamic Method Dispatch or runtime Polymorphism or Upcasting in java
    int a = 30;

   void show() {
        System.out.println("parent show()");
    }
}

class Child extends parent {
    int a = 40;

   void show() {
        System.out.println("child show()");

    }
    public static void main(String[] args)
    {
        parent p1=new parent();
        p1.show();
        System.out.println(p1.a);
        Child obj2=new Child();
        //parent obj2 =new Child();
        obj2.show();
        System.out.println(obj2.a);
    }
}
/* if parent will commented then error
     if child will commented then both output  parent show . a where a= 30
     if parent obj2 = new child() then output parent show() & child show() . a=30
     if child obj2= new child() then output parent show (). a =30  & child show () .a= 40
*/
/*super method can't be used in a static method */