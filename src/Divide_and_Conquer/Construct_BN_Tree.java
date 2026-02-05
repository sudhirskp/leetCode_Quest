package Divide_and_Conquer;


import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
    }

}

public class Construct_BN_Tree {

    private int postind;
    private int [] post;
    Map<Integer,Integer> indmap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        indmap  = new HashMap<>();

        for(int i =0;i<n;i++){
            indmap.put(inorder[i],i);
        }

        postind = postorder.length-1;
        post = postorder;

        return build(0,postind);
    }

    private TreeNode build(int left,int right){
        if(left>right) return null;

        int val = post[postind--];
        TreeNode root = new TreeNode(val);

        int ind = indmap.get(val);

        root.right = build(ind+1,right);
        root.left = build(left,ind-1);

        return root;
    }

    void inorder(TreeNode root){
        if(root==null) {

            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Construct_BN_Tree ob = new Construct_BN_Tree();
        int [] inorder = {9,3,15,20,7};
        int [] postorder = {9,15,7,20,3};
        TreeNode root = ob.buildTree(inorder,postorder);
        ob.inorder(root);

    }
}
