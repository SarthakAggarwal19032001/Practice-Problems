import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
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
        System.out.println("Through Iterative PreOrder");
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
        System.out.println("Through Iterative PostOrder");
        Stack<BinaryTree>stack=new Stack<>();
        BinaryTree temp=currnode;
        while(temp!=null || !stack.isEmpty()){
            while(temp!=null){
            stack.push(temp);
            stack.push(temp);
            temp=temp.left;
        }
        temp=stack.pop();
        if(!stack.isEmpty() && temp==stack.peek()){
            temp=temp.right;
        }
        else{
            System.out.println(temp.data);
            temp=null;
        }
    }

}
        // ArrayList<Integer>list=new ArrayList<>();
        // stack.push(currnode);
        // while(!stack.isEmpty()){
        //     BinaryTree node=stack.pop();
        //     list.add(node.data);
        //     if(node.left!=null){
        //         stack.push(node.left);
        //     }
        //     if(node.right!=null){
        //         stack.push(node.right);
        //     }
        // }
        // Collections.reverse(list);
        // System.out.println("Through Iterative PostOrder");
        // System.out.println(list);
    

        // BinaryTree temp=currnode;
        // while(true){
        //     while(temp!=null){
        //         stack.push(temp);
        //         stack.push(temp);
        //         temp=temp.left;
        //     }
        // if(stack.isEmpty()){
        //     return;
        // }
        //     temp=stack.pop();
        //     if(!stack.isEmpty() && stack.peek()==temp)
        //     temp=temp.right;
        //     else{
        //         System.out.println(temp.data);
        //         temp=null;
        //     }
        // }

    //Left->Parent->Right
    void inorder(BinaryTree currnode){
        if(currnode==null){
            return;
        }
        inorder(currnode.left);
        System.out.println(currnode.data);
        inorder(currnode.right);
    }

    void iterativeInorder(BinaryTree currnode){
        System.out.println("Through Iterative Inorder");
        BinaryTree temp=currnode;
        Stack<BinaryTree>stack=new Stack<>();
        while(temp!=null || !stack.isEmpty()){    //TC- O(N)
            while(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            temp=stack.pop();
            System.out.println(temp.data);
            temp=temp.right;
        }
        // while(true){
        //     while(temp!=null){
        //         stack.push(temp);
        //         stack.push(temp);
        //         temp=temp.left;
        //     }
        //     if(stack.isEmpty()){
        //         return;
        //     }
        //     temp=stack.pop();
        //     if(!stack.isEmpty() && stack.peek()==temp){
        //         System.out.println(temp.data);
        //         temp=temp.right;
        //     }
        //     else{
        //         temp=null;
        //     }
        // }
    }






// Breadth First Search Traversal...............................
//Also called level order traversal or Horizontal Traversal

//Through Recursion----------------
    void levelordertrav(BinaryTree currnode){
    Queue<BinaryTree>queue=new LinkedList<>();
    queue.offer(currnode);
    while(!queue.isEmpty()){
        int count=queue.size();
        for(int i=0;i<count;i++){
        BinaryTree node=queue.poll();
        System.out.print(node.data+" ");
        if(node.left!=null)
        queue.offer(node.left);
        if(node.right!=null)
        queue.offer(node.right);
        }
        System.out.println();
    }
}


int height(BinaryTree root){
    if(root==null){
        return 0;
    }
    int leftheight=height(root.left);
    int rightheight=height(root.right);
    return 1+Math.max(leftheight, rightheight);
}


int heightIterative(BinaryTree root){
    Queue<BinaryTree>queue=new LinkedList<>();
    queue.offer(root);
    int height=0;
    while(!queue.isEmpty()){
        height++;
        int count=queue.size();
        for(int i=0;i<count;i++){
        BinaryTree node=queue.poll();
        if(node.left!=null)
        queue.offer(node.left);
        if(node.right!=null)
        queue.offer(node.right);
        }
    }
    return height;
}

int maxelemnet(BinaryTree root){
    Queue<BinaryTree>queue=new LinkedList<>();
    queue.offer(root);
    int max=0;
    while(!queue.isEmpty()){
        int count=queue.size();
        for(int i=0;i<count;i++){
        BinaryTree node=queue.poll();
        if(node.data>max){
            max=node.data;
        }
        if(node.left!=null)
        queue.offer(node.left);
        if(node.right!=null)
        queue.offer(node.right);
        }
    }
    return max;
}


int minelemnet(BinaryTree root){
    Queue<BinaryTree>queue=new LinkedList<>();
    queue.offer(root);
    int min=Integer.MAX_VALUE;
    while(!queue.isEmpty()){
        int count=queue.size();
        for(int i=0;i<count;i++){
        BinaryTree node=queue.poll();
        if(node.data<min){
            min=node.data;
        }
        if(node.left!=null)
        queue.offer(node.left);
        if(node.right!=null)
        queue.offer(node.right);
        }
    }
    return min;
}



void printleafs(BinaryTree currnode){
    if(currnode==null){
        return;
    }
    if(currnode.left==null && currnode.right==null){
        System.out.print(currnode.data+" ");
        return;
    }
    printleafs(currnode.left);
    printleafs(currnode.right);

}


int SumOfLeaf(BinaryTree root){
    Stack<BinaryTree>stack=new Stack<>();
    stack.push(root);
    int sum=0;
    while(!stack.isEmpty()){
        BinaryTree node=stack.pop();
        if(node.right==null && node.left==null){
            sum=sum+node.data;
        }
        else{
        if(node.right!=null){
            stack.push(node.right);
        }
        if(node.left!=null){
            stack.push(node.left);
        }
    }
    }
    return sum;

}



int  countNodes(BinaryTree root){
        Queue<BinaryTree>queue=new LinkedList<>();
        queue.offer(root);
        int c=0;
        while(!queue.isEmpty()){
            BinaryTree node=queue.poll();
            c++;
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
        return c;
}

void leftview(BinaryTree root){
    Queue<BinaryTree>queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int count=queue.size();
        for(int i=0;i<count;i++){
        BinaryTree node=queue.poll();
        if(i==0)
        System.out.print(node.data);
        if(node.left!=null)
        queue.offer(node.left);
        if(node.right!=null)
        queue.offer(node.right);
        }
        System.out.println();
    }
}

int maxlevel=0;
void leftviewRecursion(BinaryTree currnode,int level){
    if(currnode==null){
        return;
    }
    if(maxlevel<level){
        System.out.println(currnode.data);
        maxlevel=level;
    }
    leftviewRecursion(currnode.left,level+1);
    leftviewRecursion(currnode.right, level+1);
}


void rightview(BinaryTree root){
    Queue<BinaryTree>queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int count=queue.size();
        for(int i=0;i<count;i++){
        BinaryTree node=queue.poll();
        if(i+1==count)
        System.out.print(node.data);
        if(node.left!=null)
        queue.offer(node.left);
        if(node.right!=null)
        queue.offer(node.right);
        }
        System.out.println();
    }
}



