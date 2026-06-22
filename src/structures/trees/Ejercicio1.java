package structures.trees;

import structures.nodes.Node;

public class Ejercicio1 {
    
    public void insert(int []numeros){
        
        //CREAR EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();
        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }
        //IMPRIMIR EL ARBOL
        tree.intOrden();

    
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
        System.out.println(" ");
    }
    System.out.println(root.getValue());
    printTreeRecursivo(root.getLeft(),nive1 + 1);
    
    }

}