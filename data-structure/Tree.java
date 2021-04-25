package com.xyh;

import java.util.ArrayList;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }

        var curr = root;
        while (true) {
            if (value < curr.value) {
                if (curr.leftChild == null) {
                    curr.leftChild = node;
                    break;
                }
                curr = curr.leftChild;
            } else {
                if (curr.rightChild == null) {
                    curr.rightChild = node;
                    break;
                }
                curr = curr.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var curr = root;

        while (curr != null) {
            if (value < curr.value) {
                curr = curr.leftChild;
            } else if (value > curr.value) {
                curr = curr.rightChild;
            } else {
                return true;
            }
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {

        if(root == null) return;

        System.out.println(root);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);

    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {

        if (root == null) return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);

    }

    public void traversePostOrder() {
        traverseInOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null) return;

        traverseInOrder(root.leftChild);
        traverseInOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height(){
        return height(root);
    }

    private int height(Node root) {
        if (root == null) return -1;
        if (isLeaf(root)) return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    private boolean isLeaf(Node node) {
        if (node == null)  return false;
        return node.rightChild == null && node.leftChild == null;
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {
        if (isLeaf(root)) return root.value;

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    public boolean equals(Tree other) {
        if (other == null) return false;
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null) return true;

        if (first != null && second != null) {
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }

        return false;
    }

    public void swapRoot() {
        var temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = temp;
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root, int min, int max) {

        if (root == null) return true;

        if (root.value < min || root.value > max) return false;

        return isBinarySearchTree(root.leftChild, min, root.value - 1) &&
        isBinarySearchTree(root.rightChild, root.value + 1, max);
    }

    public ArrayList<Integer> kDistanceFromRoot(int distance){
        var list = new ArrayList<Integer>();
        kDistanceFromRoot(root, distance, list);
        return list;
    }
    private void kDistanceFromRoot(Node root, int distance, ArrayList<Integer> list) {
        if (root == null) return;
        if (distance == 0) {
            list.add(root.value);
            return;
        }
        kDistanceFromRoot(root.leftChild, distance-1, list);
        kDistanceFromRoot(root.rightChild, distance-1, list);
    }

    public void traverseLevelOrder() {
        for (var i = 0; i <= height(); i++) {
            for (var value: kDistanceFromRoot(i)) {
                System.out.println(value);
            }
        }
    }
}
