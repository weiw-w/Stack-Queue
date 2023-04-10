public class Node{
    public String value;
    public Node left;
    public Node right;
    public Node parent;

    public Node(String v){
        value = v;
    }

    public Node(String v, Node p){
        value = v;
        parent = p;
    }

    public Node addLeft(String v){
        Node l = new Node(v,this);
        this.left = l;
        return this.left;
    }

    public Node addRight(String v){
        Node r = new Node(v,this);
        this.right = r;
        return this.right;
    }
    
    public boolean equals(Node n){
        if (!this.value.equals(n.value))
            return false;
        if (this.left != null){
            if (n.left == null)
                return false;
            if (!this.left.equals(n.left))
                return false;
        }
        if (this.right != null){
            if (n.right == null)
                return false;
            if (!this.right.equals(n.right))
                return false;
        }
        if (this.parent != null){
            if (n.parent == null)
                return false;
            if (!this.parent.equals(n.parent))
                return false;
        }
        return true;
    }

    public String toString(){
        String lN = "";
        if (this.left!= null)
            lN = this.left.toString;
        String rN = "";
        if (this.right!= null)
            rN = this.right.toString;
        return "(" + this.value + " " + lN + " " + lN + ")";
    }

public static void main(String[] args) {
//in order to traverse in constant space and linear time, tree shouldn't be a tree for a while
}
}

