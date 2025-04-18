import java.util.Stack;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import java.util.LinkedList;
import java.util.Queue;
public class TreeIntro {
    private TreeNode root;

    private  class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;

        }
    }
    public TreeNode createBinaryTree(){
        TreeNode First = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(8);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        
        TreeNode seventh = new TreeNode(7);

        root = First;
        First.left = second;
        First.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
        return root;
    }

    public void preorderBinaryTreeTraverse(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorderBinaryTreeTraverse(root.left);
        preorderBinaryTreeTraverse(root.right);
    }

    public void preOrderBinaryTreeTraverseWithoutRecursion(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            System.out.println(temp.data);
            if(temp.right != null){
                st.push(temp.right);
            }
            if(temp.left!= null){
                st.push(temp.left);
            }
        }
    }
    

    public void inOrderBinaryTreeTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inOrderBinaryTreeTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderBinaryTreeTraversal(root.right);
    }

    public void inOrderBinaryTreeTraversalWithoutUsingRecursion(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while(!st.isEmpty() || temp!=null){
            if(temp!=null){
                st.push(temp);
                temp= temp.left;
            }
            else{
                temp = st.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
    }

    public void postOrderBinaryTreeTraversal(TreeNode root){
        if(root==null){
            return;
        }
        postOrderBinaryTreeTraversal(root.left);
       
        postOrderBinaryTreeTraversal(root.right); 
        System.out.print(root.data+" ");


    }

   
    public void postOrderBinaryTreeTraverseWithoutRecursion(TreeNode root){
        if(root==null){
            return;
        }
       TreeNode current = root;
       Stack<TreeNode> st = new Stack<>();
       while(current!=null || !st.isEmpty()){
        if(current!=null){
            st.push(current);
            current = current.left;
        }
        else{
            TreeNode temp = st.peek().right;
            if(temp == null){
                temp = st.pop();
                System.out.print(temp.data+" ");
                while(!st.isEmpty() && temp == st.peek().right){
                    temp = st.pop();
                    System.out.print(temp.data+" ");
                }
            }
            else{
                current = temp;
            }
        }

       }
    }

    public void levelOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>(); {
            q.offer(root);
            while(!q.isEmpty()){
                TreeNode temp = q.poll();
                System.out.print(temp.data+" ");

                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            
        }
    }

    public int findMax(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left= findMax(root.left);
        int right = findMax(root.right);

        if(left>result)
            result = left;
        if(right>result)
      result = right;
        return result;
    }
    
public static void main(String[] args) {
    TreeIntro t = new TreeIntro();
    
    t.preorderBinaryTreeTraverse(t.createBinaryTree());
    System.out.println();

    t.inOrderBinaryTreeTraversal(t.createBinaryTree());
    System.out.println();

    t.inOrderBinaryTreeTraversalWithoutUsingRecursion(t.createBinaryTree());
    System.out.println();

    t.postOrderBinaryTreeTraversal(t.createBinaryTree());
    System.out.println();

    t.postOrderBinaryTreeTraverseWithoutRecursion(t.createBinaryTree());
    System.out.println();

    t.levelOrderTraversal(t.createBinaryTree());
    System.out.println();


    System.out.print("The maximum value in this treenode is:"+t.findMax(t.createBinaryTree()));

   





   
}
}