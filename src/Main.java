import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,5,10};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
