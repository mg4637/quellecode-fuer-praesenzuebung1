import java.util.Arrays;

public class Arrays1D {
    public static void printSusluParantezIle(int[] a) {
        if (a.length == 0) {
            System.out.print("{}");
            return;
        }
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.print("}");
    }

    public static void minAndMax(int[] a) {
        if (a.length == 0) {
            return;
        }

        int min = a[0], max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.print("Minimum = " + min + ", Maximum = " + max);
    }

    public static boolean isOrderedAscendingly(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        return true;
    }

    public static void invert(int[] a) {
        int middle = a.length / 2;
        for (int i = 0; i < middle; i++) {
            int t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
    }

    public static int[] resize(int[] a, int length) {
        if (length < 0) {
            System.out.println("Fehler!");
            return new int[]{};
        }

        int[] resized = new int[length];

        for (int i = 0; i < length; i++) {
            if (i >= a.length) {
                break;
            }
            resized[i] = a[i];
        }
        return resized;
    }

    public static int[] filterEvenNumbersFrom(int[] a) {
        int length = 0;
        int[] temp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                temp[length++] = a[i];
            }
        }
        int[] filtered = new int[length];
        for (int i = 0; i < length; i++) {
            filtered[i] = temp[i];
        }
        return filtered;
    }

    public static int[] farkliRakamlariYaz(int[] a) {
        int unique_anzahl = 0;
        int[] temp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    unique = false;
                }
            }
            if (!unique) {
                continue;
            }
            temp[unique_anzahl++] = a[i];
        }

        int[] distincted = new int[unique_anzahl];
        for (int i = 0; i < unique_anzahl; i++) {
            distincted[i] = temp[i];
        }
        return distincted;
    }

    public static int[] filter(int[] array, int min, int max) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= max && array[i] >= min) {
                length++;
            }
        }

        int[] r = new int[length];

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= max && array[i] >= min) {
                r[index++] = array[i];
            }
        }

        return r;
    }

    public static void rotate(int[] array, int amount) {
        int[] rotated = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (amount >= 0) {
                rotated[(i + amount) % array.length] = array[i];
            } else {
                rotate(array, amount % array.length + array.length);
                return;
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = rotated[i];
        }

        System.out.println(Arrays.toString(rotated));
    }

    public static int[][] herRakamdanKacTaneVar(int[] array) {
        int[][] qArray = new int[array.length][2];

        int qArray_new_index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean first_number = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == 0 && qArray[j][0] == 0 && qArray[j][1] == 0) {
                    break;
                }
                if (qArray[j][0] == array[i]) {
                    qArray[j][1]++;
                    first_number = false;
                    break;
                }
            }
            if (first_number) {
                qArray[qArray_new_index][0] = array[i];
                qArray[qArray_new_index++][1] = 1;
            }
        }

        int length = 0;
        for (int i = 0; i < array.length; i++) {
            if (qArray[i][1] == 0) {
                break;
            }
            length = i + 1;
        }

        int[][] qArray2 = new int[length][2];
        for (int i = 0; i < length; i++) {
            qArray2[i][0] = qArray[i][0];
            qArray2[i][1] = qArray[i][1];
        }

        return qArray2;
    }

    public static int reverseNumber(int n) {
        if (n < 0 || n > 1000000000) {
            return -1;
        } else {
            int digit = 0;
            int n_temp = n;
            while (n_temp > 0) {
                n_temp /= 10;
                digit++;
            }
            int[] list = new int[digit];

            n_temp = 0;
            int index = digit - 1;
            while (index >= 0) {
                list[index] = Integer.toString(n).charAt(n_temp) - 48;
                index--;
                n_temp++;
            }

            index = 0;
            n_temp = 0;
            while (index < digit) {
                n_temp = n_temp * 10 + list[index];
                index++;
            }
            return n_temp;
        }
    }

    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static int calculateNumberOfDigits(int n) {
        if (n < 0) {
            System.out.println("Eingabe muss positiv sein!");
        }

        if (n == 0) {
            return 0;
        } else {
            int k = 0;
            while (n > 0) {
                n = n / 10;
                k++;
            }
            return k;
        }
    }

}
