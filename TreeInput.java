package BST;

import java.util.*;
public class TreeInput {
	
	public static void printBinaryTreeCN(BSTNode<Integer> root)
	{
		if(root == null)
			return;
		System.out.print( root.data + ": "); 
		
		if(root.Left != null)
		{
			System.out.print("L" + root.Left.data +", ");
			
		}
		
		
		if(root.Right!=null)
		{
			System.out.println("R" + root.Right.data) ;
			
		}
		
		System.out.println();
		printBinaryTreeCN(root.Left);
		printBinaryTreeCN(root.Right);
	}
	public static BSTNode<Integer> treeInputbetter( boolean isRoot, boolean isLeft , int parentdata)
	{
		Scanner scan = new Scanner(System.in);
		BSTNode<Integer> root = new BSTNode<Integer>();
		if(isRoot)
		{
			System.out.print("Enter root data :");
			
		}
		else if(isLeft)
		{
			System.out.print("Enter Left Child of "+ parentdata + ": ");
			//root.Left.data = scan.nextInt();
		}
		else
		{
			System.out.print("Enter Right Child of "+ parentdata + ": ");
			//root.Right.data = scan.nextInt();
			
		}
		
		root.data = scan.nextInt();
		
		if(root.data == -1)
			return null;
		BSTNode<Integer> left = treeInputbetter(false, true, root.data);
		 BSTNode<Integer> right = treeInputbetter(false, false, root.data);
		 root.Left = left;
		 root.Right = right;
		return root;
		
	}
	
	public static void main(String[] args) {
		

		BSTNode<Integer> root = treeInputbetter(true,false,0);
		printBinaryTreeCN(root);
		}

}
