package trees;

public class RootToLeafPathSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(null, null, 12);
		root.left  = new TreeNode(null, null, 14);
		root.right = new TreeNode(null, null, 25);
		root.left.left = new TreeNode(null, null, 19);
		root.left.right = new TreeNode(null, null, 13);
		root.left.left.left = new TreeNode(null, null, 10);
		root.left.left.left.right = new TreeNode(null, null, 11);
		Boolean sumExists = rootToLeafSumExists(root, 66,(int)root.data);
		System.out.println(sumExists);
	}
	
	private static boolean rootToLeafSumExists(TreeNode root, int sum,int calcSum){
		while(root!=null){
			if(root.left==null && root.right==null){
				return (calcSum == sum);
			}
			boolean check1 = false, check2=false;
			if(root.left != null){
				check1 = rootToLeafSumExists(root.left, sum,calcSum + (int)root.left.data);
			}
			
			if(root.right != null){
				check2 = rootToLeafSumExists(root.right, sum,calcSum + (int)root.right.data);
			}
		
			if(check1 || check2){
				return true;
			}
			else return false;
			
		}
		return false;
	}

}
