package com.example.arrayArrayLists;

import java.util.Random;

public class Arrays {

  public static void main(String[] args) {

    // begin();
    //  analyzeSurveyResults();
    // analyzeSurveyResults2();
    //passingArraysToMethods();
    // multidimensionalArrays();
    //variableLengthArgumentLists();
    //comandLineArguments(args);
    classArrays();
  }

  private static void classArrays() {

  }

  private static void comandLineArguments(String[] args) {
    if (args.length != 3) {
      System.out.printf("Error: Please re-enter the entire command, including%n"
          + "an array size, initial value and increment.%n");
    } else {
      //get array size from first command-line argument
      int arrayLength = args.length;
      int[] array = new int[arrayLength];

      for (int i = 0; i < array.length; i++) {
        array[i] = Integer.parseInt(args[i]) + 1;
      }

      for (int item : array
      ) {
        System.out.println(item);
      }

    }
  }

  /**
   * a type followed by an ellipsis(...) in a method's parameter list indicates that the method
   * receives a variable number of arguments of a particular type. This use of the ellipsis can
   * occur only once in a parameter list, ant the ellipsis, together with its type and the parameter
   * name, must be placed at the end of the parameter list.
   */
  private static void variableLengthArgumentLists(double... numbers) {
    double d1 = 10.0;
    double d2 = 20.0;
    double d3 = 30.0;
    double d4 = 40.0;

    System.out.printf("%n d1 = %.1f%n d2 = %.1f%n d3  = %.1f%n d4 = %.1f%n%n", d1, d2, d3, d4);
    System.out.printf("Average of d1 and d2 is %.1f%n", average(d1, d2));

    System.out.printf("Average of d1, d2 and d3 is %.1f%n", average(d1, d2, d3));

    System.out.printf("Average of d1, d2, d3 and d4 is %.1f%n", average(d1, d2, d3, d4));

  }

  private static double average(double... numbers) {
    double total = 0.0;

    for (double d : numbers) {
      total += d;
    }

    return total / numbers.length;
  }

  private static void multidimensionalArrays() {

    //The initial values are grouped by row in braces.
    int[][] b = {{1, 2}, {3, 4}};
    System.out.println("multidimensional b");
    System.out.printf("%s%8s%n", "Index", "Value");
    System.out.printf("%5d,%d %8d%n", 0, 0, b[0][0]);
    System.out.printf("%5d,%d %8d%n", 0, 1, b[0][1]);
    System.out.printf("%5d,%d %8d%n", 1, 0, b[1][0]);
    System.out.printf("%5d,%d %8d%n", 1, 1, b[1][1]);

    //the lengths of the rows in array b are not required to be the same
    int[][] c = {{1, 2}, {3, 4, 5}};

    System.out.println("multidimensional c");
    System.out.printf("%s%8s%n", "Index", "Value");
    System.out.printf("%5d,%d %8d%n", 0, 0, c[0][0]);
    System.out.printf("%5d,%d %8d%n", 0, 1, c[0][1]);
    System.out.printf("%5d,%d %8d%n", 1, 0, c[1][0]);
    System.out.printf("%5d,%d %8d%n", 1, 1, c[1][1]);
    System.out.printf("%5d,%d %8d%n", 1, 1, c[1][2]);

    int[][] d = new int[3][4];
    // the number of columns is not required
    // Programns can also use variables to specify array dimensions, because new creates arrays ate
    //execution time - not at compile time.
    int[][] e = new int[2][];
    e[0] = new int[5];
    e[1] = new int[3];

    int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
    int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

    System.out.println("Values in array1 by row are:");
    outputArray(array1);

    System.out.println("Values in array2 by row are:");
    outputArray(array2);

    int[][] array3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    System.out.println("Values in array3 by row are:");
    outputArray(array3);

    for (int column = 0; column < array3[2].length; column++) {
      array3[2][column] = 0;
    }
    System.out.println("Values in array3 by row are:");
    outputArray(array3);

  }

  private static void outputArray(int[][] array) {

    for (int row = 0; row < array.length; row++) {
      for (int column = 0; column < array[row].length; column++) {
        System.out.printf("%d ", array[row][column]);
      }
      System.out.println();
    }
  }

  private static void passingArraysToMethods() {

    /**
     * Unlike some other languages, Java does not allow you to choose pass-by-value
     * or pass-by-reference - all arguments are passed by value.
     * A method call can pass two types of values to a method:
     * copies of primitives values and copies of reference to objects.
     *
     */

    String[] names = {"Camila", "Joao"};
    Double[] hourlyTemperatures = new Double[24];
    Double doubleValue = 10.0;

    modifyElement(hourlyTemperatures);// copy of the reference

    System.out.println("Temperature");
    System.out.printf("%s%8s%n", "Index", "Value");
    System.out.printf("%5d %8f%n", 0, hourlyTemperatures[0]);

    //primitive

    int[] numberOfDays = new int[2];
    modifyPrimitiveArray(numberOfDays); //copy of the reference

    System.out.println("Days");
    System.out.printf("%s%8s%n", "Index", "Value");
    System.out.printf("%5d %8d%n", 0, numberOfDays[0]);

    // copy of the reference
    modifyElement(hourlyTemperatures[0]);// copy of the reference
    System.out.println("Temperature2");
    System.out.printf("%s%8s%n", "Index", "Value");
    System.out.printf("%5d %8f%n", 0, hourlyTemperatures[0]);

    modifyElementName(names[0]);// copy of the reference
    System.out.println("Name");
    System.out.printf("%s%8s%n", "Index", "Value");
    System.out.printf("%5d %8s%n", 0, names[0]);

    modifyDoubleValue(doubleValue);// copy of the reference
    System.out.println("SchoolName");
    System.out.printf("%s%8s%n", "Index", "Value");
    System.out.printf("%5d %8s%n", 0, doubleValue);


  }

