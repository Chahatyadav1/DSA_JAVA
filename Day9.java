public class Day9 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int index=-1;
        static Node buildTree(int[] arr){
            index++;
            if(arr[index]==-1){
                return null;
            }
            Node newnNode=new Node(arr[index]);
            newnNode.left=buildTree(arr);
            newnNode.right=buildTree(arr);
            return newnNode;
        }
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree=new BinaryTree();
        Node head=tree.buildTree(arr);
        System.out.println(head.left.right.data);
    }
}
