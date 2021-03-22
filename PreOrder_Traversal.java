package BST;

public class PreOrder_Traversal {

	public static void preOrder(BSTNode<Integer> root) {
		//Your code goes here
        if(root == null)
            return;
        System.out.print(root.data + " ");
        if(root.Left!=null)
        {
            preOrder(root.Left);
        }
        if(root.Right!=null)
        {
            preOrder(root.Right);
        }
	}
	public static void main(String[] args) {
		
		TreeInput obj = new TreeInput();
		BSTNode<Integer> node = obj.treeInputbetter(true,false,0);
		preOrder(node);
	}

}
