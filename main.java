import java.util.Scanner;
public class main {
    String[] Alumnos={}; //Crear un arreglo de cadena de caracteres para almacenar a los estudiantes
    //Metodos
    public void Promedio(String Matreria)
    {
        Double[] Notas={};
        Alumnos alumno;
        for (int i=0; i<5; i++)
        {
            if (alumno.getMateria()==Matreria)
            {
                
            }
        }
        
        int suma=0;

    }
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
        for (int i=1; i<=cantidad; i++)
        {
            System.out.println("Ingrese la "+i+" calificacion: ");
            Double calif=entrada.nextDouble();
            alumnos.setCalificacion(calif);
        }
    }
}