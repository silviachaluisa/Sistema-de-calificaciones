import java.util.Scanner;
public class main {
    String[] Alumnos={}; //Crear un arreglo de cadena de caracteres para almacenar a los estudiantes
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in); //Leer la entrada por teclado
        System.out.println("Bienvenido al sistema de cali9ficaciones de la EPN");
        for (int i=1; i<=10; i++)
        {
            System.out.println("Ingrese el nombre y apellido del alumno "+ i+": ");
            String nombre=entrada.nextLine();
            System.out.println("Ingrese la materia que desea registrar: ");
            String materia=entrada.nextLine();
            
        }
        
    }
}