  private static void modifyDoubleValue(Double doubleValue) {
    doubleValue = 1.2;
  }

  private static void modifyElementName(String name) {
    name = "Aritana";
  }

  private static void modifyPrimitiveArray(int[] numberOfDays) {
    numberOfDays[0] = 15;
  }

  private static void modifyElement(Double[] hourlyTemperatures) {
    //refers to the same array decalared in the caller method
    hourlyTemperatures[0] = 5.5;

  }


  private static void modifyElement(Double hourlyTemperature) {
    hourlyTemperature = 9.0;

  }

  private static void analyzeSurveyResults2() {

    //Twenty students were asked to rate on a scale of 1 to 5 the quality of the food
    //in the cafeteria, with 1 being 'awful' and 5 being 'excelent'.
    //Place the 20 responses in an integer array and determine the frequency of each rating

    int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
    int[] frequency = new int[5];

    int rate = Integer.BYTES;
    for (int counter = 0; counter < responses.length; counter++) {
      try {
        rate = responses[counter];
        ++frequency[rate - 1];
      } catch (ArrayIndexOutOfBoundsException e) {

        System.out.println(e);
        System.out.printf("   responses[%d] = %d%n%n", counter, responses[counter]);

      }
    }

    System.out.println("Survey");
    System.out.printf("%s%8s%n", "Index", "Value");
    for (int counter = 0; counter < frequency.length; counter++) {
      System.out.printf("%5d%8d%n", counter, frequency[counter]);
    }

  }

  private static void analyzeSurveyResults() {

    //Twenty students were asked to rate on a scale of 1 to 5 the quality of the food
    //in the cafeteria, with 1 being 'awful' and 5 being 'excelent'.
    //Place the 20 responses in an integer array and determine the frequency of each rating

    int[] students = new int[20];
    int[] frequency = new int[5];
    Random random = new Random();

    for (int counter = 0; counter < students.length; counter++) {
      students[counter] = random.nextInt(5) + 1;
    }

    System.out.println("Survey");
    System.out.printf("%s%8s%n", "Index", "Value");

    int rate = Integer.BYTES;
    for (int counter = 0; counter < students.length; counter++) {
      rate = students[counter];
      ++frequency[rate - 1];
    }

    for (int counter = 0; counter < frequency.length; counter++) {
      System.out.printf("%5d%8d%n", counter, frequency[counter]);
    }

  }

  private static void begin() {
    int[] c = new int[12]; // its elements receive a default zero
    boolean[] d = new boolean[2];// its elements receive a default false
    String[] e = new String[2];// its elements receive a default null

    //create several arrays in a single declarations
    String[] f = new String[100], g = new String[21];

    // when one variable is declared, the square bracket can be placed either after the type
    //or after the array variable name
    String h[] = new String[100];

    //

    c[0] = 5;
    d[0] = true;
    e[0] = "hi";

    System.out.println(c[0]);
    System.out.println(d[1]);
    System.out.println(e[0]);

    //Using an Array Initializer
    //The array lenght is determined by the number of elements in the initializer list

    int[] n = {10, 20, 30, 10};

    //Calculating the values to store in an Array
    final int ARRAY_LENGTH = 10;
    int[] array = new int[ARRAY_LENGTH];

    //odd number
    for (int i = 0; i < array.length; i++) {
      array[i] = (i * 2) + 1;
    }

    System.out.println("Odd numbers");
    System.out.printf("%s%8s%n", "Index", "Value");

    for (int counter = 0; counter < array.length; counter++) {
      System.out.printf("%5d%8d%n", counter, array[counter]);
    }

    //even number
    for (int i = 0; i < array.length; i++) {
      array[i] = (i * 2) + 2;
    }

    System.out.println("Even numbers");
    System.out.printf("%s%8s%n", "Index", "Value");

    for (int counter = 0; counter < array.length; counter++) {
      System.out.printf("%5d%8d%n", counter, array[counter]);
    }

    for (int i = 0; i < array.length; i++) {
      ++array[i];
    }
    System.out.println("Numbers + 1");
    System.out.printf("%s%8s%n", "Index", "Value");
    for (int counter = 0; counter < array.length; counter++) {
      System.out.printf("%5d%8d%n", counter, array[counter]);
    }
  }

}
