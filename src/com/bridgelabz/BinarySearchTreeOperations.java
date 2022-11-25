package com.bridgelabz;

public class BinarySearchTreeOperations {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Node root = null;
        root = tree.insertData(root, 56);
        root = tree.insertData(root, 30);
        root = tree.insertData(root, 70);

        tree.printInorder(root);
        System.out.println(root);
    }
}
