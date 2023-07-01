class Shift{
public static void main(String[] args)
{
System.out.println(34<<2);
System.out.println(34>>3);

System.out.println(-34>>3);
System.out.println(-34>>>3);
System.out.println("Integer to binaray"+Integer.toBinaryString(-34>>>3));
System.out.println("Integer to binaray"+Integer.toBinaryString(-34>>3));
}
}