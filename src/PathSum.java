
public class PathSum {
	    boolean flag;
	    public boolean hasPathSum(TreeNode root, int sum) {
	        flag=false;
	        return findPath(root,sum,0);
	    }
	    private boolean findPath(TreeNode node, int sum, int current){
	        if(node!=null&&!flag){
	            current+=node.val;
	            if(current==sum&&node.right==null&&node.left==null){
	                    flag=true;
	            }else{
	                
	                findPath(node.left,sum,current);
	                if(!flag){
	                    findPath(node.right,sum,current);
	                }
	            }
	        }
	        return flag;
	        
	    }
	

	public static void main(String[] args) {
		
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(-2);
		root.right=new TreeNode(-3);
		root.left.left=new TreeNode(1);
		root.left.left.left=new TreeNode(-1);
		root.left.right=new TreeNode(3);
		root.right.left=new TreeNode(-2);
		System.out.println(new PathSum().hasPathSum(root,-1));
	}

}


 
