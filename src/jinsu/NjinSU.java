package jinsu;

public class NjinSU {
    public static void main(String[] args) {

        System.out.println(solve(100));

    }

    private static String solve(int i) {

        StringBuilder sb = new StringBuilder();
        while(i>0){
            int res = i%3;
            i= i/3;
            sb.append(res);

        }

        return sb.reverse().toString();
    }
}
