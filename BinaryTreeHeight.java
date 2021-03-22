package BST;

public class BinaryTreeHeight {
	
	public static int height(BSTNode<Integer> root) {
		//Your code goes here
        if(root == null)
            return 0;
     	int leftchild = height(root.Left);
       	int rightchild = height(root.Right);
        
    	return 1 + (leftchild > rightchild ? leftchild : rightchild);
        
	}

	public static void main(String[] args) {
		
		TreeInput obj = new TreeInput();
		BSTNode<Integer> node = obj.treeInputbetter(true,false,0);
		
		int h = height(node);
		System.out.print(h);

	}

}
