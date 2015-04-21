import java.util.ArrayList;
import java.util.List;


class MinStack {
    int topIndex;
    List<MinStackNode> elems;
    public MinStack(){
        topIndex=-1;
        elems=new ArrayList<MinStackNode>();
    }
    public void push(int x) {
        MinStackNode node=new MinStackNode(x);
        if(topIndex<=-1){
            node.min=x;
        }else{
            MinStackNode lastElem=elems.get(topIndex);
            node.min=lastElem.min>x?x:lastElem.min;
        }
        elems.add(node);
        ++this.topIndex;
    }

    public void pop() {
        elems.remove(this.topIndex--);
    }

    public int top() {
        return elems.get(topIndex).val;
    }

    public int getMin() {
        return elems.get(topIndex).min;
    }
    
    public static void main(String[]args){
    	MinStack stack=new MinStack();
    	stack.push(-3);
    	int min=stack.getMin();
    }
    class MinStackNode{
        public int val;
        public int min;
        public MinStackNode(int val){
            this.val=val;
        }
    }
}