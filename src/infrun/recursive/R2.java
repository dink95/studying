package infrun.recursive;
//이진수 변환
public class R2 {

    public static void main(String[] args) {

        R2 r2 = new R2();

        r2.DFS(11);

    }

    public void DFS(int n){
        if(n==0)
            return;
        DFS(n/2);
        System.out.print(n%2);
    }


}
