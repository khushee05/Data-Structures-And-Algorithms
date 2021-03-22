package BST;

public class printBST {
	
	public static void printBinaryTree(BSTNode<Integer> root)
	{
		if(root == null)
			return;
		System.out.println("Root data is: " + root.data);
		
		if(root.Left != null)
		{
			System.out.println("Left data: " + root.Left.data);
			
		}
		else
			System.out.println("No Left Child");
		
		if(root.Right!=null)
		{
			System.out.println("Right data: " + root.Right.data);
			
		}
		else
			System.out.println("No Right Child");
		
		System.out.println();
		printBinaryTree(root.Left);
		printBinaryTree(root.Right);
		
	}

	public static void main(String[] args) {
			
		BSTNode<Integer> root = new BSTNode<Integer>(3);
		BSTNode<Integer> leftroot = new BSTNode<Integer>(2);
		BSTNode<Integer> rightroot = new BSTNode<Integer>(4);
		
		root.Left = leftroot;
		root.Right = rightroot;
		
		printBinaryTree(root);

	}

}
