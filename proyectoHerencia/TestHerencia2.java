/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo9_herencia;

/**
 *
 * @author DELL
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class TestHerencia2{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Persona [] datos = new Persona [5];
        int opcion, sueldo, edad, c = 0;
        String letra, nombre, puesto, id, idBuscar;
        do{
            System.out.println("Selecciona una opcion ");
            System.out.println("Crear un Objeto: 1");
            System.out.println("Mostrar objetos creados: 2");
            System.out.println("Buscar por ID: 3");
            System.out.println("Salir: 4");
            System.out.println("Selecciona una opcion ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            System.out.println("---------------------");
            switch(opcion){
                case 1: 
                    System.out.println("¿Que deseas crear?"
                            + " a = Alumno "
                            + " p = Profesor"
                            + " ad = Administrador");
                    letra = entrada.nextLine();
                    entrada.nextLine();
                    System.out.print("Nombre: ");
                    nombre = entrada.nextLine();
                    System.out.print("ID: ");
                    id = entrada.nextLine();
                    entrada.nextLine();
                    if(letra.equalsIgnoreCase ("a")){
                        System.out.print("Ingresa la edad: ");
                        edad = entrada.nextInt();
                        entrada.nextLine();
                        datos [c] = new Alumno(id, nombre, edad);
                    }
                    else if(letra.equalsIgnoreCase("p")){
                        System.out.print("Ingresa el sueldo: ");
                        sueldo = entrada.nextInt();
                        entrada.nextLine();
                        datos [c] = new Profesor(id, nombre, sueldo);
                    }
                    else if(letra.equalsIgnoreCase("ad")){
                        System.out.print("Ingresa el puesto: ");
                        puesto = entrada.nextLine();
                        datos [c] = new Administrador(id, nombre, puesto);
                    }
                    else{
                        System.out.print("Inexistente");
                    }
                    c++;
                    break;
                case 2: 
                    if(c == 0){
                        System.out.println("Objetos inexistentes");
                    }
                    else{
                       for(int i = 0; i < c; i++) {
                           System.out.println(datos[i].mostrarDatos());
                           System.out.println("-------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.println("ID a buscar: ");
                    idBuscar = entrada.nextLine();
                    for(int i = 0; i < c; i++){
                        if(datos[i].getId().equalsIgnoreCase(idBuscar)){
                            System.out.println(datos[i].mostrarDatos());
                        }
                        else{
                            System.out.println("Inexistente");
                        }
                    }
                    break;
                case 4: 
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción Inexistente");
            }
        }while(opcion != 4);
    }   
}