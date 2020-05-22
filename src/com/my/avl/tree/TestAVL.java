package com.my.avl.tree;

public class TestAVL {
	public static void main(String[] args) { 
        AVLTree tree = new AVLTree(); 
  
        /* Constructing tree given in the above figure */
		/*
		 * tree.root = tree.insert(tree.root, 10); tree.root = tree.insert(tree.root,
		 * 20); tree.root = tree.insert(tree.root, 30); tree.root =
		 * tree.insert(tree.root, 40); tree.root = tree.insert(tree.root, 50); tree.root
		 * = tree.insert(tree.root, 25); tree.root = tree.insert(tree.root, 27);
		 * tree.root = tree.insert(tree.root, 28); tree.root = tree.insert(tree.root,
		 * 28); tree.root = tree.insert(tree.root, 1); tree.root =
		 * tree.insert(tree.root, 15); tree.root = tree.insert(tree.root, 55); tree.root
		 * = tree.insert(tree.root, 45); tree.root = tree.insert(tree.root, 23);
		 */
		/*
		 * tree.root = tree.insert(tree.root, 1); tree.root = tree.insert(tree.root, 2);
		 * tree.root = tree.insert(tree.root, 3); tree.root = tree.insert(tree.root, 4);
		 * tree.root = tree.insert(tree.root, 5); tree.root = tree.insert(tree.root, 6);
		 * tree.root = tree.insert(tree.root, 7); tree.root = tree.insert(tree.root, 8);
		 * tree.root = tree.insert(tree.root, 9); tree.root = tree.insert(tree.root,
		 * 10); tree.root = tree.insert(tree.root, 11); tree.root =
		 * tree.insert(tree.root, 12); tree.root = tree.insert(tree.root, 13); tree.root
		 * = tree.insert(tree.root, 14); tree.root = tree.insert(tree.root, 15);
		 */
        
        tree.root = tree.insert(tree.root, 40);

        tree.root = tree.insert(tree.root, 23);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 25);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 24);
        
        
        /* The constructed AVL Tree would be 
             30 
            /  \ 
          20   40 
         /  \     \ 
        10  25    50 
        */
        System.out.println("Preorder traversal" + 
                        " of constructed tree is : "); 
        tree.preOrder(tree.root); 
        
        System.out.println("\nIN Oder traversal" + 
                " of constructed tree is : "); 
tree.inOrder(tree.root); 
    } 
}
