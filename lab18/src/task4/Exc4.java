package task4;

import java.util.Scanner;

public class Exc4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i;
        try{
            i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException e ) {
            System.err.println("i is not an int type");
        } catch ( ArithmeticException e ) {
            System.err.println("Attempted division by zero");
        } finally {
            System.out.println("Введённая строка не является целым числом или равна 0");
        }
    }
}
