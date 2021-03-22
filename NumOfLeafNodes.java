package BST;

public class NumOfLeafNodes {
	
	public static int numOfLeaf(BSTNode<Integer> root)
	{
		if(root == null)
		{
			return 0;
		}
		
		if(root.Left == null && root.Right == null)
		{
			return 1;
		}
		return numOfLeaf(root.Left)+numOfLeaf(root.Right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeInput obj = new TreeInput();
		BSTNode<Integer> node = obj.treeInputbetter(true,false,0);
		
		int h = numOfLeaf(node);
		System.out.print(h);

	}

}
