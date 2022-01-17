package infrun.recursive;

public class R4 {

    static long []arr;

    public static void main(String[] args) {

        R4 r2 = new R4();

        arr = new long[51];
        System.out.println(r2.DFS(50));

    }

    public long DFS(int n){
        if(n<2)
            return n;
        else if(arr[n]!=0)
            return arr[n];
        else
        return arr[n]=DFS(n-2)+DFS(n-1);
    }


}
