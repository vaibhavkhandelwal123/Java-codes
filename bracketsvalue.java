class ArrayTypes
{
public static void main(String[] args)
{
int[] a,b;
a = new int[1];
b = new int[1];
System.out.println(a.getClass().getName());
System.out.println(b.getClass().getName());
int[] c[],d;
c = new int[1][1];
d = new int[1];
System.out.println(c.getClass().getName());
System.out.println(d.getClass().getName());
int[] e[],f[];
e = new int[1][1];
f = new int[1][1];
System.out.println(e.getClass().getName());
System.out.println(f.getClass().getName());
int[] []g,h;
g = new int[1][1];
h = new int[1][1];
System.out.println(g.getClass().getName());
System.out.println(h.getClass().getName());
//int[] []i,[]j; // error
int[] []k,l[],m[];
k = new int[1][1];
l = new int[1][1][1];
m = new int[1][1][1];
System.out.println(k.getClass().getName());
System.out.println(l.getClass().getName());
System.out.println(m.getClass().getName());
}
}