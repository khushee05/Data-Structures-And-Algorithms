package BST;

public class BST_NodeWithLargestData {
	
	public static int LargestData(BSTNode<Integer> root)
	{
		int max;
		int leftchild,rightchild;
		if(root == null)
			return -1;
		
		leftchild = LargestData(root.Left);
		rightchild =LargestData(root.Right);
		
		max = Math.max(root.data, Math.max(leftchild, rightchild));
		
			
		return max;
	}

	public static void main(String[] args) {
		
		TreeInput obj = new TreeInput();
		BSTNode<Integer> node = obj.treeInputbetter(true,false,0);
		
		int c = LargestData(node);
		System.out.print(c);


	}

}
