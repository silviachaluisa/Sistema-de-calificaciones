import java.util.Scanner;
public class main {
    public String[] Alumnos={}; //Crear un arreglo de cadena de caracteres para almacenar a los estudiantes
    //Metodos
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in); //Leer la entrada por teclado
        System.out.println("Bienvenido al sistema de calificaciones del primer bimestre de la EPN");
        Alumnos alumnos=new Alumnos();
        System.out.println("Ingrese el nombre y apellido del alumno: ");
        String nombre=entrada.nextLine();
        alumnos.setNombre(nombre);
        System.out.println("Ingrese la materia que desea registrar: ");
        String materia=entrada.nextLine();
        alumnos.setMateria(materia);
        System.out.println("Ingrese el numero de calificaciones");
        int cantidad=entrada.nextInt();
        Double[] Notas=new Double[cantidad]; //Crear un arreglo paera almacenar las calificaciones
        for (int i=1; i<=cantidad; i++)
        {
            System.out.println("Ingrese la "+i+" calificacion: ");
            Double calif=entrada.nextDouble();
            Notas[i-1]=calif;
        }
        Double suma=0.0;
        for (int i=0; i<cantidad; i++)
        {
            suma+=Notas[i];
        }
        Double promedio=suma/cantidad;
        alumnos.setPromedio(promedio);
    }
}