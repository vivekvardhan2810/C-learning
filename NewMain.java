//Java Practice ( The below Content Written in Comment taken from W3 Schools For reference)//
/* From This File I Will learn about Conditions and Statements, Such as if, else, else if, Switch, Loops, Break and Arrays*/
class NewMain {
   public static void main(String args[]) {
      /*Java Conditions and If Statements , Java supports the usual logical conditions from mathematics*/
      /* Less than or equal to: a <= b
       Greater than: a > b
       Greater than or equal to: a >= b
       Equal to a == b
       Not Equal to: a != b*/
/* Java has the following conditional statements:
   Use if to specify a block of code to be executed, if a specified condition is true.
   Use else to specify a block of code to be executed, if the same condition is false.
   Use else if to specify a new condition to test, if the first condition is false.
   Use switch to specify many alternative blocks of code to be executed.*/

  // The if Statement//
 // The Below Shown are the various types how We use if statement//
      if(20 > 18){
        System.out.println("20 is greater than 18");
      }
    
      int x = 20;
      int y = 15;
      if (x > y) {
         System.out.println("x is greater than y");
      }

      //Else Statement//
      /* Syntax
         if (condition) {
             // block of code to be executed if the condition is true
          } 
  else {
      // block of code to be executed if the condition is false
  } */

    int x = 20;
    if (x <=14) {
      System.out.println("Good Morning");
     } 
    else {
       System.out.println("Good Night");
     } 

    //Else if Statement//
    int time = 22;
    if (time < 10) {
      System.out.println("Good Morning");
    }
    else if (time < 18) {
      System.out.println("Good Day.");
    }
    else {
      System.out.println("Good Evening.");
    }

  /* Java Switch 
    The switch expression is evaluated once.
    The value of the expression is compared with the values of each case.
    If there is a match, the associated block of code is executed.
    The break and default keywords are optional, and will be described later in this chapter*/

    //Examples//
    int day = 5;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("tuesday");
        break;
      case 3:
        System.out.println("Wedneday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
      //default in switch//
      //The default keyword specifies some code to run if there is no case match//
      int day = 4;
    switch (day) {
      case 6:
      System.out.println("Today Is Saturday");
      break;
      case 7:
       System.out.println("Today is Sunday");
       break;
      default:
        System.out.println("i don't Know");
    }
      //Java While loop//
     /* Loops can execute a block of code as long as a specified condition is reached
     Loops are handy because they save time, reduce errors, and they make code more readable*/
   
    //Examples//
   // In the example below, the code in the loop will run, over and over again, as long as a variable (i) is less than 5//
    int i = 5;
    while (i < 5) {
      System.out.println(i);
      i++;
       
   //Do while loop//
       int i = 0;
        do {
            System.out.println(i);
            i++;
        } 
        while (i < 6);

  //For Loop//
  /* Syntax :
  for (statement 1; statement 2; statement 3) {
   code block to be executed

    } */
/* Statement 1 Statement 1 is executed (one time) before the execution of the code block
  Statement 2 defines the condition for executing the code block
  Statement 3 is executed (every time) after the code block has been executed*/

  //Examples//
 //The example below will print the numbers 0 to 4//
   for (int i = 0; i < 5; i++) {
        System.out.println(i);
      }
  /*The Above Example explained 
    Statement 1 sets a variable before the loop starts (int i = 0).

    Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true, the loop will start over again, if it is false, the loop will end.

    Statement 3 increases a value (i++) each time the code block in the loop has been executed.*/

  //2nd Example//
 //This example will only print even values between 0 and 10//
   for (int i = 0; i<=10; i=i+2) {
          System.out.println(i);
        }

  //Nested loops//
 /* It is also possible to place a loop inside another loop. This is called a nested loop.

The "inner loop" will be executed one time for each iteration of the "outer loop"*/

 //Outer loop//
      for (int i = 1; i<=2; i++) {
        System.out.println("Outer: " + i);
      }
    //Inner loop//
      for (int j = 1; j<=3; j++) {
        System.out.println("Inner " + j);
      }
    //How can we assume to go in strings  for (for loop)//
    String[] cars = { "Volvo", "BMW", "Ford" };
        for (String i : cars) {
            System.out.println(i);
        }

      // for break//
       for (int i = 0; i < 10; i++) {
        if (i==5) {
            break;
        }
        System.out.println(i);
      }

    //for Continue (In the loop, when the value is "4", jump directly to the next value)//
     for (int i = 0; i<4; i++) {|
       if (i==4) {
          continue;
      }
      System.out.println(i);
    }

  // For each loop//
    String[] cars = {"Volvo", "BMW", "Ford", "Leyland"};
      for (String i : cars) {
        System.out.println(i);
      }
  
  //Java Break and Continue//
 //Java Break//
   for (int i = 0; i < 10; i++) {
      if (i==4) {
        break;
      }
      System.out.println(i);
    }

  //Java Continue//
  for (int i = 0; i < 10; i++) {
      if (i==4) {
        continue;
      }
      System.out.println(i);
    }

  // Break and continue in while loop//
 // Break Example//
   int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 4) {
        break;
      }
    }

// Continue Example//
  int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 4) {
        continue;
      }
    }

   //Java Arrays//
  String[] cars = {"Volvo", "Swaraj"};
    System.out.println(cars[0]);

  //Array length//
 String[] cars = {"Volvo", "BMW"};
   System.out.println(cars.length);

  //Loop tHrough an array//
  String cars[] = {"Volvo"; "BMW"; "Ford"; "Leyland"};
  for (int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
    }

  //Loop Throug an array with For Each//
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }

 //Multi Dimensional Arrays//
 int[][] myNumbers = {{1, 2, 3, 4}, {5,6,7,8} };
    System.out.println(myNumbers[1][2]);

 //Change Element Values//
 int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
    myNumbers[1][2] = 9;
    System.out.println(myNumbers[1][2]);

// Loop Through A Multidimensional Array//
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }

  /*Java Methods
   A method is a block of code which only runs when it is called.
   You can pass data, known as parameters, into a method.
   Methods are used to perform certain actions, and they are also known as functions.
   Why use methods? To reuse code: define the code once, and use it many times.*/

   //Create a method//
Create a method inside Main:

public class NewMain {
  static void myMethod() {
    // code to be executed
  }
}

// Call a Method//
 public class NewMain {
  static void myMethod() {
   system.out.println("I just got executed");
}
  public static void main(String args[]) {
    myMethod();
  }
}

//A method can also be called Multiple times//
public static void main(String[] args) {
        myMethod("Siva Prasad");
        myMethod("Rajeswari");
        myMethod("Vivek Vardhan");
        myMethod("Avanish");
        myMethod("Sai Bhaskar");
        myMethod("Rachit");
        myMethod("Mustak");
        myMethod("Safwan");
        myMethod("Chaitanya");
    }

   //Return a value//
  /* The void keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method*/

public class NewMain {
Static int myMethod(int x) {
   returns 5 + x;
  }

  public static void main (string args[]) {
    System.out.println(myMethod(3));
   }
}

//A Method with if .. else//
 public class NewMain {

  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    // If age is greater than, or equal to, 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!");
    }

  }

  public static void main(String[] args) {
    checkAge(20); // Call the checkAge method and pass along an age of 20
  }
}

//Java Recursion//
  /* Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve*/

public class Example1 {
  public static void main(String[] args) {
    int result = sum(9);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}

//Example Explained//
/* When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and returns the result. When k becomes 0, the function just returns 0. When running, the program follows these steps*/

//Halting Condition//
// Use recursion to add all of the numbers between 5 to 10//
public class Main {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}
  }
}  
