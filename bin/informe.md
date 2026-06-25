
## **Práctica: Estructura de Lógica con Estructuras No Lineales: Árboles**

**Nombre**: Galo Prieto

**Fecha de entrega**: 24 de junio del 2026

**Curso:** Computación - Grupo 1

## **Descripción del proyecto:**

En esta práctica se realizaron ejercicios como el ordenamiento de un árbol de su forma original, se implementaron métodos recursivos para recorrer y invertir el árbol.También se utilizó el concepto de colas para la impresión por niveles, formando como resultado una cola de niveles, y finalmente se creó un método para comprobar la profundidad máxima del árbol.

## **Explicación del ejercicio 1:**

En el ejercicio 1 se creó un árbol binario de búsqueda a partir de un arreglo de números. Cada valor se inserta en el árbol mediante el método add hasta formar la estructura completa. Luego, se verifica si el árbol está vacío y, en caso contrario, se llama al método printTree para mostrarlo. La impresión se realiza con printTreeRecursivo, el cual recorre el árbol de forma recursiva, visitando primero la rama derecha y luego la izquierda, lo que permite visualizar correctamente su estructura.

- **Método insertar, con su printTree y printTreeRecursivo:**

```java  
package structures.trees.Ejercicio_01_insert;

import structures.nodes.Node;
import structures.trees.BinaryTree;

public class InsertBSTTest {

     public Node<Integer> insert(int []numeros){
     BinaryTree<Integer> tree = new BinaryTree<>();
        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }
        Node<Integer> root = tree.getRoot();
            if (root == null){
                
            System.out.println("Se encuentra vacío el arbol\n");
            return null;
        
        }
        //IMPRIMIR EL ARBOL
        printTree(root);
        return root;
    }

    public void printTree( Node<Integer> root){
        System.out.println("Árbol Original :");
        printTreeRecursivo(root,0);
    }
    private void printTreeRecursivo(Node<Integer> root, int nivel) {
       
     if(root == null)
      return;
    printTreeRecursivo(root.getRight(),nivel+1);
    for(int i = 0; i < nivel ; i++){
        System.out.print("   ");
    }
    System.out.println(root.getValue());
    printTreeRecursivo(root.getLeft(),nivel + 1);
    
    }
}
```

## **Explicación del ejercicio 2 :**

Este ejercicio es algo similar al primer ejercicio, en la creación del árbol binario a partir de un arreglo de números enteros. Solamente lo que cambia es su método printInvertidoRecursivo, ya que recorre primero el subárbol izquierdo, luego imprime el nodo actual y para culminar recorre el subárbol derecha, hasta llegar a la raíz. Además, utiliza una cantidad de espacios proporcional al nivel de cada nodo para mostrar la estructura del arbol de forma de vertical en la consola. 

- **Método invertir, con su printTree y printTreeInvertidoRecursivo:**

```java
package structures.trees.Ejercicio_02_invert;

import structures.nodes.Node;
import structures.trees.BinaryTree;

public class InvertBinaryTree {
    
    
    public Node<Integer> insert(int [] numeros){
        
        //CREAR EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();
        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }
        Node<Integer> root = tree.getRoot();
            if (root == null){
                System.out.println("Se encuentra vacío el arbol");
            return null;
            }
        //IMPRIMIR EL ARBOL

        printTree(root);
        printTreeInvertido(root);
        return root;
    }
    public void printTreeInvertido( Node<Integer> root){
        System.out.println("Árbol invertido correctamente:");
        printInvertidoRecursivo(root,0);
    }

    private void printInvertidoRecursivo(Node<Integer> root, int nivel) {
     if(root == null)
      return;
    printInvertidoRecursivo(root.getLeft(),nivel+1);
    for(int i = 0; i < nivel ; i++){
        System.out.print("   ");
    }
    System.out.println(root.getValue());
    printInvertidoRecursivo(root.getRight(),nivel + 1);
    
    }

    public void printTree( Node<Integer> root){
        System.out.println("Árbol Original :");
        printTreeRecursivo(root,0);
    }

    private void printTreeRecursivo(Node<Integer> root, int nivel) {
       
     if(root == null)
      return;
    printTreeRecursivo(root.getRight(),nivel+1);
    for(int i = 0; i < nivel ; i++){
        System.out.print("   ");
    }
    System.out.println(root.getValue());
    printTreeRecursivo(root.getLeft(),nivel + 1);
    
    }
}
```

