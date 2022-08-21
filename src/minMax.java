import java.util.List;
import java.util.Scanner;

public class minMax {
    public static void main(List<Integer> arr) {
        Scanner scanner = new Scanner(System.in);

        long sum=0;
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;

        for(int i=0; i<5; i++){
            long n = scanner.nextLong();
            arr.add((int) n);

            sum +=n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }

        System.out.println(min + " " + max);
    }
}
