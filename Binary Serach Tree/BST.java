class BSTNode{
    int data;
    BSTNode left;
    BSTNode right;

    BSTNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
    class Operation{
        BSTNode root;

        BSTNode insert(int data, BSTNode currnode){
            if(currnode==null){
                currnode=new BSTNode(data);
                return currnode;
            }

            if(data<currnode.data){
                currnode.left=insert(data,currnode.left);
            }
            else if(data>currnode.data){
                currnode.right=insert(data,currnode.right);
            }
            return currnode;
            
        }

        BSTNode insert(int data){
        root=insert(data,root);
        return root;
        }

        void print(BSTNode currnode){ //inorder
            if(currnode==null){
                return;
            }
            print(currnode.left);
            System.out.println(currnode.data);
            print(currnode.right);
        }

        boolean search(BSTNode currnode,int t){
            if(currnode==null){
                return false;
            }
            if(currnode.data==t){
                return true;
            }
            if(t<currnode.data){
                return search(currnode.left,t);
            }
            else if(t>currnode.data){
                return search(currnode.right, t);
            }
             return false;
        }

        boolean iterativesearch(BSTNode root,int t){
            if(root==null){
                return false;
            }
            BSTNode currnode=root;
            while(currnode!=null){
                if(t==currnode.data)
                return true;
                if(t<currnode.data){
                    currnode=currnode.left;
                    continue;
                }
                else if(t>currnode.data){
                    currnode=currnode.right;
                    continue;
                }
            }
            return false;
        }

    }




public class BST{
    public static void main(String[] args) {
        Operation op=new Operation();
        op.insert(10);
        op.insert(8);
        op.insert(20);
        op.insert(30);
        op.insert(7);
        op.insert(5);
        op.insert(6);
        op.insert(9);
        BSTNode bst=op.insert(7);
        op.print(bst);
        System.out.println("------------------Seraching------------------------------");
        if(op.search(bst, 9)){
            System.out.println("Found");
        }
        if(op.search(bst, 100))
        System.out.println("Not Found");
        System.out.println("Through Iterative Searching.......");
        System.out.println(op.iterativesearch(bst, 9)?"Found":"Not Found");
        System.out.println(op.iterativesearch(bst, 100)?"Found":"Not Found");
    }
}