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


        BSTNode max(BSTNode node){
            BSTNode n=node;
            while(node.right!=null){
                 n=node;
                node=node.right;
            }
            return n;
        }

        void delete(BSTNode currnode,BSTNode parent,boolean isleft,int val){
            if(val<currnode.data){
                delete(currnode.left, currnode, true, val);
            }
            else if(val>currnode.data){
                delete(currnode.right, currnode, false, val);
            }
            // val found
            else{
            //case 1: it is leaf node simply delete it
            if(currnode.left==null && currnode.right==null){
                if(isleft){
                    parent.left=null;
                }
                else{
                    parent.right=null;
                }
            }
            //case 2:  if left is null but currnode right is not null
            else if(currnode.left==null && currnode.right!=null){
                if(isleft){
                    parent.left=currnode.right;
                }
                else{
                    parent.right=currnode.right;
                }
            }

            //case3: if right is null and left is not null of currnode
            else if(currnode.left!=null && currnode.right==null){
                if(isleft){
                    parent.left=currnode.left;
                }
                else{parent.right=currnode.left;

                }
            }
            //case 4: if left and right both are null...................
            //We have two choices either find left max or right min i.e make it a leaf node and simply delete it
            //Either now swap it and again make the recursive so that now other cases become valid and the node is deleted --or--- just copy its value of min or max in the currnode and call  the function now to delete that max or min element in rest of the node

            else{
                BSTNode leftmax=max(currnode.left);
                int t=currnode.data;
                currnode.data=leftmax.data;
                leftmax.data=t;
                delete(currnode.left, currnode, true, val);
            }

            /*
                --or--
                if (currentNode.left != null && currentNode.right != null) {
                // 2 Choice a) Left Max b) Right Min
                BSTNode temp = currentNode;
                int leftMax = this.max(temp.left); // Leftmax
                currentNode.data = leftMax;
                delete(temp.left, currentNode, true, leftMax);
            }





            */
        }
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
        System.out.println(" After Deletion");
        op.delete(bst, bst, true, 8);
        op.print(bst);
    }
}