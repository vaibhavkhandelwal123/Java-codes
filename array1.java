class Demo_Array
{
    public static void main(String[] args)
    {
        int marks[];
        marks =new int[3];
        marks[0] =10;
        marks[1] =35;
        marks[2] =84;
        System.out.println("Marks of 2nd student: " + marks[1]);
        System.out.println(marks.getClass().getName());
        int aa[][]=new int[3][5];
        System.out.println(aa.getClass().getName());
    }
}