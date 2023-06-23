//Program to find GCD between two numbers
public class Example3 {
 
    //Static (funcn) return gcd of a and b
    static int gcd(int a, int b)
    {
        // Find Minimum of a and b
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }

    public static void main(String[] args)
    {
        int a = 29, b = 17;
        System.out.print("GCD of " + a + " and " + b
                         + " is " + gcd(a, b));
    }
}
