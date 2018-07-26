package trees;

public class BinarySearchTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(null, null, 12);
		root.left  = new TreeNode(null, null, 8);
		root.right = new TreeNode(null, null, 25);
		root.left.left = new TreeNode(null, null, 5);
		root.left.left.right = new TreeNode(null, null, 6);
		root.left.right = new TreeNode(null, null, 9);
		root.left.left.left = new TreeNode(null, null, 4);
		
		Boolean nodeFound = nodeExistsUsingBinarySearch(root, 26);
		System.out.println(nodeFound);
	}

	public static Boolean nodeExistsUsingBinarySearch(TreeNode root,int key){
		if((int)root.data == key){
			return true;
		}
		if (key > (int)root.data){
			if(root.right!=null)
			return nodeExistsUsingBinarySearch(root.right, key);
			return false;
		}
		if (key < (int)root.data){
			if(root.left!=null)
			return nodeExistsUsingBinarySearch(root.left, key);
			return false;
		}
		return false;
	} 
}
