import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int l = 5;
       int r = 555;
       int[] answer = {};

       if ((r % 2 == 1) && (l % 2 == 1)) {
           answer = new int[]{l, r};
           System.out.println(Arrays.toString(answer));
       } else  {
           answer = new int[]{-1};
           System.out.println(Arrays.toString(answer));
       }
    }
}
