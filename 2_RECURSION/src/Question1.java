// How to find the sum of digits of a positive integer number using recursion

public class Question1 {
public int sumOfDigits(int n){
    if(n == 0|| n < 0){
        return 0;
    }
    return n%10 + sumOfDigits(n/10);
}
}