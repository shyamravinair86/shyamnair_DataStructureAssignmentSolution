package com.company.main;

import com.company.model.Node;
import com.company.service.Tree;

public class Main {

    public static Node node;

    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree.node = new Node(50);
        Tree.node.left = new Node(30);
        Tree.node.right = new Node(60);
        Tree.node.left.left = new Node(10);
        Tree.node.left.right = new Node(40);

        tree.convertBSTToSkewedTree(Tree.node);
        tree.traverseTree(Tree.headNode);
    }
}
