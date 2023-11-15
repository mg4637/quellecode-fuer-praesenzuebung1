public class Kontrollstrukturen {
    public static int groesserAls0(int n) {
        if (n <= 0) {
            System.out.println("Eingabe muss größer oder gleich 0 sein!");
            return -1;
        }
        return n;
    }

    public static void printPrimesUpTo(int n) {
        if (n >= 2) {
            System.out.print("2");
        }

        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
