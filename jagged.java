import java.util.*;
class array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int aa[][] = new int[row][];
        for(int i=0; i<row;i++)
        {
           int col=sc.nextInt();
           aa[i]=new int[col];
        }
        for(int i=0; i<row;i++)
        {
            for(int j=0;j<aa[i].length;j++)
            {
                int val=sc.nextInt();
                aa[i][j]=val;
            }
        }
        for(int i=0; i<row;i++)
        {
            for(int j=0; j<aa[i].length;j++)
            {
                System.out.println(" " + aa[i][j] +" ");
            }      
        }

    }
}