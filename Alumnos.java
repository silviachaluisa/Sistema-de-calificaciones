public class Alumnos {
    //ATRIBUTOS
    public String Nombre;
    public String Materia1, Materia2, Materia3, Materia4, Materia5;
    public Double Nota1, Nota2, Nota3, Nota4, Nota5;
    
    //CONSTRUCTOR
    public Alumnos(String nombre, String materia1, String materia2, String materia3, String materia4, String materia5) 
    {
        this.Nombre = nombre;
        this.Materia1 = materia1;
        this.Materia2 = materia2;
        this.Materia3 = materia3;
        this.Materia4 = materia4;
        this.Materia5 = materia5;
    };

    //**METODOS**
    //SETTER
    public void setNotas(Double nota1, Double nota2, Double nota3, Double nota4, Double nota5)
    {
        this.Nota1 = nota1;
        this.Nota2 = nota2;
        this.Nota3 = nota3;
        this.Nota4 = nota4;
        this.Nota5 = nota5;
    }
    //GETTER
    
    public Double getPromedio(){
        return ((Nota1 + Nota2 + Nota3 + Nota4 + Nota5)/5);
    }
}
