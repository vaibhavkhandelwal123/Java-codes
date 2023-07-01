import java.util.*;
import java.lang.*;
enum Mobile
{
   Samsung(400),Nokia(250),Motorola(325);
   int price;
   Mobile(int p)
   {
      price = p;
   }
   int showPrice(){
      return price;
   }
}
class EnumDemo1{
   public static void main(String[] args)
   {
      System.out.println("CellPhone list:");
      for(Mobile m:Mobile.values())
      {
         String name=m.name();
         int ordinal=m.ordinal();
         System.out.println(m+"  costs "+m.showPrice()+" dollars"+" "+name+" "+ordinal);
      }
      Mobile ret;
      ret =Mobile.valueOf("Samsung");//convert string into enum object
      System.out.println("Selected: "+ret);
   }
}