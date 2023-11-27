public class Alumnos {
    //ATRIBUTOS
    public String Nombre;
    public String Materia;
    public double calif1, calif2, calif3, calif4, calif5;
    
    //CONSTRUCTOR
    public Alumnos(String nuevo_nombre)
    {
        this.Nombre=nuevo_nombre;
    }

    //**METODOS**
    //SETTER
    public void setMateria(String materia) {
        this.Materia=materia;
    }
    public void setCalificaciones(double c1, double c2, double c3, double c4, double c5)
    {
        this.calif1=c1;
        this.calif2=c2;
        this.calif3=c3;
        this.calif4=c4;
        this.calif5=c5;
    }
    //GETTER
    public String getNombre()
    {
        return this.Nombre;
    }
    public String getMateria()
    {
        return Materia;
    }
    public Double getPromedio()
    {
        return (calif1+calif2+calif3+calif4+calif5)/5;
    }
    public String getAprueba_Reprueba()
    {
        Double Prom=(calif1+calif2+calif3+calif4+calif5)/5;
        if(Prom>=7)
        {
            return"aprueba la materia";
        }
        else if (Prom>=4.5 && Prom<7)
        {
            return"se quedo a supletorio";
        }
        else
        {
            return"no aprobo la materia";
        }
    }
}
    
