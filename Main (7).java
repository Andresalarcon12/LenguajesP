// Clase ObjetosDePersona
public class Main {
    public static void main(String[] args) {
        // Crear instancias de la clase Persona
        Persona estudiante = new Persona("Sofia", 22, "Femenino", "Estudiante de Ingeniería", true);
        Persona docente = new Persona("Juanito", 45, "Masculino", "Profesor de Matemáticas", false);
        Persona administrativo = new Persona("Sandra", 30, "Femenino", "Asistente Administrativo", false);

        // Llamar a métodos de las instancias
        estudiante.presentarse();
        docente.realizarTarea();
        administrativo.participarEnClase();  // Muestra que no es estudiante, pero puede participar

        // Llamar al método con polimorfismo
        estudiante.realizarActividad();
        docente.realizarActividad();
        administrativo.realizarActividad();

        // Mostrar datos de las instancias usando getters
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Edad del docente: " + docente.getEdad());
        System.out.println("Género del administrativo: " + administrativo.getGenero());
    }
}
