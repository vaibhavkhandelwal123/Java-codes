interface it 
{
void show();
}
abstract class c1
{
abstract void show1();
void display()
{
}
}
class c2
{
}
class c3
{
void display()
{
System.out.println("Display method");
}
}
class AllAnonymousDemo 
{
public static void main(String...aa)
{
it obj= new it()//not create the object of it it is basically inherited from it()
{
public void show()
{
System.out.println(" interface Show thro anonymous");
}
//void display(){} // error
};
obj.show();

c1 obj1= new c1()// not create the object of C1 it is basically inherited from C1()
{
public void show1()
{
System.out.println("Abstract Show1 thro abstract");
}
public void display()
{
System.out.println("display of abstract class");
}
/*void  display1()
{
System.out.println("display1 new method");
}*/
};
//.display1();// error:incompatible types: void cannot be converted to c1
obj1.show1();
obj1.display();
//obj1.display1(); error
new c2()
{
void show2()
{
System.out.println("Show2 independent method thro class C2");
}
}.show2();
new AllAnonymousDemo()
{
void show2()
{
System.out.println("Show2 independent method Class AllAnonymousDemo");
}
}.show2();
c3 obj3= new c3()//  create the reference of C3,new:craete anonymous class,C3(): inherited from C3
{
void display()
{
System.out.println("display overriding thro anonymous");
}}
;
obj3.display();
}
}