## **Explicación del ejercicio 3 :**
En este ejercicio se realizó un recorrido por niveles utilizando el método listLevels para un árbol binario. Debido que va a recorrer nivel por nivel hasta visitar todos los nodos,en caso de que el árbol esté vacío, se devuelve una lista vacía. Para la implementación, se utilizó una estructura de cola (Queue) con el fin de ir almacenando temporalmente los nodos,empezando desde la raíz. En cada iteración se obtiene el número de nodos del nivel actual, lo que permite procesar de forma independiente. Mientras se procesan los nodos,los hijos se van a agregar a la cola para ser evaluados en el siguiente nivel. Como resultado, el método va a devolver una lista de listas, en la que cada sublista va a representar el nivel del árbol. 

- **Método listLevels, para el nivel usando cola(Queue):**

```java
package structures.trees.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.nodes.Node;

public class ListLevels {
    
     public List<List<Node<Integer>>> listLevels(Node<Integer> root){
        
        List<List<Node<Integer>>> result = new ArrayList<>();

        if (root == null){
            return result;
        }
        
        Queue<Node<Integer>> cola =  new LinkedList<>();
        cola.add(root);
     
        while (!cola.isEmpty()){

            int tamaño = cola.size();
            List<Node<Integer>> nivel = new ArrayList<>();

            for (int i = 0; i < tamaño; i++){

                Node<Integer> actual = cola.poll();
                nivel.add(actual);
            
                if (actual.getLeft() !=null){
                    cola.add(actual.getLeft());
                }
                if (actual.getRight() !=null){
                    cola.add(actual.getRight());
                }
            }
            result.add(nivel);
        }
        return result;
    }
}
```

## **Explicación del ejercicio 4 :**
En este ejercicio se implementó el método maxDepth, para calcular la profundidad máxima (altura) del árbol binario. El método funciona de forma recursiva, es decir, que evalúa primero cada subárbol, el lado izquierdo y el subárbol del lado derecho. Si el nodo de cada subárbol es nulo, se devuelve 0, determinando así el caso base. Luego, calcula la profundidad máxima de ambos subárboles y compara cuál subárbol tiene mayor profundidad. Finalmente, se le suma 1 al nivel actual del árbol, obteniendo como resultado su altura máxima. 

- **Método Depth usando Math.max para su profundidad máxima:**

```java
package structures.trees.Ejercicio_04_depth;

import structures.nodes.Node;

public class Depth {
    
    
    public int maxDepth(Node<Integer> root){
            if(root ==null){
                return 0;
            }
            int leftDepth = maxDepth(root.getLeft());
            int rightDepth = maxDepth(root.getRight());
        
            return 1 + Math.max(leftDepth, rightDepth);
    }
}
```
## **App :**

- **Demostración de implementación de los ejercicios:**

```java
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
```
**- Observación**:
En el app validé todos los ejercicios correctamente, además, creé un método imprimirNiveles con los parámetros lista de listas, con el funcionamiento de ir comparando nivel por nivel, es decir, desde la raíz hasta sus ramas y finalmente imprimir cada nivel aplicando un listado de niveles. 

## **IMPRESIONES A CONSOLA DE LOS EJERCICIOS**

### **Ejercicio 1 :**

