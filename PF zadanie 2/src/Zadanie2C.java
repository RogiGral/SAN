public class Zadanie2C {
    public static double heronSquareRoot(double x, int N) {
        if (x < 0) {
            throw new IllegalArgumentException("Liczba musi być większa lub równa 0.");
        }

        double guess = x; // Inicjalizacja początkowej wartości odgadnięcia

        for (int i = 0; i < N; i++) {
            guess = 0.5 * (guess + x / guess); // Aktualizacja odgadnięcia
        }

        return guess;
    }

    public static void main(String[] args) {
        double x = 16.0; // Liczba, której pierwiastek chcemy obliczyć
        int N = 10; // Ilość kroków (liczba iteracji)

        double sqrt = heronSquareRoot(x, N);
        System.out.println("Pierwiastek kwadratowy z " + x + " po " + N + " krokach wynosi: " + sqrt);
    }
}