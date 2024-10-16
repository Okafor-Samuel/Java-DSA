//How to calculate power of a number using recursion
public class Question2 {
    public int power(int base, int exp){
        if(exp <0){
            return -1;
        }
        if(exp == 0){
            return 1;
        }
        return base * power(base, exp -1);
    }
}
