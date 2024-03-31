public class Zadanie2B {
    public static double heronSquareRoot(double x, double epsilon) {
        if (x < 0) {
            throw new IllegalArgumentException("Liczba musi być większa lub równa 0.");
        }

        double guess = x; // Inicjalizacja początkowej wartości odgadnięcia
        int iteration = 0; // Licznik iteracji

        while (Math.abs(guess * guess - x) > epsilon) {
            guess = 0.5 * (guess + x / guess); // Aktualizacja odgadnięcia
            iteration++;
        }

        System.out.println("Liczba iteracji: " + iteration);
        return guess;
    }

    public static void main(String[] args) {
        double x = 16.0; // Liczba, której pierwiastek chcemy obliczyć
        double epsilon = 0.0001; // Wartość epsilon

        double sqrt = heronSquareRoot(x, epsilon);
        System.out.println("Pierwiastek kwadratowy z " + x + " wynosi: " + sqrt);
    }
}