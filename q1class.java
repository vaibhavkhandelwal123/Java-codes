class Parent{
    Parent(){
        System.out.println("Parent Constructor ");
    }
}
class child extends Parent{

    public void show() {
    }

}
class child2 extends child{
    child2(){
        System.out.println("Child 12 Constructor");
    }
}
class class_inhertance {
    public static void main(String[] args) {
        child2 c1 = new child2();
}
}