package BST;

public class BSTNode<T> {
	
	T data;							//Common node to create BST
	BSTNode<T> Left;
	BSTNode<T> Right;
	
	BSTNode( T data)
	{
		this.data = data;
	}
}
