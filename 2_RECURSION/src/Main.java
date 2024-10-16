/*
- Recursion is a way of solving a problem by having a function calling itself.
- It is performing the same operation multiple times with different input example is the Russian doll
  (From opening the bigger one and inside the bigger ones, we have the smaller ones.)
- In every step we try smaller inputs to make the problem smaller.
- Base condition is needed to stop the recursion, otherwise infinite loop will occur.

LOGIC BEHIND RECURSION
- A method that calls itself
- Exit from infinite loop
*/

public class Main {
    public static void main(String[] args) {
        // System.out.println(factorial(0));
        // System.out.println(fibonacci(3));

        Question1 question1 = new Question1();
        System.out.println(question1.sumOfDigits(123));

        Question2 question2 = new Question2();
        System.out.println(question2.power(2,3));

        Question3 question3 = new Question3();
        System.out.println(question3.gcd(6, 6));

    }
    public static int factorial(int n){
        if(n < 0){
            return -1;
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n < 0){
            return -1;
        }
        if(n == 0 || n ==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
