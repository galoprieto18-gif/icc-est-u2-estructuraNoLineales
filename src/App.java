
import structures.nodes.Node;

import models.Persona;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.IntTree;



public class App {

    public static void main(String[] args) throws Exception {
      runIntTree();
      runBinaryTree();
      runEjercicios();


    }

    private static void runEjercicios() {
      Ejercicio1 ejercicio1 = new Ejercicio1();
      int [] numeros =  new int[] {5,3,7,2,4,6,8};
      ejercicio1.insert(numeros);
      
   
   }


    private static void runBinaryTree() {
     BinaryTree<String> arbolString = new BinaryTree<>();
     BinaryTree<Persona> arbolPersona = new BinaryTree<>();
     arbolPersona.add(new Persona("pablo", 30));
     arbolPersona.add(new Persona("ana", 25));
     arbolPersona.add(new Persona("luis", 35));
     arbolPersona.add(new Persona("maria", 28));
      System.out.println(arbolPersona.getRoot());
         System.out.println(arbolPersona.getRoot().getLeft().getRight());
         System.out.println("pre orden ");
         arbolPersona.preOrden();
         System.out.println("pos orden ");
         arbolPersona.postOrden();
         System.out.println("int orden ");
         arbolPersona.postOrden();
         System.out.println("altura del arbol ");
         int altura =arbolPersona.getHeigth();
         System.out.println(altura);
         System.out.println("peso del arbol ");
         int peso =arbolPersona.getpeso();
         System.out.println(peso);
   
    }

    private static void runIntTree() {
       IntTree arbolNumeros = new IntTree();
    //    Nodes<Integer> node1 = new Nodes(50);
    //    Nodes<Integer> node2 = new Nodes<>(10);
    //    Nodes<Integer> node3 = new Nodes<>(30);

    //    arbolNumeros.setRoot(node1);
    //    node1.setRight(node2);
    //    node2.setLeft(node3);
    //     System.out.println(arbolNumeros.getRoot());
    //     System.out.println(arbolNumeros.getRoot().getLeft().getRight());
        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(75);
        arbolNumeros.add(55);
         System.out.println(arbolNumeros.getRoot());
         System.out.println(arbolNumeros.getRoot().getLeft().getRight());
         System.out.println("pre orden ");
         arbolNumeros.preOrden();
         System.out.println("pos orden ");
         arbolNumeros.postOrden();
         System.out.println("int orden ");
         arbolNumeros.postOrden();
         System.out.println("altura del arbol ");
         int altura =  arbolNumeros.getHeigth();
         System.out.println(altura);
         System.out.println("peso del arbol ");
         int peso = arbolNumeros.getPeso();
         System.out.println(peso);
    }

   }
