public class Zadanie2A {

    public static int cubeRoot(int n, double precision) {
        int x = n;
        while (Math.abs(n - (x * x * x)) > precision) {
            x = (2 * x + n / (x * x)) / 3;
        }

        return x;
    }

    public static void main(String[] args) {
        int number = 64;
        double precision = 0.0001;
        int cubeRootValue = cubeRoot(number, precision);
        System.out.println("Cube root of " + number + " is approximately: " + cubeRootValue);
    }
}
