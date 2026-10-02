public class Paciente {
    String idPaciente;
    String nombre;
    int edad;
    String telefono;
    String correo;
    String direccion;

    public void mostrarInformacion() {
        System.out.println("+++++Datos del Paciente+++++");
        System.out.println("ID: " + idPaciente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Direccion: " + direccion);
    }
}