```text
Ejercicio 01 :


---------------Árbol lleno---------------

Árbol Original :
      8
   7
      6
5
      4
   3
      2

---------------Solo un nodo en el árbol---------------

Árbol Original :
5

---------------Árbol con valores solo en una dirección---------------

Árbol Original :
               10
            9
         8
      7
   6
5

---------------Árbol vacío---------------

Se encuentra vacío el arbol
```
**- Observación del ejercicio:** 

La clase cumple con el objetivo de insertar elementos y mostrar el árbol resultante correctamente. Además, se visualizan sus cuatro casos correspondientes, verificando el funcionamiento del algoritmo.


### **Ejercicio 2:**
```text
Ejercicio 02 :


---------------Árbol lleno---------------

Árbol Original :
      8
   7
      6
5
      4
   3
      2
Árbol invertido correctamente:
      2
   3
      4
5
      6
   7
      8

---------------Solo un nodo en el árbol---------------

Árbol Original :
5
Árbol invertido correctamente:
5

---------------Árbol con valores solo en una dirección---------------

Árbol Original :
               10
            9
         8
      7
   6
5
Árbol invertido correctamente:
5
   6
      7
         8
            9
               10

---------------Árbol vacío---------------

Se encuentra vacío el arbol
```
**- Observación del ejercicio:**

La clase es un poco extensa, pero cumple con el objetivo de mostrar el árbol original y su recorrido invertido de forma correcta. Además, permite visualizar los cuatro casos propuestos, verificando el funcionamiento del algoritmo en diferentes estructuras de árbol.

### **Ejercicio 3 :**
```text
Ejercicio 03 :


---------------Listar niveles (lleno)---------------

Árbol Original :
      8
   7
      6
5
      4
   3
      2

5
3-->7
2-->4-->6-->8

---------------Listar niveles con un solo nodo---------------

Árbol Original :
5

5

---------------Listar niveles en un solo lado---------------

Árbol Original :
               10
            9
         8
      7
   6
5

5
6
7
8
9
10

---------------Listar niveles vacío---------------

Se encuentra vacío el arbol

```
**- Observación del ejercicio:** 

Este ejercicio es extenso, debido a que recorre el árbol por niveles utilizando una cola para procesar los nodos de forma ordenada. Como resultado, genera una lista de listas donde cada sublista representa un nivel del árbol, lo que permite verificar correctamente el funcionamiento del algoritmo.

### **Ejercicio 4 :**
```text
Ejercicio 4 :

---------------Árbol lleno---------------

Árbol Original :
      8
   7
      6
5
      4
   3
      2
Profundidad Máxima = 3

---------------Solo un nodo en el árbol---------------

Árbol Original :
5
Profundidad Máxima = 1

---------------Árbol con valores solo en una dirección---------------

Árbol Original :
               10
            9
         8
      7
   6
5
Profundidad Máxima = 6

---------------Árbol vacío---------------

Se encuentra vacío el arbol

Profundidad Máxima = 0

```
**- Observación del ejercicio:** 

Este método es complejo y utiliza una lista de listas para organizar los nodos del árbol por niveles. El proceso inicia en la raíz, que se agrega a una cola como primer nivel, y luego se recorren sus hijos izquierdo y derecho para formar los siguientes niveles de manera progresiva. Este proceso se repite hasta llegar al caso base, agrupando los nodos en sublistas según su nivel. Finalmente, se retorna una lista que contiene todos los niveles del árbol.

### **Conclusiones :**

- Al realizar estos ejercicios, se pudieron obtener muchos conocimientos sobre el funcinamiento de cada elemento dentro de las estructuras no lineales,lo cual me permitió avanzar un poco más en la lógica de programación.

- Al implementar el caso base, es fundamental por la ventaja de detener la ejecución según la condición necesaria, evitando así posibles problemas en el proceso. 

### **Recomendaciones :**

- Siempre tener en cuenta, la comprensión de la recursividad, ya que en varios casos es clave para la implementación de métodos como en estos ejercicios. 

- Es importante estructurar bien el código para evitar problemas en el proceso. 
