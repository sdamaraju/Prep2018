package trees;

public class TreeNode<E> {
	
	TreeNode left;
	TreeNode right;
	E data;
	StringBuffer buf = new StringBuffer();
	
	TreeNode(TreeNode left,TreeNode right,E data){
		this.data=data;
		this.right = right;
		this.left = left;
	}
	TreeNode(){
		
	}
	
	public String toString(){
		TreeNode root = this;
		recursiveCall(root);
		return buf.toString();
	} 
	
	private StringBuffer recursiveCall(TreeNode root){
			if(root == null){
				return null;
			}else{
				buf.append(root.data + " --> ");
				recursiveCall(root.left);
				recursiveCall(root.right);
			}
			return buf;
	}

}