int mlevel=0;
void rightviewRecursion(BinaryTree currnode,int level){
    if(currnode==null){
        return ;
    }
    if(mlevel<level){
        System.out.println(currnode.data);
        mlevel=level;
    }
    rightviewRecursion(currnode.right, level+1);
    rightviewRecursion(currnode.left,level+1);
}


void VerticalOrder(BinaryTree root){
    TreeMap<Integer,ArrayList<Integer>>map=new TreeMap<>();   //key Wise sorting
    int distance=0;
    VeticalOrderHelper(root,map,distance);
    for(Map.Entry<Integer,ArrayList<Integer>>m:map.entrySet()){
        System.out.println(m.getKey()+"->"+m.getValue());
    }
}
void VeticalOrderHelper(BinaryTree currnode,TreeMap<Integer,ArrayList<Integer>> map,int currdistance){
    //Termination case
    if(currnode==null){
        return;
    }
    //if it doesn't contains the key
    if(map.get(currdistance)==null){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(currnode.data);
        map.put(currdistance, list);
    }
    //if it contains a key
    else{
        ArrayList<Integer>list=map.get(currdistance);
        list.add(currnode.data);
        map.put(currdistance, list);
    }
    VeticalOrderHelper(currnode.left, map, currdistance-1);
    VeticalOrderHelper(currnode.right, map, currdistance+1);
}

void VerticalIterative(BinaryTree root){
    Stack<BinaryTree>stack=new Stack<>();
    TreeMap<Integer,ArrayList<Integer>>map=new TreeMap<>();
    stack.push(root);
    int distance=0;
    while(!stack.isEmpty()){
        BinaryTree node=stack.pop();
        if(map.get(distance)==null){
            ArrayList<Integer>list=new ArrayList<>();
            list.add(node.data);
            map.put(distance, list);
        }
        else{
            ArrayList<Integer>list=map.get(distance);
            list.add(node.data);
            map.put(distance, list);
        }
        if(node.left==null && node.right==null){
            distance=distance+1;
            if(distance==0 || distance==1){
                distance=distance+1;
            }
    }
        else{
            if(node.right!=null){
                stack.push(node.right);
                distance=distance+1;
            }
            if(node.left!=null && node.right!=null){
                stack.push(node.left);
                distance=distance-2;
            }
            else if(node.left!=null && node.right==null){
                stack.push(node.left);
                distance=distance-1;
            }
        }
    }
    for(Map.Entry<Integer,ArrayList<Integer>>m:map.entrySet()){
        System.out.println(m.getKey()+"->"+m.getValue());
    }
    }


    public static void main(String[] args) {
        Operations op=new Operations();
        BinaryTree bt=op.insert();
        op.preorder(bt);
        op.iterativePreOrder(bt);
        System.out.println("------------------------------------------------------------------------");
        op.inorder(bt);
        op.iterativeInorder(bt);
        System.out.println("------------------------------------------------------------------------");
        op.postorder(bt);
        op.iterativePostorder(bt);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Through BFT");
        op.levelordertrav(bt);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Height of tree "+op.height(bt));
        System.out.println("Number of Node in tree: "+op.countNodes(bt));
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Left view......");
        op.leftview(bt);
        System.out.println("Through Recursion");
        op.leftviewRecursion(bt, 1);
        System.out.println("Right view......");
        op.rightview(bt);
        System.out.println("Through Recursion");
        op.rightviewRecursion(bt, 1);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Maximum Element "+op.maxelemnet(bt));
        System.out.println("Minimum Element "+op.minelemnet(bt));
        System.out.println("Leaves Of Trees are....");
        op.printleafs(bt);
        System.out.println();
        System.out.println("Sum Of Leaves..."+op.SumOfLeaf(bt));
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Vertical order");
        op.VerticalOrder(bt);
        System.out.println("Vertical Order Iterative");
        op.VerticalIterative(bt);
        


    }
}