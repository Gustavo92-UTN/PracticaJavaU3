package modelos;
/* @Gustavo Apaza Huanca */
public class Usuario {
    private String nombre;
    private String apellido;
    private String curso;
    private String comision;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurso() {
        return curso;
    }

    public String getComision() {
        return comision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return getNombre() + " " + getApellido()
                + "\nCurso actual: " + getCurso()
                + "\nComision: " + getComision()
                + "\nDescripcion: " + getDescripcion();
    }
}
