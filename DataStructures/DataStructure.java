import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * Created by simo on 28/11/2017.
 */
public class DataStructure {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int d){data=d;left=null;right=null;};
    }
    static void preOrder(Node root) {
        if(root==null ){
            return;
        }
        else{
            System.out.print(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    static int height(Node root) {
        if(root==null){
            return 0;
        }
        Queue<Node> q = new LinkedList();
        q.add(root);
        int height=0;
        while(true){
            int nodecount=q.size();
            if (nodecount == 0)
                return height-1;
            height++;
            while(nodecount>0){
                Node newnode =q.peek();
                q.remove();
                if (newnode.left != null)
                    q.add(newnode.left);
                if (newnode.right != null)
                    q.add(newnode.right);
                nodecount--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }

}
