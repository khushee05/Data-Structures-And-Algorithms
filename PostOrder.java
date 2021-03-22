package BST;

public class PostOrder {
	
	public static void postOrder(BSTNode<Integer> root) {
		//Your code goes here
        if(root == null)
            return;
       
        if(root.Left!=null)
        {
            postOrder(root.Left);
        }
        if(root.Right!=null)
        {
            postOrder(root.Right);
        }
        System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
		
		TreeInput obj = new TreeInput();
		BSTNode<Integer> node = obj.treeInputbetter(true,false,0);
		postOrder(node);

	}

}
