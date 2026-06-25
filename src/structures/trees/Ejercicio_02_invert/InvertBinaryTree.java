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

        printTree(root);
        printTreeInvertido(root);
        return root;
    }
    public void printTreeInvertido( Node<Integer> root){
        System.out.println("Árbol invertido correctamente:");
        printInvertidoRecursivo(root,0);
    }

    private void printInvertidoRecursivo(Node<Integer> root, int nivel) {
     if(root == null)
      return;
    printInvertidoRecursivo(root.getLeft(),nivel+1);
    for(int i = 0; i < nivel ; i++){
        System.out.print("   ");
    }
    System.out.println(root.getValue());
    printInvertidoRecursivo(root.getRight(),nivel + 1);
    
    }

    public void printTree( Node<Integer> root){
        System.out.println("Árbol Original :");
        printTreeRecursivo(root,0);
    }

    private void printTreeRecursivo(Node<Integer> root, int nivel) {
       
     if(root == null)
      return;
    printTreeRecursivo(root.getRight(),nivel+1);
    for(int i = 0; i < nivel ; i++){
        System.out.print("   ");
    }
    System.out.println(root.getValue());
    printTreeRecursivo(root.getLeft(),nivel + 1);
    
    }

}

