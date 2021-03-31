package binary_trees;

public class Improved_chk_BST {

	public static boolean chkBST(BinaryTreeNode<Integer> root, int minRange, int maxRange)
	{
		if(root == null)
			return true;
		
		if(root.data < minRange || root.data > maxRange)
			return false;
		
		boolean isleft = chkBST(root.left, minRange, root.data-1 );
		boolean isright = chkBST(root.right, root.data, maxRange);
		
		return isleft && isright;
	}
	
	public static void main(String args[])
	{
		TreeInput obj = new TreeInput();
		BinaryTreeNode<Integer> node = obj.treeInputbetter(true,false,0);
		
		boolean b=chkBST(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.print(b);
	}
}
