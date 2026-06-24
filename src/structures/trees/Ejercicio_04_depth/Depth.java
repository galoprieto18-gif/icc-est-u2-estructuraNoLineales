package structures.trees.Ejercicio_04_depth;

import structures.nodes.Node;

public class Depth {
    
    
        public int maxDepth(Node<Integer> root){
            if(root ==null){
                return 0;
            }
            int leftDepth = maxDepth(root.getLeft());
            int rightDepth = maxDepth(root.getRight());
        
            return 1 + Math.max(leftDepth, rightDepth);
    }

}

