package algorithms;

public class FibonacciMemoized {
    private int[] save = new int[1001];

    public int fibMem(int num) {
        if (num <= 0) return 0;
        else if (num == 1) return 1;
        else if (save[num] == 0) {
                save[num] = fibMem(num - 1) + fibMem(num - 2);
            }
        return save[num];
    }
}
