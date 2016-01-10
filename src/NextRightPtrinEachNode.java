/**
 * Created by kaijiezhou on 12/28/15.
 */
public class NextRightPtrinEachNode {
    public void connect(TreeLinkNode root) {
        if (root == null || root.left == null || root.right == null) {
            return;
        }
        root.left.next = root.right;
        TreeLinkNode left = root.left, right = root.right;
        while (left.right != null && right.left != null) {
            left.right.next = right.left;
            left = left.right;
            right = right.left;
        }
        connect(root.left);
        connect(root.right);
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;

    TreeLinkNode(int x) {
        val = x;
    }
}

