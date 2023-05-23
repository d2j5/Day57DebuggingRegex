package debugging;

public class DebuggingExample {

//calculates average method
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

//Index Out of Bonus Exception
/* The condition 'i <= numbers.length' allows 'i' to take the value of 'numbers.length',
 * which is one index beyond the last valid index.
 * To fix it, it was necessary to set a breakpoint at line 20, where the array index out of bounds exception occurs.
 * I ran the code in debug mode, inspected the variables, and stepped through the code.
 * Changed the condition back to 'i < numbers.length'. */
    public static double calculateAverage2(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) { //wrong line: i <= numbers.length
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

//Logic error
/* I removed the cast to double when returning the average.
 * This will cause integer division, resulting in incorrect output.
 * For debugging, I set a breakpoint at the line where the code was removed.
 * It showed that the division was performing an integer division instead of the
 * floating-point division. It was fixed by adding the '(double)' cast again. */
public static double calculateAverage3(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return (double) sum / numbers.length; // Remove the cast to double
}

public static void main(String[] args) {
//@Test calculate average
 int[] array = {1, 2, 3, 4, 5};
      double average = calculateAverage(array);
    System.out.println("The average is: " + average);


//Index Out of Bonus Exception test
    double average2 = calculateAverage2(array);
    System.out.println("The average is: " + average2);

//debugging logic error

    double average3 = calculateAverage3(array);
    System.out.println("The average is: " + average3);

//@introducing a Null Pointer exception
    //Set array = 'null' as it does not refer to an array object, it produces a null pointer exception.
    /*
    For debugging, I set a breakpoint at line 41, ran the code in debug, and inspected the variables.
    In this example, it is necessary to initialize the array variable with the appropriate values: {1, 2, 3, 4, 5}.*/
//  int[] array = null;
//        double average = calculateAverage(array);//
//        System.out.println("The average is: "+ average);

    }


}



