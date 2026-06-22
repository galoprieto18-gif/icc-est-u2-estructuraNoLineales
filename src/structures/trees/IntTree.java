package structures.trees;

import structures.nodes.Node;

public class IntTree {
    

    private Node<Integer> root;
    private int peso;
  
    // Clase de arbol solo de enteros.


    //Constructor
    public void InteTree() {
        this.root = null;
        this.peso=0;
    }


    public Node<Integer> getRoot() {
        return root;
    }

    public int getPeso(){
        return peso;
    }
    public void setRoot(Node<Integer> root) {
        this.root = root;
    }
    public void serRoot(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
    }


    public void add(int value) {
      Node<Integer> node = new Node<Integer>(value);
      root = addRecusrivo(root ,node);
      

    }


    private Node<Integer> addRecusrivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if(actual == null)
            return nodeInsertar;
        if(actual.getValue() > nodeInsertar.getValue()){
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


    private void preOrdenRecursivo(Node<Integer> actual) {
       if(actual == null)
        return ;
        System.out.println(actual + ",");
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    public void postOrden(){
        postOrdenRecursivo(root);
    }


    private void postOrdenRecursivo(Node<Integer> actual) {
       if(actual== null)
        return ;
        postOrdenRecursivo(actual.getLeft());
        postOrdenRecursivo(actual.getRight());
        System.out.println(actual);
        
        
    }

      public void intOrden(){
        intOrdenRecursivo(root);
    }


    private void intOrdenRecursivo(Node<Integer> actual) {
       if(actual== null)
        return ;
        
        intOrdenRecursivo(actual.getLeft());
        System.out.println(actual);
         intOrdenRecursivo(actual.getRight());
         
    }
      public int getHeigth(){
        return getHeigthRecursivo(root);
    }


      private int getHeigthRecursivo(Node<Integer> actual) {
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


      private int getPesoRecursivo(Node<Integer> actual) {
        if(actual == null)
            return 0;
        int peso = 0;
        int heigthLeft = getHeigthRecursivo(actual.getLeft());
        int heigthReigth = getHeigthRecursivo(actual.getRight());

        
        return 1 + heigthLeft + heigthReigth;
      } 

}