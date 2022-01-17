package infrun.recursive.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class R10 {

    Node root;
    public static void main(String[] args) {


        R10 tree = new R10();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(tree.BFS(0, tree.root));

    }

    private int BFS(int i, Node root) {

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int l=0;
        while(!q.isEmpty()){
            int size =q.size();
            for(int j=0;j<size;j++){
                Node cur = q.poll();
                if(cur.lt==null&&cur.rt==null)
                    return l;
                if(cur.lt!=null)
                    q.offer(cur.lt);
                if(cur.rt!=null)
                    q.offer(cur.rt);
            }

            l++;
        }

        return l;
    }
}
