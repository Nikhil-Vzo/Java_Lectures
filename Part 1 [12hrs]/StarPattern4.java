public class StarPattern4 {
    public static  void main (String []args)
    {
        int z=1;
        for(int i = 1 ; i<=4 ; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=4; i++)
        {
            for (int l=3; l>=i; l--)
            {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }

