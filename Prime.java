package demo;
import java.util.Scanner;


public class Prime {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int limit;

   
    System.out.print("Enter an integer (2 or above): ");
    limit = sc.nextInt();
    sc.close();

    if (limit >= 2) {
        System.out.println("The prime numbers up to your interger are: "
                + limit + "\n");
        for (int i = 1; i <= limit; i++) {
            
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    } else
        System.out.println("Number is not vaild");

}

public static boolean isPrime(int n) {
    if (n % 2 == 0)
        return (n == 2);
    for (int i = 3; i * i <= n; i += 2) {
        if (n % i == 0)
            return false;
    }
    return true;
}
}