public class Persona {
    private int id;
    private String nombre;
    private LocalDetaTime fechaDeNascimiento;

    public Persona(int id, String nombre, String fechaDeNascimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaDeNascimiento = fechaDeNascimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNascimiento() {
        return fechaDeNascimiento;
    }

    public void setFechaDeNascimiento(String fechaDeNascimiento) {
        this.fechaDeNascimiento = fechaDeNascimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaDeNascimiento='" + fechaDeNascimiento + '\'' +
                '}';
    }
}
