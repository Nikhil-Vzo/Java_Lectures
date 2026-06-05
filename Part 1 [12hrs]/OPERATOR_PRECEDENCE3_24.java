 class Test2
 {
    public static void main(String[] args)
    {
        int x = 2, y = 3, z = 4;

        int result = x++ * --y + z-- / (x + y) * (y++ - z) + (++z % x);
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        System.out.println("result = " + result);





    }
}


