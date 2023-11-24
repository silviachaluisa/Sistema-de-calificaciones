import java.util.Scanner;
public class main {
    public String[] Alumnos={}; //Crear un arreglo de cadena de caracteres para almacenar a los estudiantes
    //Metodos
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in); //Leer la entrada por teclado
        System.out.println("Bienvenido al sistema de calificaciones de la EPN");
        System.out.println("De que bimestre desea ingresar las calificaciones: ");
        System.out.println("1.- Primer bimestre");
        System.out.println("2.- Segundo bimestre");
        System.out.println("Ingrese una opcion: ");
        int opc=entrada.nextInt();
        while (opc<1 || opc>2)
        {
            System.out.println("La opcion ingresada es invalida!");
            System.out.println("Ingrese de nuevo: ");
            opc=entrada.nextInt();
        }
        if (opc==1)
        {
            System.out.println("Ingreso de notas del primer bimestre");
        }
        else
        {
            System.out.println("Ingreso de notas del segundo bimestre");
        }
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
            System.out.println("Ingrese la "+i+" calificacion (entre 0 a 10): ");
            Double calif=entrada.nextDouble();
            while (calif<0 || calif>10)
            {
                System.out.println("La calificacion ingresada excede el rango permitido: ");
                System.out.println("Ingrese la "+i+" calificacion (entre 0 a 10): ");
                calif=entrada.nextDouble();
            }
            Notas[i-1]=calif;
        }
        Double suma=0.0;
        for (int i=0; i<cantidad; i++)
        {
            suma+=Notas[i];
        }
        Double promedio=suma/cantidad;
        alumnos.setPromedio(promedio);
        System.out.println("El promedio del estudiante "+alumnos.getNombre()+" es: "+alumnos.getPromedio());

    }
    public void Aprobar(Double promedio, String nombre)
    {
        if (promedio>=7)
        {
            System.out.println("El estudiante "+ nombre+" aprobo la materia");
        }
        else if (promedio>=4.5 && promedio<7)
        {
            System.out.println("El estudiante "+ nombre+ "se quedo a supletorio");
        }
        else
        {
            System.out.println("El estudiante "+ nombre+ "no aprobo la materia");
        }
    }
}