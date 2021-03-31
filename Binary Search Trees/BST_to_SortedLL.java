package binary_trees;

class LinkedList_for_BST<T>{
	
	T data;
	LinkedList_for_BST<T> next;
	LinkedList_for_BST(T data)
	{
		this.data = data;
		this.next = null;
	}
	
}

class Pair1<T,V>{
	T head;
	V tail;
	public Pair1(T head,V tail) {
		this.head = head;
		this.tail = tail;
	}
}

public class BST_to_SortedLL {
	
	
	public static LinkedList_for_BST<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        
        return BSTToSortedLL2(root).head;

	}
	
	public static Pair1<LinkedList_for_BST<Integer>,LinkedList_for_BST<Integer>> BSTToSortedLL2(BinaryTreeNode<Integer> root){

		if( root==null ) {
			Pair1<LinkedList_for_BST<Integer>,LinkedList_for_BST<Integer>> ansPair = new Pair1<LinkedList_for_BST<Integer>, LinkedList_for_BST<Integer>>(null, null);
			return ansPair;
		}
		Pair1<LinkedList_for_BST<Integer>,LinkedList_for_BST<Integer>> leftPair = BSTToSortedLL2(root.left);
		Pair1<LinkedList_for_BST<Integer>,LinkedList_for_BST<Integer>> rightPair = BSTToSortedLL2(root.right);
		LinkedList_for_BST<Integer> newNode = new LinkedList_for_BST<Integer>(root.data);

		if(leftPair.tail!=null)
			leftPair.tail.next = newNode;
		else
			leftPair.head = newNode;
		if(rightPair.head!=null)
			newNode.next = rightPair.head;
		else
			rightPair.tail = newNode;
		Pair1<LinkedList_for_BST<Integer>,LinkedList_for_BST<Integer>> ansPair = new Pair1<LinkedList_for_BST<Integer>, LinkedList_for_BST<Integer>>(leftPair.head, rightPair.tail);
		return ansPair;

	}

	
	public static void main(String[] args) {
		
		TreeInput obj = new TreeInput();
		BinaryTreeNode<Integer> node = obj.treeInputbetter(true,false,0);
				
		LinkedList_for_BST LL = constructLinkedList(node);
		
		LinkedList_for_BST temp = LL;
		while(temp!=null)
		{
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		
	}

}
