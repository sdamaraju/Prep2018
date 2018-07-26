package trees;

// NOT WORKING


public class DiameterOfTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode();
		root.left = new TreeNode();
		root.right = new TreeNode();
		root.data = 1;
		root.left.left = new TreeNode();
		root.left.right = new TreeNode();
		root.left.data = 2;
		root.right.left = new TreeNode();
		root.right.right = new TreeNode();
		root.right.data = 3;
		root.left.left.data = 4;
		root.left.right.data = 5;
		root.right.left.data = 6;
		root.right.right.data = 7;
		root.left.left.left = new TreeNode();
		root.left.left.left.data=10; 
		int diameter = diameterOfTree(root);
		System.out.println(diameter);
	}
	
	public static int depthOfTree(TreeNode root){
		if(root == null){
			return 0;
		}
		else{
			return recusriveCallDepth(root, 1);
		}
	}
	private static int recusriveCallDepth(TreeNode root, int depth){
		int depth1 = depth,depth2 = depth;
		if(root.left ==null && root.right==null){
			return depth;
		}
		
		if(root.left !=null){
			depth1 = recusriveCallDepth(root.left,depth+1);
		}
		
		if(root.right !=null){
			depth2 = recusriveCallDepth(root.right,depth+1);
		}
		
		if(depth1 > depth2)
		return depth1;
		else return depth2;
	}
	
	public static int diameterOfTree(TreeNode root){
		if(root == null){
			return 0;
		}
		else{
			int maxDiameter = 1;
			return recursiveCallDiameter(root,maxDiameter,1);
		}
	}
	
	private static int recursiveCallDiameter(TreeNode root,int maxD,int depth){
		int ldepth=0,rdepth=0;
		if(root.left ==null && root.right==null){
			return depth;
		}
		
		if(root.left!=null)
			ldepth = recursiveCallDiameter(root.left, maxD,depth+1);
		
		if(root.right!=null)
			rdepth = recursiveCallDiameter(root.right, maxD,depth+1);
		
		if(maxD > ldepth+rdepth){
			maxD = ldepth+rdepth;
		}
		System.out.println(maxD);
		return maxD;
	}
	
}
