
package structures.nodes;

public class Node <T>{
    
    private T value;
    private Node<T> left;
    private Node<T> rigth;

    //Creo un nodo
    //Instancio el node -> Constructor
    // tiene que crearse con el valor 

    public Node (int value){
        this.value = value;
        this.rigth = null;
        this.left = null;
        }
    

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRigth() {
        return rigth;
    }

    public void setRigth(Node<T> rigth) {
        this.rigth = rigth;
    }
    
        
    @Override
    public String toString() {
        return "Node [" + value + "]";
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    

}
    


