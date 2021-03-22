package BST;

public class Numberof_Nodes {
	
	public static int count_node(BSTNode<Integer> root)
	{
		if( root == null)
			return 0;
		int leftchild = count_node(root.Left);
		int rightchild = count_node(root.Right);
		
		return 1 + leftchild+rightchild;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeInput obj = new TreeInput();
		
		BSTNode<Integer> node = obj.treeInputbetter(true,false,0);
		
		int count = count_node(node);
		System.out.print("Number of nodes: "+ count);
	}

}
