package structures.trees.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.nodes.Node;

public class ListLevels {
    
     public List<List<Node<Integer>>> listLevels(Node<Integer> root){
        
        List<List<Node<Integer>>> result = new ArrayList<>();

        if (root == null){
            return result;
        }
        
        Queue<Node<Integer>> cola =  new LinkedList<>();
        cola.add(root);
     
        while (!cola.isEmpty()){

            int tamaño = cola.size();
            List<Node<Integer>> nivel = new ArrayList<>();

            for (int i = 0; i < tamaño; i++){

                Node<Integer> actual = cola.poll();
                nivel.add(actual);
            
                if (actual.getLeft() !=null){
                    cola.add(actual.getLeft());
                }
                if (actual.getRight() !=null){
                    cola.add(actual.getRight());
                }
            }
            result.add(nivel);
        }
        return result;
       
    }
}


