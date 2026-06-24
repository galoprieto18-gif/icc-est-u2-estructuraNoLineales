package structures.trees.Ejercicio_01_insert;

import structures.nodes.Node;
import structures.trees.BinaryTree;

public class InsertBSTTest {

     public Node<Integer> insert(int []numeros){
     BinaryTree<Integer> tree = new BinaryTree<>();
        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }
        Node<Integer> root = tree.getRoot();
            if (root == null){
                
            System.out.println("Se encuentra vacío el arbol");
            return null;
        
        }
        //IMPRIMIR EL ARBOL
        printTree(root);
        return root;
    }

        
    public void printTree( Node<Integer> root){
        System.out.println("Imprimiendo el arbol:");
        printTreeRecursivo(root,0);
    }
    private void printTreeRecursivo(Node<Integer> root, int nive1) {
       
     if(root == null)
      return;
    printTreeRecursivo(root.getRight(),nive1+1);
    for(int i = 0; i < nive1 ; i++){
        System.out.print("   ");
    }
    System.out.println(root.getValue());
    printTreeRecursivo(root.getLeft(),nive1 + 1);
    
    }

}

