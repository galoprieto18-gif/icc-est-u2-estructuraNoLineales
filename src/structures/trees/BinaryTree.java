package structures.trees;

import structures.nodes.Node;

public class BinaryTree<T extends Comparable<T>>{
    private Node<T> root;

    private int peso;
  
    // Clase de arbol solo de enteros.


    //Constructor
    public BinaryTree() {
        this.root = null;
        this.peso=0;
    }


    public Node<T> getRoot() {
        return root;
    }

    public int getPeso(){
        return peso;
    }
    public void setRoot(Node<T> root) {
        this.root = root;
    }
    public void serRoot(T value){
        Node<T> node = new Node<T>(value);
        this.root = node;
    }


    public void add(T value) {
      Node<T> node = new Node<T>(value);
      root = addRecusrivo(root ,node);
      

    }


    private Node<T> addRecusrivo(Node<T> actual, Node<T> nodeInsertar) {
        if(actual == null)
            return nodeInsertar;
        if(actual.getValue().compareTo(nodeInsertar.getValue())>0){
            //IZQUIERDA 
            actual.setLeft(addRecusrivo(actual.getLeft(), nodeInsertar));
        }else{
            actual.setRight(addRecusrivo(actual.getRight(), nodeInsertar));
        }
        return actual;
    }
    
    public void preOrden(){
        preOrdenRecursivo(root);
    }


    private void preOrdenRecursivo(Node<T> actual) {
       if(actual == null)
        return ;
        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    public void postOrden(){
        postOrdenRecursivo(root);
    }


    private void postOrdenRecursivo(Node<T> actual) {
       if(actual== null)
        return ;
        postOrdenRecursivo(actual.getLeft());
        postOrdenRecursivo(actual.getRight());
        System.out.println(actual);
        
        
    }

      public void intOrden(){
          intOrdenRecursivo(root);
    }


    private void intOrdenRecursivo(Node<T> actual) {
       if(actual== null)
        return ;
        
        intOrdenRecursivo(actual.getLeft());
        System.out.println(actual);
         System.out.println(actual.getRight());
         
    }
      public int getHeigth(){
        return getHeigthRecursivo(root);
    }


      private int getHeigthRecursivo(Node<T> actual) {
        if(actual == null)
            return 0;

        int heigthLeft = getHeigthRecursivo(actual.getLeft());
        int heigthReigth = getHeigthRecursivo(actual.getRight());

        int masAlto = Math.max(heigthLeft, heigthReigth);
        return masAlto+1;
      } 

       public int getpeso(){
        return getPesoRecursivo(root);
    }


      private int getPesoRecursivo(Node<T> actual) {
        if(actual == null)
            return 0;
        
        int heigthLeft = getHeigthRecursivo(actual.getLeft());
        int heigthReigth = getHeigthRecursivo(actual.getRight());

        
        return 1 + heigthLeft + heigthReigth;
      } 

}

