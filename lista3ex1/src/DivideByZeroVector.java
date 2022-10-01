import java.util.InputMismatchException;
import java.util.Scanner;
public class DivideByZeroVector
{
    public static void main(String args[]){

    int [] list=new int[4];
    int x=10;

    boolean continueLoop = true;
    do {
        try {
            Scanner scanner = new Scanner(System.in); // scanner para entrada
            System.out.print("Enter an integer denominator: ");
            int y = scanner.nextInt();
            int result = x / y;
            list[result] = result;
            continueLoop = false;

        } catch (ArithmeticException e) {
            System.out.println("Erro ao inserir 0!");
        } catch (InputMismatchException e) {
            System.out.println("Informe somente dados inteiros!!");
        }
    }while (continueLoop);

    } // fim de main
} // fim da classe