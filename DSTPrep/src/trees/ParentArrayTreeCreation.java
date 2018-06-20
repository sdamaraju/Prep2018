package trees;

public class ParentArrayTreeCreation {

	public static void main(String[] args) {
		int [] parentArray = {-1, 0, 0, 1, 1, 3, 5};
		TreeNode root = constructTree(parentArray);
		System.out.println(root.data);
		System.out.println(root.left.data);
		System.out.println(root.right.data);
		System.out.println(root.left.left.data);
		System.out.println(root.left.right.data);
		System.out.println(root.left.left.left.data);
		System.out.println(root.left.left.left.left.data);
		}
	
	private static TreeNode constructTree(int parentArray[]){
		TreeNode root = null;
		for(int i=0;i<parentArray.length;i++){
			if(parentArray[i]==-1){
				root = new TreeNode(null,null,i);
				break;
			}
		}
		if(root == null){
			return null; // root node not found.
		}	
		
		boolean result = constructTree(root,parentArray);
		return root;
	}
	
	private static Boolean constructTree(TreeNode root,int[] parentArray){
		while(root!=null){
			//System.out.print((Integer)root.data);
			int i=0;
			int leftSet = 0;
			int rightSet = 0;
			while(i<parentArray.length){
				if((Integer)root.data == parentArray[i] && leftSet == 0){
					root.left = new TreeNode(null,null,i);
					leftSet  = 1;
					i++;
					continue;
				}
				if((Integer)root.data == parentArray[i] && rightSet == 0){
					root.right = new TreeNode(null,null,i);
					rightSet = 1;
					break;
				}
				i++;
			}
			//System.out.println(root);
			Boolean check1 = false;
			Boolean check2 = false;
			if(root.left !=null)
				  check1 = constructTree(root.left,parentArray);
			if(root.right!=null)
				check2= constructTree(root.right,parentArray);
			if(!check1 || check2){
				return false;
			}
		}	
		return false;
	}
	
	

}
