package BST;

public class BST_NodeGreaterThanX {
	public static int countNodesGreaterThanX(BSTNode<Integer> root, int x) {
		//Your code goes here
        
		int leftchild,rightchild;
		if(root == null)
			return 0;
        
		leftchild = countNodesGreaterThanX(root.Left, x);
		rightchild = countNodesGreaterThanX(root.Right, x);
		
		
        return (root.data > x ? 1 : 0) + leftchild + rightchild;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeInput obj = new TreeInput();
		BSTNode<Integer> node = obj.treeInputbetter(true,false,0);
		
		int c = countNodesGreaterThanX(node,3);
		System.out.print(c);

	}

}
