package structures.trees;

import structures.nodes.Node;

public class BinaryTree<T extends Comparable<T>> {


     private Node<T>root;
 // CLASE DE ARBOL SOLO DE ENTEROS

    public BinaryTree(){
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void serRoot(T value){
        Node<T> node = new Node<T>(value);
        this.root = node;
    }

    public void add(int value){
        Node<T> node = new Node<>(value);
        root = addRecursivo(root,node);
    }

    private Node<T> addRecursivo (Node<T> actual, Node<T> nodeInsertar){
        if(actual == null){
            return nodeInsertar; 
        }

        if(actual.getValue().compareTo(nodeInsertar.getValue()) > 0) {

            // IZQUUIERDA
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));      
        }else{
            // DERECHA
            actual.setRigth(addRecursivo(actual.getRigth(), nodeInsertar));      
        }
        
        return actual; 
    }


    public void preOrden(){
        preOrdenRecursivo(root);

    }

    private void preOrdenRecursivo(Node<T> actual) {
        if(actual == null)
            return;
        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRigth());
        System.out.println();
    }
    public void posOrden(){
        posOrdenRecursivo(root);
    }

    private void posOrdenRecursivo(Node<T> actual) {
       if(actual == null)
            return;
        System.out.print(actual);
        posOrdenRecursivo(actual.getLeft());
        posOrdenRecursivo(actual.getRigth());
        System.out.println();

    }
    public void inOrden(){
        inOrdenRecursivo(root);
        
    }

    private void inOrdenRecursivo(Node<T> actual) {
             
        if (actual == null) {
             return;
        }
            inOrdenRecursivo(actual.getLeft());
            System.out.println(actual + ",");
            inOrdenRecursivo(actual.getRigth());
        }
    public int getHeigth(){
        return getHeigthRecursivo(root);
    }
    private int getHeigthRecursivo(Node<T> actual) {
         if (actual == null)
            return 0;
        int heigthLeft = getHeigthRecursivo(actual.getLeft());
        int heigthRigth = getHeigthRecursivo(actual.getRigth());
    
        int masAlto = Math.max(heigthLeft, heigthRigth);
            return masAlto;
    }
    public int getPeso(){
        return getPesoRecursivo(root);
    }

    private int getPesoRecursivo(Node<T> actual) {
       if(actual == null)
        return 0;
        
        
        int heigthLeft = getHeigthRecursivo(actual.getLeft());
        int heigthRigth = getHeigthRecursivo(actual.getRigth());
        return heigthLeft + heigthRigth + 1;
    }


    }

    

