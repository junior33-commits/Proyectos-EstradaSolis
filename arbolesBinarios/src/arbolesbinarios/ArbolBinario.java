package arbolesbinarios;

public class ArbolBinario {
    Nodo raiz; // Nodo raiz del arbol 
    
    //Constructor 
    public ArbolBinario(){
        raiz = null;
    }
    
    //Método Insertar 
    public void insertar(String palabra, String significado){
        Nodo nuevo = new Nodo(palabra, significado);
        //Si no existen nodos, se inserta al inicio 
        if(raiz == null){
            raiz = nuevo;
            return;
        }
        //Si existe recorremos el arbol, primero revisamos izquierda y derecha 
        Nodo actual = raiz;
        Nodo padre = null;
        while(actual != null){
            padre = actual; //Padre conserva el ultimo 
            int comparacion = palabra.compareTo(actual.palabra);
            if(comparacion < 0){
                actual = actual.izquierdo;
            }
            else if(comparacion > 0){
                actual = actual.derecho;
            }
            else{
                return;
            }
        }
        //Llego a null en izquierdo o derecho
        //En este punto, padre apunta al nodo que se quiere inserar
        if(palabra.compareTo(padre.palabra) < 0){
            padre.izquierdo = nuevo;
        }
        else{
            padre.derecho = nuevo;        
        }
    }
    public boolean buscar(String palabra){
        return buscarRecursivo(raiz, palabra);
    }
    private boolean buscarRecursivo(Nodo actual, String palabra){
        if(actual == null){
            return false;
        }
        int comparacion = palabra.compareTo(actual.palabra);
        if(comparacion == 0){
            return true;
        }
        if(comparacion < 0){
            return buscarRecursivo(actual.izquierdo, palabra);
           }
        else{
            return buscarRecursivo(actual.derecho, palabra);
          }
    }
    public void inOrden(Nodo nodo, StringBuilder datos){
        if(nodo != null){
            inOrden(nodo.izquierdo, datos); //Recorrido por la izquierda
            datos.append(nodo.palabra).append(": ").append(nodo.significado)
                    .append("\n");
            datos.append(""); //Muestra el dato actual
            inOrden(nodo.derecho, datos); //Recorrido a la derecha
        }
    }
    public void preOrden(Nodo nodo, StringBuilder datos){
        if(nodo != null){
            datos.append(nodo.palabra).append(": ").append(nodo.significado).
                    append("\n");
            datos.append("");
            preOrden(nodo.izquierdo, datos);
            preOrden(nodo.derecho, datos);
        }
    }
    public void postOrden(Nodo nodo, StringBuilder datos){
        if(nodo != null){
            postOrden(nodo.izquierdo, datos);
            postOrden(nodo.derecho, datos);
            datos.append(nodo.palabra).append(": ").append(nodo.significado).
                    append("\n");
            datos.append("");
        }
    }
    
}
