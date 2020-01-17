import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int [][] array = new int [size][size];
        for(int i = 0;i<size;i++) {
            for(int a = 0;a<size;a++) {
                array[i][a]=(int)(Math.random()*2);
                System.out.print(array[i][a]+" ");
            }
            System.out.println();
        }
        row(array);
        column(array);
        diagonal(array);
        subdiagonal(array);
    }
    public static void row(int [][] array) {
        boolean bool = true ;
        for(int i=0;i<array.length;i++) {
            bool = true;
            for(int a=0;a<array[i].length-1;a++) {
                if(array[i][a]!=array[i][a+1]) {
                    bool = false;
                }
            }
            if(bool) {
                System.out.println((i+1)+" hang is "+array[i][0]);
            }
        }
    }
    public static void column(int [][] array) {
        boolean bool = true ;
        for(int a=0;a<array.length;a++) {
            bool = true;
            for(int i=0;i<array[a].length-1;i++) {
                if(array[i][a]!=array[i+1][a]) {
                    bool = false;
                }
            }
            if(bool) {
                System.out.println((a+1)+" lie is "+array[0][a]);
            }
        }
    }
    public static void diagonal(int [][] array) {
        boolean bool = true ;
        int i;
        for(i=0;i<array.length-1;i++) {
            if(array[i][i]!=array[i+1][i+1]) {
                bool = false;
            }
        }
        if(bool) {
            System.out.println("major diagonal is "+array[i][i]);
        }
    }
    public static void subdiagonal(int [][] array) {
        boolean bool = true ;
        for(int i=array.length-1;i>0;i--) {
            for(int a = array.length-i-1;a<array.length-i;a++) {
                if(array[i][a]!=array[i-1][a+1]) {
                    bool = false;
                }
            }
        }
        if(bool) {
            System.out.println("sub-diagonal is "+array[0][array.length-1]);
        }
    }
}
