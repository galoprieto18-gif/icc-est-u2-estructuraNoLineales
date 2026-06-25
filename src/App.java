
import java.util.List;
import structures.nodes.Node;
import structures.trees.Ejercicio_01_insert.InsertBSTTest;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
import structures.trees.Ejercicio_03_listLeves.ListLevels;
import structures.trees.Ejercicio_04_depth.Depth;

public class App {

    public static void main(String[] args) throws Exception {
      runEjercicios();

    }
     private static void runEjercicios() {
      InsertBSTTest ejercicio01 = new InsertBSTTest();
      InvertBinaryTree ejercicio02 = new InvertBinaryTree();
      ListLevels listLevels= new ListLevels();
      Depth ejercicio4 = new Depth();

      int[] numeros = new int[]{5,3,7,2,4,6,8};
      int[] numeros2 = new int[]{5};
      int[] numeros3 = new int[]{5,6,7,8,9,10};
      int[] numeros4 = new int[]{};

      System.out.println("\nEjercicio 01 :\n");
      System.out.println("\n---------------Árbol lleno---------------\n");
      ejercicio01.insert(numeros);
      System.out.println("\n---------------Solo un nodo en el árbol---------------\n");
      ejercicio01.insert(numeros2);
      System.out.println("\n---------------Árbol con valores solo en una dirección---------------\n");
      ejercicio01.insert(numeros3);
      System.out.println("\n---------------Árbol vacío---------------\n");
      ejercicio01.insert(numeros4);
      System.out.println();
     

      System.out.println("\nEjercicio 02 :\n");

      System.out.println("\n---------------Árbol lleno---------------\n");
      ejercicio02.insert(numeros);
      System.out.println("\n---------------Solo un nodo en el árbol---------------\n");
      ejercicio02.insert(numeros2);
      System.out.println("\n---------------Árbol con valores solo en una dirección---------------\n");
      ejercicio02.insert(numeros3);
      System.out.println("\n---------------Árbol vacío---------------\n");
      ejercicio02.insert(numeros4);
      System.out.println();
     

    System.out.println("Ejercicio 03 :"+ "\n");

    System.out.println("\n---------------Listar niveles (lleno)---------------\n");
    Node<Integer> root = ejercicio01.insert(numeros);
    System.out.println();
    List<List<Node<Integer>>> niveles = listLevels.listLevels(root);
    imprimirNiveles(niveles);
    
    System.out.println("\n---------------Listar niveles con un solo nodo---------------\n");
    Node<Integer> root2 = ejercicio01.insert(numeros2);
    System.out.println();
    List<List<Node<Integer>>> niveles2 = listLevels.listLevels(root2);
    imprimirNiveles(niveles2);
     
    System.out.println("\n---------------Listar niveles en un solo lado---------------\n");
    Node<Integer> root3 = ejercicio01.insert(numeros3);
    System.out.println();
    List<List<Node<Integer>>> niveles3 = listLevels.listLevels(root3);
    imprimirNiveles(niveles3);
    
    System.out.println("\n---------------Listar niveles vacío---------------\n");
    Node<Integer> root4 = ejercicio01.insert(numeros4);
    System.out.println();
    List<List<Node<Integer>>> niveles4 = listLevels.listLevels(root4);
    imprimirNiveles(niveles4);
      

    System.out.println("\n"+ "Ejercicio 4 :" );

    System.out.println("\n---------------Árbol lleno---------------\n");
    int profundidad = ejercicio4.maxDepth(ejercicio01.insert(numeros));
    System.out.println("Profundidad Máxima = " + profundidad);

    System.out.println("\n---------------Solo un nodo en el árbol---------------\n");
    int profundidad1 = ejercicio4.maxDepth(ejercicio01.insert(numeros2));
    System.out.println("Profundidad Máxima = " + profundidad1);

    System.out.println("\n---------------Árbol con valores solo en una dirección---------------\n");
    int profundidad2  = ejercicio4.maxDepth(ejercicio01.insert(numeros3));
    System.out.println("Profundidad Máxima = " + profundidad2);

    System.out.println("\n---------------Árbol vacío---------------\n");
    int profundidad3  = ejercicio4.maxDepth(ejercicio01.insert(numeros4));
    System.out.println("Profundidad Máxima = " + profundidad3);
    System.out.println();
  }
  
  public static void imprimirNiveles(List<List<Node<Integer>>> niveles){

    for (List<Node<Integer>> nivel : niveles){

      for(int i=0; i<nivel.size(); i++){
        System.out.print(nivel.get(i));
        if (i < nivel.size() -1 ){
          System.out.print("-->");
        }
      }
      System.out.println();
   }
 }
}
    
  




//import models.Persona;
//import structures.trees.BinaryTree;
//import structures.trees.IntTree;

      //runIntTree();
      //runIntTree2();
      //runBinaryTree();

   
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
