    // Three types of interfaces:
    // Normal - Functional / SAM - Marker

    /* Functional interfaces have only one method */
    @FunctionalInterface
    interface Interface {
        void show(int i);
    }

    @FunctionalInterface
    interface add {
        int add(int i, int j);
    }

    public class InterfaceTypes {
        public static void main(String [] a) {

            // no need for () when the function takes just one variable
            Interface obj = i -> System.out.println("I: " + i);
            obj.show(20);


            // no need to mention return
            add obj2 = (i, j) -> i + j;
            System.out.println("Sum: " + obj2.add(10, 20));

        }
    }
