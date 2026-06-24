
//import models.Persona;
//import structures.trees.BinaryTree;
//import structures.trees.IntTree;
import java.util.List;
import structures.nodes.Node;
import structures.trees.Ejercicio_01_insert.InsertBSTTest;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
import structures.trees.Ejercicio_03_listLeves.ListLevels;
import structures.trees.Ejercicio_04_depth.Depth;

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
      InsertBSTTest ejercicio1 = new InsertBSTTest();
      InvertBinaryTree ejercicio2 = new InvertBinaryTree();

      int [] numero01 = new int[]{};
      int [] numero02 = new int[]{5};
      int [] numero03 = new int[]{3,4,5,7};
      int [] numeros = new int[]{5,3,7,2,4,6,8};
      ejercicio1.insert(numeros);
      ejercicio1.insert(numero01);
      ejercicio1.insert(numero02);
      ejercicio1.insert(numero03);

      Node root =  ejercicio2.insert(numeros);
      Node root1 = ejercicio2.insert(numero01);
      Node root2 = ejercicio2.insert(numero02);
      Node root3 = ejercicio2.insert(numero03);

      ListLevels listLevels = new ListLevels();
      List<List<Integer>> niveles = listLevels.listLevels(root);
      List<List<Integer>> niveles1 = listLevels.listLevels(root1);
      List<List<Integer>> niveles2 = listLevels.listLevels(root2);
      List<List<Integer>> niveles3 = listLevels.listLevels(root3);
     
      imprimirNiveles(niveles);
      System.out.println();
      
      imprimirNiveles(niveles1);
      System.out.println();

      imprimirNiveles(niveles2);
      System.out.println();

      imprimirNiveles(niveles3);
      System.out.println();
           

      Depth ejercicio4 = new Depth();
      int profundidad = ejercicio4.maxDepth(root);
      System.out.println("Profundidad =" + profundidad);
      int profundidad01 = ejercicio4.maxDepth(root1);
      System.out.println("Profundidad =" + profundidad01);
      int profundidad02 = ejercicio4.maxDepth(root2);
      System.out.println("Profundidad =" + profundidad02);
      int profundidad03 = ejercicio4.maxDepth(root3);
      System.out.println("Profundidad =" + profundidad03);

     }
  public static void imprimirNiveles(List<List<Integer>> niveles){

      for (List<Integer> nivel : niveles){
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

   
