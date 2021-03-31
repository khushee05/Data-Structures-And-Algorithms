/*
Given a binary search tree and data of two nodes, find 'LCA' (Lowest Common Ancestor) of the given two nodes in the BST.
LCA of two nodes A and B is the lowest or deepest node which has both A and B as its descendants. 

1. If out of 2 nodes only one node is present, return that node. 
2. If both are not present, return -1.
3. If both are present return LCA.
*/

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
