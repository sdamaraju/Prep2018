package trees;

public class TreeMaxElelment {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(null, null, 12);
		root.left  = new TreeNode(null, null, 14);
		root.right = new TreeNode(null, null, 15);
		root.left.left = new TreeNode(null, null, 19);
		root.left.right = new TreeNode(null, null, 13);
		root.right.left = new TreeNode(null, null, 10);
		root.right.right = new TreeNode(null, null, 11);
		System.out.println(root);
		System.out.println(((TreeNode)maxElement(root)).data);
	}
	
	public static TreeNode maxElement(TreeNode root){
		TreeNode maxElement = root;
		maxElement = recursiveCallMax(root,maxElement);
		return maxElement;
	}
	
	private static TreeNode recursiveCallMax(TreeNode root, TreeNode maxElement){
		if(root != null){
			System.out.println("checking if root data "+ root.data +" is greater than maxElement data "+maxElement.data);
			if((Integer)root.data > (Integer)maxElement.data){
				maxElement=root;
				System.out.println(maxElement.data);
			}
			maxElement = recursiveCallMax(root.left,maxElement);
			maxElement = recursiveCallMax(root.right,maxElement);
			return maxElement;
		}else
			return maxElement;
	}
}
