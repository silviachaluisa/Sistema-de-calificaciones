public class Alumnos {
    //ATRIBUTOS
    public String Nombre;
    public String Materia;
    public Double Calificacion;
    
    //CONSTRUCTOR
    public Alumnos(String nombre) {
        this.Nombre = nombre;
    }

    //**METODOS**
    //SETTER
    public void setMateria(String materia) {
        this.Materia=materia;
    }
    public void setCalificacion(Double calificacion){
        this.Calificacion=calificacion;
    }
    //GETTER
    public String getNombre(){
        return Nombre;
    }
    public String getMateria(){
        return Materia;
    }
    public Double getCalificacion(){
        return Calificacion;
    }
    



}
