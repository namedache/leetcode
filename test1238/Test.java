package test1238;

/**
 * @author zhoukun
 */
public class Test {


    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length<=2){
            return true;
        }
        double k = 0;
        double b = 0;
        int  x1 = coordinates[0][0];
        int  y1 = coordinates[0][1];
        int  x2 = coordinates[1][0];
        int  y2 = coordinates[1][1];
        if (x2-x1==0){
            k = 0;
            b = 0;
        } else {
            k = (y2-y1)/(x2-x1);
            b = y1  - k*x1;
        }

        for (int i = 2; i < coordinates.length; i++) {
            if (coordinates[i][1]!=k*coordinates[i][0]+b){
                return false;
             }
        }
        return true;
    }



}
