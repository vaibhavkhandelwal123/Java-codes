/*integer primitive datatype to double rpimitive datatype -automatic conversion
integer primitive datatype to integer object-automatic 
integer primitive datatype to integer object
integer object to integer primitive datatype
double primitive datatype to integer primitive datatype-need typecasting
string object into the integer primitive datatype ex.: int.parseInt
any object to double primitive datatype (object:int,double,float... except string)
p extends number called the **bounded type */
interface a<T>
{
    T max(T z);
}
class P88InterfaceGenerics<T> implements a<T>
{
    public T max(T z)
    {
        return z;
    }
    public static void main(String[] args) {
        P88InterfaceGenerics<Integer> obj =new P88InterfaceGenerics<Integer>();
        int abc=obj.max(33);
        System.out.println(abc);
    }
}
