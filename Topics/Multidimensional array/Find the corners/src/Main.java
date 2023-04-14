import java.util.Scanner;

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int a, b, c, d;
        a = twoDimArray[0][0];
        b = twoDimArray[0][twoDimArray[twoDimArray.length - 1].length - 1];
        c = twoDimArray[twoDimArray.length - 1][0];
        d = twoDimArray[twoDimArray.length - 1][twoDimArray[twoDimArray.length - 1].length - 1];

        System.out.printf("%d %d %n" +
                "%d %d", a, b, c, d);
    }
}