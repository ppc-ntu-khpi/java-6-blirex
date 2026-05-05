import java.util.stream.IntStream;

public class MatrixUtils {

    public static int[][] addMatrices(int[][] a, int[][] b) {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Матриці різного розміру");
        }

        return IntStream.range(0, a.length)
                .mapToObj(i ->
                        IntStream.range(0, a[i].length)
                                .map(j -> a[i][j] + b[i][j])
                                .toArray()
                )
                .toArray(int[][]::new);
    }
}