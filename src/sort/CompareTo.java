package sort;

public class CompareTo {

    public static void main(String[] args) {
        String ver1 = "8.5.2.4", ver2 = "8.5.3";

        System.out.println(solve(ver1,ver2));
    }

    private static int solve(String ver1, String ver2) {

        String[] v1 = ver1.split("\\.");
        String[] v2 = ver2.split("\\.");


        int length = Math.max(v1.length,v2.length);
        for(int i=0;i<length;i++){
            Integer parseV1 = i<v1.length ? Integer.parseInt(v1[i]) : 0;
            Integer parseV2 = i<v2.length ? Integer.parseInt(v2[i]) : 0;

            int comp = parseV1.compareTo(parseV2);
            if(comp!=0)
                return comp;
        }

        return 0;
    }

}
