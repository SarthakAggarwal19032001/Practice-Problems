import java.util.Scanner;
import java.util.Stack;
class BinaryTree{
    int data;
    BinaryTree left;
    BinaryTree right;
    BinaryTree(int data){
        this.data=data;
    }
}

class Operations{
    String msg="root";
    String parent="none";// its root
    Scanner sc=new Scanner(System.in);
    BinaryTree insert(){
        System.out.println("Enter the value of "+msg+" current parent is "+parent+" or enter -1 for exit");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        BinaryTree node=new BinaryTree(data);
        msg="left";
        parent=String.valueOf(node.data);
        node.left=insert();
        msg="right";
        parent=String.valueOf(node.data);
        node.right=insert();
        msg="root";
        return node;
    }

    void print(BinaryTree currnode){
        if(currnode==null){
            return;
        }
        String output="";
        output=output+currnode.data+" => ";
        if(currnode.left!=null){
            output=output+" Left- " +currnode.left.data+", ";
        }
        if(currnode.right!=null){
            output=output+" Right- " +currnode.right.data+", ";
        }
        System.out.println(output);
        print(currnode.left);
        print(currnode.right);
    }

    //Parent->Left->Right
    void preorder(BinaryTree currnode){
        if(currnode==null){
            return;
        }
        System.out.println(currnode.data);
        preorder(currnode.left);
        preorder(currnode.right);
    }

    void iterativePreOrder(BinaryTree currnode){
       if(currnode==null){
        return;
       }
       Stack<BinaryTree>stack=new Stack<>();
       stack.push(currnode);
       while(!stack.isEmpty()){
        BinaryTree node=stack.pop();
        System.out.println(node.data);
        if(node.right!=null){
            stack.push(node.right);
        }
        if(node.left!=null){
            stack.push(node.left);
        }

       }

    }

    //Left->Right->Parent
    void postorder(BinaryTree currnode){
        if(currnode==null){
            return;
        }
        postorder(currnode.left);
        postorder(currnode.right);
        System.out.println(currnode.data);
    }

    void iterativePostorder(BinaryTree currnode){
        Stack<BinaryTree>stack=new Stack<>();
        BinaryTree temp=currnode;
        while(true){
            while(temp!=null){
                stack.push(temp);
                stack.push(temp);
                temp=temp.left;
            }
            temp=stack.pop();
            if(!stack.isEmpty() && stack.peek()==temp)
            temp=temp.right;
            else{
                System.out.println(temp.data);
                temp=null;
            }
        }
    }

    //Left->Parent->Right
    void inorder(BinaryTree currnode){
        if(currnode==null){
            return;
        }
        inorder(currnode.left);
        System.out.println(currnode.data);
        inorder(currnode.right);
    }
    public static void main(String[] args) {
        Operations op=new Operations();
        op.print(op.insert());
    }
}