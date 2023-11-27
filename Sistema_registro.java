import java.util.Scanner;
public class Sistema_registro
{
    public static void main(String[] args)
    {
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

        //Consumir el carácter de nueva línea después del número
        entrada.nextLine();

        
        System.out.println("Ingrese el nombre y apellido del alumno: ");
        String nombre=entrada.nextLine();
        Alumnos alumnos=new Alumnos(nombre);
        System.out.println("Ingrese la materia que desea registrar: ");
        String materia=entrada.nextLine();
        alumnos.setMateria(materia);

        Double[] Notas=new Double[5]; //Crear un arreglo paera almacenar las calificaciones
        for (int i=1; i<=5; i++)
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
        alumnos.setCalificaciones(Notas[0], Notas[1], Notas[2], Notas[3], Notas[4]);
        System.out.printf("El promedio del estudiante %s en la materia de %s es %.2f%n",alumnos.getNombre(), alumnos.getMateria(), alumnos.getPromedio());
        System.out.println("El estudiante "+ alumnos.getNombre()+" "+alumnos.getAprueba_Reprueba());
        entrada.close();
    }
}