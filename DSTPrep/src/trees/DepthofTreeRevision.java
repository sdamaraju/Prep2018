package trees;

public class DepthofTreeRevision {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(null, null, 12);
		root.left  = new TreeNode(null, null, 14);
		root.right = new TreeNode(null, null, 25);
		root.left.left = new TreeNode(null, null, 19);
		root.left.right = new TreeNode(null, null, 13);
		root.left.left.left = new TreeNode(null, null, 10);
	//	root.left.left.left.right = new TreeNode(null, null, 11);
		//TreeNode node = (maxElement(root, root));
		//System.out.println(node.data);
		System.out.println(depth(root, 1));
	}
	
	
	public static int depth(TreeNode root,int depth){
		if(root.left ==null && root.right ==null){
			return depth;
		}
		int depth1 = depth;
		int depth2 = depth;
		if(root.left!=null){
			depth1 = depth(root.left,depth+1);
		}
		if(root.right!=null){
			depth2 = depth(root.right,depth+1);
		}
		
		if(depth1 > depth2){
			return depth1;
		}else return depth2;
	}
	
	public static boolean rootToSum(TreeNode root,int sum,int checkSum){
		if(root.left!=null && root.right!=null){
			
			return checkSum == sum;
		}
		boolean checkSum1 = false, checkSum2 = false;
		if(root.left!=null)
			checkSum1 = rootToSum(root.left,sum,checkSum + (int)root.data);
		if(root.right!=null)
		checkSum2 = rootToSum(root.right,sum,checkSum+(int)root.data);	
		if(checkSum1 || checkSum2)
		return true;
		else return false;
	}
	
}
