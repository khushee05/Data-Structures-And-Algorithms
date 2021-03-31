package binary_trees;

public class SearchNodeInBST {
	
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		
        if(root == null)
            return false;
        if(root.data == k)
            return true;
        
     
        if(root.data < k)
        {
            return searchInBST(root.right, k);
             
        }
      	if(root.data > k)
            return searchInBST(root.left, k);
        return false;
	}

	public static void main(String[] args) {
		
		TreeInput obj = new TreeInput();
		BinaryTreeNode<Integer> node = obj.treeInputbetter(true,false,0);
		
		boolean b = searchInBST(node,3);
		System.out.print(b);
	}

}
