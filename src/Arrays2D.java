public class Arrays2D {
    public static int[][] minsAndMaxs(int[][] a) {
        int[][] minmax_array = new int[a.length][2];
        for (int i = 0; i < a.length; i++) {
            if (a[i].length == 0) {
                continue;
            }

            int max = a[i][0], min = a[i][0];
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            minmax_array[i][0] = min;
            minmax_array[i][1] = max;
        }
        return minmax_array;
    }

    public static int[][] tersCevir(int[][] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[0].length != a[i].length) {
                System.out.println("Alle Arrays haben nicht die gleiche Größe!");
                return new int[][]{};
            }
        }

        int[][] transpozed = new int[a[0].length][a.length];

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                transpozed[i][j] = a[j][i];
            }
        }
        return transpozed;
    }

    public static int[] linearize(int[][] a) {
        int length = 0;
        for (int i = 0; i < a.length; i++) {
            length += a[i].length;
        }

        int[] linearized = new int[length];
        int index = 0;

        for (int i = 0; index < length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                linearized[index++] = a[i][j];
            }
        }
        return linearized;
    }
}
