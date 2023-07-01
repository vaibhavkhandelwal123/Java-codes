enum MyEnum{
    c1{
        public int getValue() {
            return 100;
        }
    },
    c2{
        public int getValue() {
            return 10;
    }
    },
    c3{
        public int getValue() {
            return 0;
    }
    };
    public abstract int getValue();
}
class EnumAbstractMethod {
    public static void main(String[] args) {
        for (MyEnum s:MyEnum.values()){
            String name = s.name();
            int ordinal=s.ordinal();
            int days=s.getValue();
            System.out.println("name: " + name + " ordinal: " + ordinal + ", days=" + days);
        }
    }
}