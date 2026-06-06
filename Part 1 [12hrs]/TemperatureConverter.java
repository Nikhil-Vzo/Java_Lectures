import java.util.*;
class TemperatureConverter
{
    public static void main(String[] args)
        {
            Scanner nikhil=new Scanner(System.in);
            System.out.println("enter temperature in fahrenheit");
            float f=nikhil.nextFloat();
            System.out.println("the temperature in celsius is\t"+(f-32)*5/9);
            nikhil.close();
        }
    }
