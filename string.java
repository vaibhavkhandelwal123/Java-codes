import java.lang.String;
class StringExample2{
    public static void main(String [] ar){
    String s="Hello Stusdents.";
    String s1="Hello students.";
    
    
    
    System.out.println(s.charAt(3)); //l
    System.out.println(s.startsWith("hello"));//false
    System.out.println(s.endsWith("ents."));//true
    boolean b=s.endsWith("ents.");
    System.out.println(b);//true
    System.out.println(s.equals(s1));//false
    System.out.println(s.equalsIgnoreCase(s1));//false
    System.out.println(s.length());//16
    System.out.println(s1.indexOf('s'));//6
    System.out.println(s1.indexOf('s', 6));//6
    System.out.println(s1.lastIndexOf('s'));//13
    System.out.println(s1.lastIndexOf('s',13));//13
    String ss = "one,two,three four";
    String[] sa = ss.split(",");
    String hh = "one$two.three$four";
    String[] sa1 = hh.split("\\$");
    System.out.println(sa1[0]);
    System.out.println(sa1[1]);
    System.out.println(sa1[2]);
    // System.out.println(sa1[3]);
    String str = "Hello World";
    int length = str.length();
    System.out.println("Length of a String is : " + length);
    
    String s11="Welcome to Java";
    String s2=new String("Welcome to Java");
    String s3="Welcome to Java";
    String s10="welcome to Java";
    String s4=new String("Welcome to Java");
    System.out.println("s11 == s2 is "+ (s11==s2));//refference variable matching
    System.out.println("s11 == s3 is "+ (s11==s3));
    System.out.println("s2 == s3 is "+ (s2==s3));
    System.out.println("s2 == s4 is "+ (s2==s4));
    System.out.println("s3 == s10 is "+ (s3==s10));
    
    String s5=new String("Hello");
    String s6=new String("Welcome");
    String s7="Hello Worlde";
    if(s5.equals(s6)){//content of ref. vaiables matching
    System.out.println("s5 and s6 have the same contents.");
    }
    if(s5.compareTo(s7)<0){
    System.out.println(s5.compareTo(s7));
    }
    
    String s22=String.join("_","hello","world");
    System.out.println(s22);
    String sa11="M2";
    String sa12="Java Join";
    String sa13= String.join("_",sa11,sa12);
    System.out.println(sa13);
    
    String sp="KAMAL";
    char z[]=new char[10];
    z[0]='N';
    z[1]='E';
    z[2]='E';
    z[3]='L';
    sp.getChars(1,3,z,1);
    System.out.println(z);
    
    String sp1="hello KAMAL hello";
    System.out.println(sp1);
    sp1=sp1.replace("hello","bye");
    System.out.println(sp1);
    
    
    String st="have-fun-in-java@blogspot@in";
    String[] t=st.split("-",-2);
    for(String x:t)
    System.out.println(x);
    
    }
    }