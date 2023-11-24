public class Alumnos {
    //ATRIBUTOS
    public String Nombre;
    public String Materia;
    public Double Promedio;
    
    //CONSTRUCTOR
    public Alumnos() {};

    //**METODOS**
    //SETTER
    public void setNombre(String nombre) {
        this.Nombre=nombre;
    }
    public void setMateria(String materia) {
        this.Materia=materia;
    }
    public void setCalificacion(Double promedio){
        this.Promedio=promedio;
    }
    //GETTER
    public String getNombre(){
        return Nombre;
    }
    public String getMateria(){
        return Materia;
    }
    public Double getPromedio(){
        return Promedio;
    }




}
