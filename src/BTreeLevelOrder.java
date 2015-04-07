import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BTreeLevelOrder {
	public List<List<Integer>> levelOrder(TreeNode root) {
		 List<List<Integer>> travList=new ArrayList<List<Integer>>();
	        if(root!=null){
	            Queue<TreeNode> levelQueue=new ArrayDeque<TreeNode>();
			    TreeNode node=root;
			    int childNum;
			    int nextChildNum=1;
			    levelQueue.add(node);
			
			    while (!levelQueue.isEmpty()){
				    childNum=nextChildNum;
				    nextChildNum=0;
				    List<Integer> levelList=new ArrayList<Integer>();
				    for(int i=0;i<childNum;i++){
					    node=levelQueue.poll();
					    levelList.add(node.val);
					    if(node.left!=null){
						    levelQueue.add(node.left);
						    nextChildNum++;
					    }
					    if(node.right!=null){
						    levelQueue.add(node.right);
						    nextChildNum++;
					    }
				    }
				    travList.add(levelList);
			    }
	        }
			return travList; 
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
