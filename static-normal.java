class staticnormal {
    static {
        System.out.println("static block");
    }
    {
        System.out.println("normal block");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
   }
}