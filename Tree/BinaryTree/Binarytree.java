package Tree.BinaryTree;

import java.util.Scanner;

import stack.stackmain;

 class Binarytree {
    
    public Binarytree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;


        public Node(int value){
            this.value = value;

        }
    }
    private Node root;

    // insertion 
   public void populate(Scanner scanner){
    System.out.println("enter the root node");
    int value = scanner.nextInt();
    root  = new Node(value);
    populate(scanner,root);
   }

   private void populate(Scanner scanner, Node node){
     System.out.println(" do you want to enter the left of" + node.value);
     boolean left = scanner.nextBoolean();
     if(left){
        System.out.println("Ente the value of the left of" + node.value);
        int value = scanner.nextInt();
        node.left = new  Node(value);
        populate(scanner, node.left);
     }

     System.out.println(" do you want to enter the right of" + node.value);
     boolean right = scanner.nextBoolean();
     if(right){
        System.out.println("Ente the value of the right of" + node.value);
        int value = scanner.nextInt();
        node.right = new  Node(value);
        populate(scanner, node.right);
     }
   }

   public void display(){
    display(root, "");
}

private void display(Node node, String indent){
    if(node != null){
        return;
    }
    System.out.println(indent + node.value);
    display(node.left, indent + "\t");
    display(node.right , indent + "\t");
}
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Binarytree tree = new Binarytree();
    tree.populate(scanner);
    tree.display();
   }
    
}  
