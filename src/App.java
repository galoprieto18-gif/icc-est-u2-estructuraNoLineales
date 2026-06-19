//import structures.nodes.Node;
//import structures.nodes.Node;

import models.Persona;
import structures.trees.BinaryTree;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
    
        
        runIntTree();
        runBinaryTree();

    }
    private static void runBinaryTree(){
        BinaryTree<String> arbolString = new BinaryTree<>();
        BinaryTree<Persona> arbolPersona = new BinaryTree<>();

        arbolPersona.add(new Persona("Pablo", 30));
        arbolPersona.add(new Persona("Ana", 25));
        arbolPersona.add(new Persona("Luis", 35));
        arbolPersona.add(new Persona("Maria", 28));

        System.out.println(arbolPersona.getRoot());
        System.out.println(arbolPersona.getRoot().getRigth());
        System.out.println("preOrden");
        arbolPersona.preOrden();

        System.out.println("posOrden");
        arbolPersona.posOrden();

        System.out.println("inOrden");
        arbolPersona.inOrden();
        
        System.out.println("Altura");
        arbolPersona.getHeigth();

        System.out.println("Peso");
        arbolPersona.getPeso();
        
    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree();
        // Node<Integer> node1 = new Node<>(50);
        // Node<Integer> node2 = new Node<>(10);
        // Node<Integer> node3 = new Node<>(30);
        
        // arbolNumeros.setRoot(node1);
        // node1.setRigth(node2);
        // node2.setLeft(node3);
        System.out.println(arbolNumeros.getRoot());
        System.out.println(arbolNumeros.getRoot().getRigth());
    
        arbolNumeros.add(50);
        arbolNumeros.add(18);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(75);
        arbolNumeros.add(55);

        System.out.println("preOrden");
        arbolNumeros.preOrden();

        System.out.println("posOrden");
        arbolNumeros.posOrden();

        System.out.println("inOrden");
        arbolNumeros.inOrden();
        
        System.out.println("Altura");
        arbolNumeros.getHeigth();

        System.out.println("Peso");
        arbolNumeros.getPeso();
        
    }
}
