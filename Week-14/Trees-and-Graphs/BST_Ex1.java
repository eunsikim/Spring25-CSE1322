class node{
    int data;
    node left;
    node right;

    public node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

class BST{
    node root;

    public BST(){
        root = null;
    }

    public void add(int data){
        if(root == null){
            root = new node(data);
            return;
        }

        root = add(root, data);
    }

    private node add(node current, int data){
        if (current == null){
            return new node(data);
        }
        if(current.data < data){
            current.right = add(current.right, data);
        }
        else if(current.data > data){
            current.left = add(current.left, data);
        }

        return current;
    }

public void print(node current){
    if(current != null){
        print(current.left);
        System.out.print(current.data + " ");
        print(current.right);
    }

}
}

public class BST_Ex1 {
    public static void main(String[] args) {
        BST myBst = new BST();

        int[] arr = {15, 25, 8, 4, 10, 30, 20, 6, 2, 12, 17, 36, 24, 9, 28};

        for(int x : arr){
            myBst.add(x);
        }

        myBst.print(myBst.root);
    }
}
