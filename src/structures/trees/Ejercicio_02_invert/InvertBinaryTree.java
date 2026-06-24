package structures.trees.Ejercicio_02_invert;

import structures.nodes.Node;
import structures.trees.BinaryTree;

public class InvertBinaryTree {
    
    
    public Node<Integer> insert(int [] numeros){
        
        //CREAR EL ARBOL DE ENTEROS
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
        printTreeInvertido(root);
        return root;
    }
    public void printTreeInvertido( Node<Integer> root){
        System.out.println("Impresion de ARBOL VERTICAL ejericio 3:");
        printInvertidoRecursivo(root,0);
    }
    private void printInvertidoRecursivo(Node<Integer> root, int nive1) {
       
     if(root == null)
      return;
    printInvertidoRecursivo(root.getLeft(),nive1+1);
    for(int i = 0; i < nive1 ; i++){
        System.out.print("   ");
    }
    System.out.println(root.getValue());
    printInvertidoRecursivo(root.getRight(),nive1 + 1);
    
    }

}

