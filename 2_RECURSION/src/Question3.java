//How to find GCD(Greatest Common Divisor) of two numbers using recursion
public class Question3 {
    public int gcd(int a, int b){
        if(a<0 || b<0){
            return -1;
        }
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
