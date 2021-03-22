package BST;

import java.util.*;

public class TreeInput {
	
	public static BSTNode<Integer> treeInput( boolean isRoot, boolean isLeft , int parentdata)
	{
		Scanner scan = new Scanner(System.in);
		BSTNode<Integer> root = null;
		if(isRoot)
		{
			System.out.print("Enter root data :");
			root.data = scan.nextInt();
		}
		if(isLeft)
		{
			System.out.print("Enter Left Child of "+ parentdata + ": ");
			root.Left.data = scan.nextInt();
		}
		else
		{
			System.out.print("Enter Right Child of "+ parentdata + ": ");
			root.Right.data = scan.nextInt();
		}
		
		BSTNode<Integer> left = treeInput(false, true, root.data);
		BSTNode<Integer> right = treeInput(false, false, root.data);
		 root.Left = left;
		 root.Right = right;
		return root;
		
	}
	
	public static void main(String[] args) {
		
//		TreeInput node = new TreeInput();
//		BSTNode<Integer> root = node.treeInput(true,false,0);
		
		BSTNode<Integer> node= treeInput(true,false,0);
		printBinaryTreeCN(node);
		}

}
