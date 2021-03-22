package BST;

import java.util.*;
public class TreeInput {
	
	
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
			
		}
		else
		{
			System.out.print("Enter Right Child of "+ parentdata + ": ");
			
			
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
		
		printBSTCN obj = new printBSTCN();
		
		BSTNode<Integer> root = treeInputbetter(true,false,0);
		
		obj.printBinaryTreeCN(root);
		}

}
