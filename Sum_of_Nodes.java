package BST;

public class Sum_of_Nodes {
	
	public static int getSum(BSTNode<Integer> root) {
		//Your code goes here.
        if( root == null)
            return 0;
        int leftsum = getSum(root.Left);
        int rightsum = getSum(root.Right);
        
        return root.data + leftsum + rightsum;
	}

	public static void main(String[] args) {
		
		TreeInput obj = new TreeInput();
		
		BSTNode<Integer> node = obj.treeInputbetter(true,false,0);
		
		int sum = getSum(node);
		System.out.print("Number of nodes: "+ sum);
	}

}
