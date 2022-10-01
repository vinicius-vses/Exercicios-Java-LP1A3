import java.util.Scanner;

import static java.lang.System.out;

public class DivideByZeroVector
{
    public static void main(String args[])
    {
        int [] list=new int[4];
        int x=10;
        Scanner scanner = new Scanner( System.in ); // scanner para entrada
        out.print( "Enter an integer denominator: " );
        int y = scanner.nextInt();
        int result = x/y;
        list [result]=result;
    } // fim de main
} // fim da classe