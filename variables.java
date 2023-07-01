class Vr 
{
int k=20;
int x=25;//instance
static int y=10;
public static void main(String args[])
{
int x=5;
Vr k=new Vr();
Vr a=new Vr();
System.out.println("value of local variable is"+x);//5
System.out.println("value of local variable is"+k.x);//25
System.out.println("variable of instance variable is"+k.k);//20
System.out.println("value of Class variable is"+Vr.y);//10
k.abc();
k.x=30;
a.abc();
}
void abc()
{
Vr z=new Vr();
int x=15;
System.out.println("value of local variable is"+x);//5
System.out.println("value of local variable is"+this.x);//15
System.out.println("value of local variable is"+k);//25
System.out.println("value of local variable is"+Vr.y);//10
System.out.println("value of local variable is"+z.x);//5
}
}