/*
Object -> Throwable:
          * Error: ThreadDeath / IOError / OutOfMemory
            Errors can not be handled
          * Exceptions: RuntimeException (Unchecked Exceptions) - SQLException (Checked Exception)
 */

import com.sun.security.jgss.GSSUtil;

// Custom exception
class RaedException extends Exception {
    public RaedException(String string) {
        super(string);
    }
}

// This class can throw an ClassNotFoundException
class A {
    void show() {
        try {
            Class.forName("myClass");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] a) {

        A obj = new A();
        obj.show();

        /* Cascaded Exceptions */
        // Arithmetic Exception
        int i = 1;
        int j = 0;

        // Index out of bounds exception
        int[] array = new int[5];

        try {
            j = 10/i;
            System.out.println(array[1]);
            System.out.println(array[4]);
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound");
        }
        catch(Exception e) {
            System.out.println(e);
        }

        /* Throwable */
        // Throw ArithmeticException
        int x = 20;
        int y = 1;

        try {
            y = 18/2;
            if(y == 0)
                throw new ArithmeticException(y + " was divided by a number > " + y);
            if(y == 1)
                throw new RaedException(y + " was divided by itself");
        }
        catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("J: " + j + "\n" + e);
        }
        catch (RaedException e) {
            System.out.println(e);
        }

    }
}
