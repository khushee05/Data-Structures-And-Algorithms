package binary_trees;

class Chk_BST
{
	boolean isBST;
	int min;
	int max;
	
	Chk_BST(boolean isBST, int min, int max)
	{
		this.isBST = isBST;
		this.max = max;
		this.min = min;
	}
}
public class BST_isBST {

	public static Chk_BST chk_isBST(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			Chk_BST ans = new Chk_BST(true, Integer.MAX_VALUE, Integer.MIN_VALUE);
			return ans;
		}
		
		Chk_BST lans = chk_isBST(root.left);
		Chk_BST rans = chk_isBST(root.right);
		
		int min = Math.min(root.data, Math.min(lans.min, rans.min));
		int max = Math.max(root.data, Math.max(lans.max, rans.max));
		
		boolean is_bst = true;
		
		if(lans.max >= root.data)
			is_bst = false;
		if(rans.min <=root.data)
			is_bst = false;
		if(!lans.isBST)
			is_bst = false;
		if(!rans.isBST)
			is_bst = false;
		Chk_BST ans = new Chk_BST(is_bst,min,max);
		return ans;
		
	}
	public static void main(String[] args) {
		
		TreeInput obj = new TreeInput();
		BinaryTreeNode<Integer> node = obj.treeInputbetter(true,false,0);
		
		Chk_BST obj2 = chk_isBST(node);
		System.out.print(obj2.isBST);
		

	}

}
