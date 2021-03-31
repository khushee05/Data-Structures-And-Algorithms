package binary_trees;

public class LCA_of_BST {
	

    	public static int getLCA(BinaryTreeNode <Integer> root , int a, int b){
        if (root == null) 
        {
			return -1;
		}
        
		if (root.data == a || root.data == b)
        {
			return root.data;
		} 
        
		int c = getLCA(root.left, a, b);
		int d = getLCA(root.right, a, b);
		
        if (c == -1 && d != -1)
        {
			return d;
		} 
        else if (c != -1 && d == -1) 
        {
			return c;
		} 
        else if (c == -1 && d == -1)
        {
			return -1;
		} 
        else 
        {
			return root.data;
		}
	
}

	public static void main(String[] args) {
		
		TreeInput obj = new TreeInput();
		BinaryTreeNode<Integer> node = obj.treeInputbetter(true,false,0);
		
		int ans = getLCA(node, 4,2);
		System.out.print(ans);

	}

}
