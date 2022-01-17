package infrun.recursive;

//팩토리얼
public class R3 {

    public static void main(String[] args) {

        R3 r2 = new R3();

        System.out.println(r2.DFS(5));

    }

    public int DFS(int n){
        if(n==1)
            return 1;


        return n*DFS(n-1);
    }


}
