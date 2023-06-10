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
   
  }
}  
