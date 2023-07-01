class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T : " + ob.getClass().getName());
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return name + " " + age;
    }
}

public class apr14 {
    public static void main(String args[]) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getob();
        System.out.println("Value of integer generics: " + v);
        Gen<String> strOb = new Gen<String>("Generics Test");
        strOb.showType();
        String str = strOb.getob();
        System.out.println("Value of string generics: " + str);
        Gen<Student> stOb = new Gen<Student>(new Student("khushi", 20));
        stOb.showType();
        System.out.println("value: " + stOb.getob());

    }
}