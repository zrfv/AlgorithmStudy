package algorithms;

public class Fibonacci {
    public int fib(int number) {
        if(number <= 0) return 0;
        else if (number == 1) return 1;
        else {
            return fib(number - 1) + fib(number - 2);
        }
    }
}
