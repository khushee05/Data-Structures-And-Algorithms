package BST;

import java.util.*;
public class Opeartions {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		BSTNode<Integer> root = new BSTNode<Integer>();
		System.out.println("Enter the data");
		root.data = scan.nextInt();
		
		BSTNode<Integer> leftchild = new BSTNode<Integer>();
		System.out.println("Enetr Left Child");
		root.Left = leftchild;
		leftchild.data = scan.nextInt();
		
		BSTNode<Integer> rightchild = new BSTNode<Integer>();
		System.out.println("Enetr right Child");
		root.Right = rightchild;
		rightchild.data = scan.nextInt();
		
		System.out.println("Root is: " + root.data);
		System.out.println("Right Child is: " + root.Right.data);
		System.out.println("Left Child is: " + root.Left.data);
		
	}
}
