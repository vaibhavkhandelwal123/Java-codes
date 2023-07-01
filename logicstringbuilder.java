import java.lang.String;

class logicstringbuilder {
    void StringBuilderMethods()
    {
        StringBuilder sb = new StringBuilder("Hello my students");
        sb.append("xyz");
        System.out.println(sb.length());
        sb.setLength(30);
        System.out.println(sb.length());
        System.out.println(sb);
        sb.setCharAt(2,'w');
        System.out.println("setCharAt:"+sb);
        sb.reverse();
        System.out.println("reverse:" + sb);
        sb.reverse();
        sb.insert(2, 'y');
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt:" + sb);
        sb.delete(5, 10);
        System.out.println("delete" + sb);
        System.out.println(sb.substring(5));
        System.out.println(sb);
        System.out.println(sb.substring(5, 7));
        StringBuilder b1 = new StringBuilder("Hello");
        StringBuilder b2 = new StringBuilder("Hello");
        System.out.println("b1 is equals b2=" + b1.equals(b2));
        System.out.println("b1 is equals b2 toString()=" + b1.toString().equals(b2.toString()));
    }
        public static void main(String[] args){
            logicstringbuilder b1=new logicstringbuilder();
            b1.StringBuilderMethods();
        } 
    }

