import java.util.Scanner;

public class Sistema_registro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Objeto para leer la entrada por teclado

        System.out.println("\"Bienvenido al sistema de calificaciones de la EPN\"");
        System.out.println("De qué bimestre desea ingresar las calificaciones:");
        System.out.println("1.- Primer bimestre");
        System.out.println("2.- Segundo bimestre");
        System.out.println("Ingrese una opción:");
        int opc=entrada.nextInt();

        while (opc < 1 || opc > 2) {
            System.out.println("La opción ingresada es inválida!");
            System.out.println("Ingrese de nuevo:");
            opc=entrada.nextInt();
        }

        String bimestre=(opc==1) ? "primer" : "segundo"; //Asignar segun opc (primer o segundo) a bimestre

        // Consumir el carácter de nueva línea después del número
        entrada.nextLine();

        Alumnos[] estudiantes = new Alumnos[10]; // Crear un arreglo para almacenar información de 10 estudiantes

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingreso de notas del "+bimestre+" bimestre para el estudiante "+(i+1));

            System.out.println("Ingrese el nombre y apellido del alumno:");
            String nombre=entrada.nextLine();
            Alumnos alumno = new Alumnos(nombre);

            System.out.println("Ingrese la materia que desea registrar:");
            String materia=entrada.nextLine();
            alumno.setMateria(materia);

            Double[] notas = new Double[5]; // Crear un arreglo para almacenar las calificaciones

            for (int j = 1; j <= 5; j++) {
                System.out.println("Ingrese la " + j + " calificación (entre 0 a 10):");
                Double calif=entrada.nextDouble();

                while (calif < 0 || calif > 10) {
                    System.out.println("La calificación ingresada excede el rango permitido:");
                    System.out.println("Ingrese la " + j + " calificación (entre 0 a 10):");
                    calif=entrada.nextDouble();
                }
                notas[j-1]=calif;
            }

            alumno.setCalificaciones(notas[0], notas[1], notas[2], notas[3], notas[4]);
            estudiantes[i]=alumno; // Guardar el valor ingresado del alumno en el arreglo

            entrada.nextLine(); // Consumir el carácter de nueva línea después de las calificaciones
        }
        // Mostrar los resultados para cada estudiante
        for (Alumnos alumno:estudiantes) {
            System.out.printf("El promedio del estudiante %s en la materia de %s es %.2f%n", alumno.getNombre(),
                    alumno.getMateria(), alumno.getPromedio());
            System.out.println("El estudiante " + alumno.getNombre()+" "+alumno.getAprueba_Reprueba());
            System.out.println();
        }
        entrada.close();
    }
}