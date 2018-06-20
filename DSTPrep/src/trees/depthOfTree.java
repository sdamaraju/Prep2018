package trees;

public class depthOfTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(null, null, 12);
		root.left  = new TreeNode(null, null, 14);
		root.right = new TreeNode(null, null, 25);
		root.left.left = new TreeNode(null, null, 19);
		root.left.right = new TreeNode(null, null, 13);
		root.left.left.left = new TreeNode(null, null, 10);
		root.left.left.left.right = new TreeNode(null, null, 11);
		TreeNode node = (maxElement(root, root));
		System.out.println(node.data);
		System.out.println(depth(root, 1));
	}
	
	public static TreeNode maxElement(TreeNode root,TreeNode maxElement){ //just for practice.
		if(root!=null){
			if((int)maxElement.data  < (int)root.data){
				maxElement = root;
			}
		}
		if(root.right !=null)
			maxElement = maxElement(root.right,maxElement); 
		
		if(root.left !=null)
			maxElement = maxElement(root.left,maxElement); 
		
		return maxElement;
	}
	
	public static int depth(TreeNode root,int depth){
		while(root!=null){
			if(root.left==null && root.right==null){
				return depth;
			}
			int depth1 = depth;
			int depth2 = depth;
			
			if(root.left != null){
				depth1 = depth(root.left,depth+1);
			}
			if(root.right != null){
				depth2 = depth(root.right,depth+1);
			}
			if(depth1 > depth2){
				return depth1;
			}else 
				return depth2;
		}
		return depth;
	}
		
}
