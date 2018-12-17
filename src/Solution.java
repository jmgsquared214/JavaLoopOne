import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


//        Given an integer, , print its first  multiples. Each multiple  (where )
// should be printed on a new line in the form: N x i = result.
//        Print  lines of output; each line  (where ) contains the  of  in the form:
//        N x i = result.
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        for(int i =1; i<=10; i++)

        System.out.print(N + " x " + i + " = " + N * i + "\n");


        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}