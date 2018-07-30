package recursive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import recursive.TreeNode;

public class BinaryTreeTraversal
{

	public static void printInorder(TreeNode root)
	{
		if (root == null)
			return;

		printInorder(root.left);
		System.out.println(root.data);
		printInorder(root.right);

	}

	public static void printPreOrder(TreeNode root)
	{
		if (root == null)
			return;

		System.out.println(root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);

	}

	public static void printPostOrder(TreeNode root)
	{
		if (root == null)
			return;

		printPreOrder(root.left);
		printInorder(root.right);
		System.out.println(root.data);

	}
	/*Given a binary tree, return the level order traversal of its nodes' values
// (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
*/
	public static List<List<Integer>> levelOrderTraversal(TreeNode root)
	{
		List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        int cur=1;//to track current level and next level
        int next=0;
        res.add(new ArrayList<Integer>());
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            cur--;//since polling so decrement
            res.get(res.size()-1).add(temp.data);//res.get(0).add,res.get(1).add
            if(temp.left!=null){
                q.add(temp.left);
                next++;//next level incrementing
            }
            if(temp.right!=null){
                q.add(temp.right);
                next++;
            }
            if(cur==0){//entering into next level so create new list
                cur=next;
                if(next!=0)//if next level nodes all are null no need to create new list
                res.add(new ArrayList<Integer>());
                next=0;
            }
        }
        return res;
	}

	public static int size;

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.right= new TreeNode(5);

		// root2
		/*
		 * TreeNode root2 = new TreeNode(1); root2.right=new TreeNode(2);
		 * root2.right.left=new TreeNode(3);
		 * System.out.println("In order printing below"); printInorder(root);
		 * System.out.println("pre order printing below"); printPreOrder(root);
		 * System.out.println("post order printing below");
		 * printPostOrder(root);
		 */
		List<List<Integer>> res=levelOrderTraversal(root);
		System.out.println(res);

	}

}
