package BST;

public class printBSTCN {
	
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
	public static void main(String[] args) {
		
		BSTNode<Integer> root = new BSTNode<Integer>(3);
		BSTNode<Integer> leftroot = new BSTNode<Integer>(2);
		BSTNode<Integer> rightroot = new BSTNode<Integer>(4);
		
		root.Left = leftroot;
		root.Right = rightroot;
		
		printBinaryTreeCN(root);

	}

}
