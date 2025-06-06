public class Main{
    public static class TreeNode{
        String data;
        TreeNode left;
        TreeNode right;
    public TreeNode(String data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    }
    public static void inorderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data+",");
        inorderTraversal(node.right);
    }
     public static void main(String[] args) {
        TreeNode root = new TreeNode("R");
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeF = new TreeNode("F");
        TreeNode nodeG = new TreeNode("G");

        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;

        nodeF.left = nodeG;

        inorderTraversal(root);
    }
}