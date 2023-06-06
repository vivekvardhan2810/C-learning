//Java Practice//
/* The code below will print the words*/
class Main {
  public static void main(String args[]) {
    System.out.println("Hello world");
    System.out.println("I am learning Java");
    System.out.println("It is Awesome");
    System.out.println("I will print on the same line.");
    System.out.println("Myself Vivek Vardhan and learning java Slowly");
    /*
     * The Below input shows use the println() method to print numbers
     * However, unlike text, we don't put numbers inside double quotes
     */
    System.out.println(3);
    System.out.println(3 + 6);
    System.out.println(2 * 10);
    /*
     * Java Variables like String (stores text, such as "Hello"), float (decimals),
     * int such as (1,2 or any number), boolean (T/F), char (stores single
     * characters, such as 'a' or 'B')
     */
    
    //for String//
    String name = "Vivek";
    System.out.println("Hello " + name);
    
    String firstName = "Vivek ";
    String lastName = "Vardhan";
    String fullName = firstName + lastName;
    System.out.println(fullName); 

    //for int//
    int myNum = 15;
    myNum = 20;
    System.out.println(myNum);

    int x = 5;
    int y = 7;
    int z = x + y;
    System.out.println(z);
   
  /* Or we can write like this*/
    int x = 5;
    int y = 7;
    System.out.println(x+y); 
    
    int x = 5, y = 7;
    System.out.println(x+y);
 /* Above two*/
    
    //for float//
    float f1 = 35e3f;
    System.out.println(f1);
    
    //for boolean//
   boolean isJavaFun = true;
    System.out.println(isJavaFun);
    
    //for character//
    char myGrade = 'B';
    System.out.println(myGrade);
  }
}
