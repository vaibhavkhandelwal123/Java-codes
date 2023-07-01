class Gen<T> {
    T s1, s2;
    
    Gen(T s3, T s4) {
    s1 = s3;
    s2 = s4;
    }
    
    
    T firstArgument() {
    return s1;
    }
    
    T secondArgument() {
    return s2;
    }
    
    // void showType() {
    // System.out.println("Type of T is " + ob.getClass().getName());
    // }
    }
    
    class GenericsWithTwoVariablePassing{
    public static void main(String[] args) {
        
    Gen<String> obj = new Gen<String>("Abhi", "shek");
    // obj.showType();
    String str = obj.firstArgument() + obj.secondArgument();
    System.out.println(str);

    Gen<Integer> obj2 = new Gen<Integer>(5, 8);
    int add = obj2.firstArgument() + obj2.secondArgument();
    System.out.println(add);

    Gen<Double> obj3 = new Gen<Double>(5.0, 8.34);
    System.out.println(obj3.firstArgument() + obj3.secondArgument());
    }
    }