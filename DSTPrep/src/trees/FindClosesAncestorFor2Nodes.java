package trees;

import java.util.Stack;

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
		root.left.left.left = new TreeNode();
		root.left.left.left.data=10; 
		//System.out.println(root);
		int closesAncestor = findClosestAncestor(root, 2,3);
		if(closesAncestor == -1) {System.out.println("No common ancestor"); return;}
		System.out.println("Closest Ancestor is " + closesAncestor);
	}
	
	public static int findClosestAncestor(TreeNode root,int a, int b){
		Stack st1 = new Stack();
		Stack st2 = new Stack();
		recursiveCall(root,a,st1,false);
		System.out.println(st1);
		recursiveCall(root,b,st2,false);
		System.out.println(st2);
		boolean found = false;
		while(!st1.isEmpty() || !st2.isEmpty()){
			int temp = (int)st1.peek();
			if((st1.pop()==(st2.pop()))){
				return temp;
			}
		}
		return -1;
	}
	
	public static boolean recursiveCall(TreeNode root,int key,Stack st,boolean keyFound){
		if(root==null){
			return false;
		}
		st.push(root.data);
		//System.out.println(st);
		if((int)root.data == key){
			return true;
		}
		//System.out.println(keyFound);
		if(root.left !=null && keyFound == false ){
			keyFound = recursiveCall(root.left, key, st,keyFound);
		}
		//System.out.println(keyFound);
		if(root.right !=null && keyFound == false ){
			keyFound = recursiveCall(root.right, key, st,keyFound);
		}
		if(!st.isEmpty() && !keyFound)st.pop();
		
		return keyFound;
	}
	
	

}
