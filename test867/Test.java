package test867;

/**
 * @author zhoukun
 */
public class Test {

    public int[][] transpose(int[][] A) {

        int width = A.length;
        int len = A[0].length;

        int[][] ints = new int[len][width];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < len; j++) {
                ints[j][i] = A[i][j];
            }
        }
        return ints;
    }


}
