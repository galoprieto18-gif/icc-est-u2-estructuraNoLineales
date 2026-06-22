
//import models.Persona;
//import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
//import structures.trees.IntTree;



public class App {

    public static void main(String[] args) throws Exception {
      //runIntTree();
      //runIntTree2();
      //runBinaryTree();
      runEjercicios();


    }

   //  private static void runIntTree2() {
   //    IntTree arbolNumeros = new IntTree();
   //      arbolNumeros.add(50);
   //      arbolNumeros.add(10);
   //      arbolNumeros.add(30);
   //      arbolNumeros.add(60);
   //      arbolNumeros.add(75);
   //      arbolNumeros.add(55);
   //      System.out.println("PreOrden:");
   //      arbolNumeros.preOrden();
   //      System.out.println("PostOrden:");
   //      arbolNumeros.postOrden();
   //      System.out.println("IntOrden:");
   //      arbolNumeros.intOrden();
   //      int altura = arbolNumeros.getHeigth();
   //      System.out.println("\nAltura:" + altura );
   //      System.out.println();
   //      int peso = arbolNumeros.getHeigth();
   //      System.out.println("Peso O(1): \n" + peso);
   //      System.out.println("Peso O(1):\n" + arbolNumeros.getPeso());
   // }
   //  private static void runBinaryTree() {
    
   // BinaryTree<String> arbolStrings = new BinaryTree<>();
   // BinaryTree<Persona> arbolPersonas = new BinaryTree<>();

   //  System.out.println("Clase BinaryTree:" + "\n");

   //    arbolPersonas.add(new Persona("pablo", 30));
   //    arbolPersonas.add(new Persona("ana", 25));
   //    arbolPersonas.add(new Persona("luis", 35));
   //    arbolPersonas.add(new Persona("maria", 28));
    
   //    arbolPersonas.preOrden();
   // }

     private static void runEjercicios() {
      Ejercicio1 ejercicio1 = new Ejercicio1();
      int [] numeros =  new int[] {5,3,7,2,4,6,8};
      ejercicio1.insert(numeros);
      
   
   }
   
   //  private static void runIntTree() {
   //    IntTree arbolNumeros = new IntTree();
   //    // Node<Integer> node1 = new Node(50);
   //    // Node<Integer> node2 = new Node<>(10);
   //    // Node<Integer> node3 = new Node<>(30);

   //    //    arbolNumeros.setRoot(node1);
   //    //    node1.setRight(node2);
   //    //    node2.setLeft(node3);
   //    //   System.out.println(arbolNumeros.getRoot());
   //    //   System.out.println(arbolNumeros.getRoot().getLeft().getRight());
   //      arbolNumeros.add(50);
   //      arbolNumeros.add(10);
   //      arbolNumeros.add(30);
   //      arbolNumeros.add(60);
   //      arbolNumeros.add(75);
   //      arbolNumeros.add(55);

   //       System.out.println("Clase IntTree:");
   //       System.out.println();
   //       System.out.println(arbolNumeros.getRoot());
   //       System.out.println(arbolNumeros.getRoot().getLeft().getRight());
        
   //       System.out.println();
   //       System.out.println("pre orden ");
   //       arbolNumeros.preOrden();
   //       System.out.println();
   //       System.out.println("pos orden ");
   //       arbolNumeros.postOrden();
   //       System.out.println();
   //       System.out.println("int orden ");
   //       arbolNumeros.postOrden();
   //       System.out.println();
   //       System.out.println("Altura del arbol: ");
   //       int altura =  arbolNumeros.getHeigth();
   //       System.out.println(altura);
   //       System.out.println();
   //       System.out.println("Peso del arbol: ");
   //       int peso = arbolNumeros.getPeso();
   //       System.out.println(peso);
   //  }

   }
