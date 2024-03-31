public class Zadanie1 {
    public static void main(String[] args) {
        int n = 100;
        long sumOfSquares = getSumOfSquares(n);
        long squareOfSum = getSquareOfSum(n);
        long difference = squareOfSum - sumOfSquares;
        System.out.println("Difference: " + difference);
    }

    public static long getSumOfSquares(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static long getSquareOfSum(int n) {
        long sum = (n * (n + 1)) / 2;
        return sum * sum;
    }
}