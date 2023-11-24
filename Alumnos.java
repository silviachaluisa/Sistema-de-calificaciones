public class Alumnos {
    //Atributos
    public String Nombre;
    public String Materia;
    public Double Calificacion;
    



    //Constructor
    public Alumnos(String nombre) {
        this.Nombre = nombre;
    }

    //Metodos
    //setter
    public void setMateria(String materia) {
        this.Materia=materia;
    }
    public void setCalificacion(Double calificacion){
        this.Calificacion=calificacion;
    }



}
