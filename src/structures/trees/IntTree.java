package structures.trees;

import structures.nodes.Node;

public class IntTree {
    
    
    private Node<Integer>root;
 // CLASE DE ARBOL SOLO DE ENTEROS

    public IntTree(){
        this.root = null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public void serRoot(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
    }

    public void add(int value){
        Node<Integer> node = new Node<Integer>(value);
        root = addRecursivo(root,node);
    }

    private Node<Integer> addRecursivo (Node<Integer> actual, Node<Integer> nodeInsertar){
        if(actual == null){
            return nodeInsertar; 
        }

        if(actual.getValue() > nodeInsertar.getValue()){
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

    private void preOrdenRecursivo(Node<Integer> actual) {
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

    private void posOrdenRecursivo(Node<Integer> actual) {
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

    private void inOrdenRecursivo(Node<Integer> actual) {
             
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
    private int getHeigthRecursivo(Node<Integer> actual) {
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

    private int getPesoRecursivo(Node<Integer> actual) {
       if(actual == null)
        return 0;
        
        
        int heigthLeft = getHeigthRecursivo(actual.getLeft());
        int heigthRigth = getHeigthRecursivo(actual.getRigth());
        return heigthLeft + heigthRigth + 1;
    }


    }

    

  






