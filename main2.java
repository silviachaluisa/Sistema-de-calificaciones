public class main2 {
    public static void main(String[] args) {
        Alumnos alumnos=new Alumnos("Juan Perez", "Fisica", "Calculo", "Estadistica", "Algebra", "Administracion");
        alumnos.setNotas(1.2, 6.0, 7.3, 4.4, 8.9);
        System.out.println("Promedio: " +alumnos.getPromedio());
    }
}
