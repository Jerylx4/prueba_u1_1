package ec.edu.uce.modelo;

public class Matricula {

    private String materia;
    private String tipo;
    
    public Matricula(String materia, String tipo) {
        this.materia = materia;
        this.tipo = tipo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

}
