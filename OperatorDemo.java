public class OperatorDemo {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }


// Method with return
int multiply(int a, int b) {
    return a * b;
}
public static void main(String[] args) {
     // Operators
    int x = 15, y = 3;
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x * y = " + (x * y));
    System.out.println("x / y = " + (x / y));
    System.out.println("x % y = " + (x % y));
    // Arithmetic Promotion
    byte a = 10, b = 20;
    int result = a +  b; // promoted to int 
    System.out.println("Arithmetic Promotion Result: " + result);

    // Method Calling
    OperatorDemo obj = new OperatorDemo();
    obj.add(9, 5);
    int product = obj.multiply(3,8);
    System.out.println("Multiplication: " + product);
}
   
 
}