package Collection_framework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class streams {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7};

        Arrays.stream(numbers).forEach(n -> {
            if((n%2) != 0 ) {
                System.out.println(n);
            }
        });
    }
}
