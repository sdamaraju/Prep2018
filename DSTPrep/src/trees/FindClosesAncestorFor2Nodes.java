package trees;

import stackImplementation.StackLL;

public class FindClosesAncestorFor2Nodes {

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
		//System.out.println(root);
		int closesAncestor = findClosestAncestor(root, 4,5);
	}
	
	public static int findClosestAncestor(TreeNode root, int node1,int node2){
		TreeNode head = root;
		/*StackLL st1 = new StackLL();
		while(head != null){
			st1.push(head.data);
			if((Integer)head.data == node1){
				break;
			}else{
				head = head.left;
			}
		} 
		StackLL st2 = new StackLL();
		while(head != null){
			st1.push(head.data);
			if((Integer)head.data == node1){
				break;
			}else{
				head = head.left;
			}
		}*/
		StackLL st1 = new StackLL();
		st1 = recursivecall(head,st1,node1);
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		return node2;
	}
	
	static StackLL recursivecall(TreeNode root,StackLL st,int value){
		if(root == null){
			//st.pop();
			return st;
		}
		st.push(root.data);
		System.out.println(st);
		if((Integer)root.data == value){
			return st;
		}else{
			st = recursivecall(root.left,st,value);
			st = recursivecall(root.right,st,value);
			 return st;
		}
		
	}

}
