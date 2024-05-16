package utils;


public abstract class Fibonacci {
    // I changed to abstract because I won't instance this class

    public static int recursiveFibonacci(int num) {
        // I use static because the class is abstract, so I need use this function without instace

        if (num <= 0) return 0;
        if (num == 1) return 1;
        if (num == 2) return 1;
        return recursiveFibonacci(num - 2) + recursiveFibonacci(num - 1);

            /* That's a Recursive Fibonacci Calc. I need define the first and second indices as 0 and 1, and
       validate if the indice isn't 0 or lower.
       Then, I use recursive to sum the first and second Fibonacci numbers before, calling the same function.
        */
    }

    public static int linearFibonacci(int num) {
        // I use static because the class is abstract, so I need use this function without instace

        if (num <= 0) {
            return 0;
        } else if(num == 1) {
            return 1;
        } else {

            int fibonacci = 0; // Fibonacci Value
            int tmp = 1; // Previou Fibonacci
            int tmp2 = 1; // Second previos Fibonacci

            for(int i = 2; i < num; i++) {
                fibonacci = tmp + tmp2;
                tmp = tmp2;
                tmp2 = fibonacci;

                /* I did a FOR setting Fibonacci value as the 2 temporary variables sum, then I changed the
                // temporary variables. */

            }
            return fibonacci;
        }
    }

}
