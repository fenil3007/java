import java.util.Stack;

public class BinarySearchTree {

    private TreeNode root;

    public static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void inOrderBinaryTreeTraversalWithoutUsingRecursion(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while (!st.isEmpty() || temp != null) {
            if (temp != null) {
                st.push(temp);
                temp = temp.left;
            } else {
                temp = st.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public boolean searchKey(TreeNode root, int key) {

        if (root == null) {
            return false;
        } else if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return searchKey(root.left, key);
        } else if (root.data < key) {
            return searchKey(root.right, key);
        }
        return false;
    }

    public boolean validateBinarySearchTree(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }
        boolean left = validateBinarySearchTree(root.left, min, root.data);
        if (left) {
            boolean right = validateBinarySearchTree(root.right, root.data, max);
            return right;
        }
        return false;
    }


    public void search(int[][] matrix,int n,int x){
        int i=0;
        int j = n-1;
        while(i<n && j>=0){
        if(matrix[i][j]==x){
            System.out.println("x is found at - "+i+","+j);
            return;
        }
        if(matrix[i][j]>x){
            j--;
        }
        else{
            i++;
        }
        }
        System.out.println("Sorry your element is not there in this matrix try to found another place.");
    }


    void printSpiralMatrix(int a[][],int r,int c){
        int i,k=0,l=0;
        while(k<r && l<c){
            for(i=l;i<c;i++){
                System.out.print(a[k][i]+" ");
            }
            k++;
            for(i=k;i<r;i++){
                System.out.print(a[i][c-1]+" ");
            }
            c--;
            if(k<r){
            for(i=c-1;i>=l;i--){
                System.out.print(a[r-1][i] + " ");
            }

            r--;
        }
        if(l<c){
            for(i=r-1;i>=k;i--){
                System.out.print(a[i][l]+" ");
            }
            l++;
        }
    }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(10);
        bst.insert(7);
        bst.insert(13);

        bst.inOrderBinaryTreeTraversalWithoutUsingRecursion(bst.root);
        int n = 10;
        boolean r = bst.searchKey(bst.root, n);
        System.out.println("Element " + n + " is Present In the tree or not?" + r);

        boolean res = bst.validateBinarySearchTree(bst.root, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println("Is IT valid binary search tree or not? : " + res);


       int a[][] = new int[4][4];
       a[0][0] = 1;
       a[0][1] = 2;
       a[0][2] = 3;
       a[0][3] = 4;
       a[1][0] = 5;
       a[1][1] = 6;
       a[1][2] = 7;
       a[1][3] = 8;
       a[2][0] = 9;
       a[2][1] = 10;
       a[2][2] = 11;
       a[2][3] = 12;
       a[3][0] = 13;
       a[3][1] = 14;
       a[3][2] = 15;
       a[3][3] = 16 ;


       bst.search(a, 4, 49);
       bst.printSpiralMatrix(a, 4, 4);
    }
}