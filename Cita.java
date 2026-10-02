public class Cita {
    String idCita;
    String fecha;
    String hora;
    String motivo;
    String estado;
    Paciente paciente;

    public void mostrarCita() {
        System.out.println("+++++Datos de la Cita+++++");
        System.out.println("ID Cita: " + idCita);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Motivo: " + motivo);
        System.out.println("Estado: " + estado);
        if (paciente != null) {
            System.out.println("Paciente: " + paciente.nombre);
        }
    }
}