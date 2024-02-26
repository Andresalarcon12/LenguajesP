// Clase Persona
public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private String ocupacion;
    private boolean Estudiante;

    // Constructor
    public Persona(String nombre, int edad, String genero, String ocupacion, boolean esEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ocupacion = ocupacion;
        this.Estudiante = Estudiante;
    }

    // Método add 1
    public void presentarse() {
        System.out.println("Hola buenas, me llamo " + nombre + " y tengo " + edad + " años.");
    }

    // Método add 2
    public void realizarTarea() {
        System.out.println("Estoy realizando mi tarea como " + ocupacion);
    }

    // Metodo add 3
    public void participarEnClase() {
        if (Estudiante) {
            System.out.println("Participando en la clase como estudiante.");
        } else {
            System.out.println("No soy estudiante, pero puedo participar :)");
        }
    }

    // Método con polimorfismo
    public void realizarActividad() {
        System.out.println("Quiero expandir mi conocimiento");
      System.out.println("En todos los campos");
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public boolean Estudiante() {
        return Estudiante;
    }

    public void setEsEstudiante(boolean esEstudiante) {
        this.Estudiante = esEstudiante;
    }
}
